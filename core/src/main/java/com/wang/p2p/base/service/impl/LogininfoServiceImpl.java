package com.wang.p2p.base.service.impl;

import com.wang.p2p.base.domain.Logininfo;
import com.wang.p2p.base.mapper.LogininfoMapper;
import com.wang.p2p.base.service.ILogininfoService;
import com.wang.p2p.base.util.MD5;
import com.wang.p2p.base.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogininfoServiceImpl implements ILogininfoService{

    @Autowired
    private LogininfoMapper logininfoMapper;

    @Override
    public void register(String username, String password) {
        System.out.println("register...");
        int count=this.logininfoMapper.getCountByUsername(username);
        System.out.println(count);
        if(count<=0){
            Logininfo li=new Logininfo();
            li.setUsername(username);
            li.setPassword(MD5.encode(password));
            li.setState(Logininfo.STATE_NORMAL);
            this.logininfoMapper.insert(li);
        }else {
            throw new RuntimeException("用户名已存在");
        }
    }

    @Override
    public boolean checkUsername(String username) {
        return this.logininfoMapper.getCountByUsername(username)>0;
    }

    @Override
    public Logininfo selectById(long id) {
        return this.logininfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void login(String username, String password) {
        Logininfo current=this.logininfoMapper.login(username,MD5.encode(password));
        if(current!=null){
            UserContext.putCurrent(current);
        }else{
            throw new RuntimeException();
        }
    }
}
