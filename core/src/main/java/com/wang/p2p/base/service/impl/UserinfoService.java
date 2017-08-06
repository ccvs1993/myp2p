package com.wang.p2p.base.service.impl;

import com.wang.p2p.base.domain.Userinfo;
import com.wang.p2p.base.mapper.UserinfoMapper;
import com.wang.p2p.base.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoService implements IUserinfoService{
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public void update(Userinfo userinfo) {
        int ret = this.userinfoMapper.updateByPrimaryKey(userinfo);
        if(ret==0){
            throw new RuntimeException("乐观锁失败,Userinfo: "+userinfo.getId());
        }
    }
}
