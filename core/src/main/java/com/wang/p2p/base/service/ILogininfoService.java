package com.wang.p2p.base.service;

import com.wang.p2p.base.domain.Logininfo;

public interface ILogininfoService {
    //用户注册
    void register(String username,String password);

    boolean checkUsername(String username);

    Logininfo selectById(long id);

    void login(String username, String password);
}
