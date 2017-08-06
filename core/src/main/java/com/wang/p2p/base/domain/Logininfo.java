package com.wang.p2p.base.domain;

/**
 * 用户登录信息
 */
public class Logininfo extends BaseDomain{

    public static final int STATE_NORMAL=0;//正常
    public static final int STATE_LOCK=1;//锁定

    private String username;
    private String password;
    private int state;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
}
