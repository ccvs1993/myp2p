package com.wang.p2p.base.controller;
/**
 * 登录/注册相关
 */

import com.wang.p2p.base.service.ILogininfoService;
import com.wang.p2p.base.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
        @Autowired
        private ILogininfoService logininfoService;

        //用户登录
        @RequestMapping("register")
        @ResponseBody
        public JSONResult register(String username,String password){
            JSONResult json=new JSONResult();
            try {
                this.logininfoService.register(username, password);
            } catch (RuntimeException e) {
                json.setMsg(e.getMessage());
                json.setSuccess(false);
            }
            return json;
        }

        //检查用户名是否存在
        @RequestMapping("checkUsername")
        @ResponseBody
        public Boolean checkUsername(String username){
            return !this.logininfoService.checkUsername(username);
        }

        @RequestMapping("login")
        @ResponseBody
        public JSONResult login(String username,String password){
            JSONResult json=new JSONResult();
            try {
                this.logininfoService.login(username,password);
            }catch (RuntimeException e){
                json.setMsg("用户名或密码错误");
                json.setSuccess(false);
            }
            return json;
        }

}
