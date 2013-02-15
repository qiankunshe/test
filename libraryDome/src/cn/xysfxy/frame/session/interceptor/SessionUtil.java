package cn.xysfxy.frame.session.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xysfxy.user.vo.UserVO;


/**
 * SessionUtil鐢ㄤ簬鍦⊿ession涓瓨鏀惧拰鎻愬彇鐢ㄦ埛鐨勫熀鏈俊鎭�
 * @author Yogi
 *
 */
public class SessionUtil {
	
	public static final String SESSION_INFO = "userInfo";
	public static final String USR_NAME = "userName";
	public static final String LOGIN_ID = "loginId";
	
	/**
	 * 鑾峰彇Session
	 * @param request
	 * @return
	 */
	public static SessionObject getSessionInfo(HttpServletRequest request){
		return (SessionObject) request.getSession(true).getAttribute(SESSION_INFO);
	}
	/**
	 * 淇濆瓨Session
	 * @param request
	 * @param response
	 * @param session
	 */
	private static void setSessionInfo(HttpServletRequest request, HttpServletResponse response, SessionObject session){
		request.getSession(true).setAttribute(SESSION_INFO, session);
		request.getSession(true).setAttribute(USR_NAME, session.getLoginName());
		request.getSession(true).setAttribute(LOGIN_ID, session.getLoginId());
	}
	
	public static void setSessionInfo(HttpServletRequest request, HttpServletResponse response, UserVO login){
		
		SessionObject session = new SessionObject();
		session.setLoginName(login.getName());
		session.setLoginTime(login.getUserID());
		
		setSessionInfo(request,response,session);
	}
	/**
	 * 鍒犻櫎Session
	 * @param request
	 */
	public static void removeSessionInfo(HttpServletRequest request){
		request.getSession(true).removeAttribute(SESSION_INFO);
		request.getSession(true).removeAttribute(USR_NAME);
		request.getSession(true).removeAttribute(LOGIN_ID);
	}
}
