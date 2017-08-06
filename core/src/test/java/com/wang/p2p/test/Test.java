package com.wang.p2p.test;

import com.wang.p2p.base.domain.Logininfo;
import com.wang.p2p.base.service.ILogininfoService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
    @Autowired
    private ILogininfoService logininfoService;

    @org.junit.Test
    public void test() {
        Logininfo logininfo = logininfoService.selectById(1l);
        System.out.println(logininfo.getUsername());
    }
}
