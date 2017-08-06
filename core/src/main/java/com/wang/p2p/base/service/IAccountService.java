package com.wang.p2p.base.service;

import com.wang.p2p.base.domain.Account;

/**
 * 账户相关服务
 */
public interface IAccountService {
    //写完mapper之后立即写service，因为这个update是支持乐观锁的
    void update(Account account);
}
