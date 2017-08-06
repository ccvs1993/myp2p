package com.wang.p2p.base.util;

import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.RequestContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wang.p2p.base.domain.Logininfo;

//用于存放用户上下文
public class UserContext {
	public static final String USER_IN_SESSION="logininfo";
	/**
	 * 反向获取request的方法，查看RequestContextListener.requestInitialized的打包过程
	 * @return
	 */
	public static HttpSession getSession(){
		return ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
	}
	
	public static void putCurrent(Logininfo current){
		getSession().setAttribute(USER_IN_SESSION, current);
	}
	
	public static Logininfo getCurrent(){
		return (Logininfo) getSession().getAttribute(USER_IN_SESSION);
	}
}
