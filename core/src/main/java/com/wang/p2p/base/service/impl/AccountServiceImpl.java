package com.wang.p2p.base.service.impl;

import com.wang.p2p.base.domain.Account;
import com.wang.p2p.base.mapper.AccountMapper;
import com.wang.p2p.base.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void update(Account account) {
        int ret = this.accountMapper.updateByPrimaryKey(account);
        if(ret==0)
            throw new RuntimeException("乐观锁失败，Account: "+account.getId());
    }
}
