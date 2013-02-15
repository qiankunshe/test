package cn.xysfxy.login.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import cn.xysfxy.frame.session.interceptor.SessionUtil;
import cn.xysfxy.login.service.ILoginService;
import cn.xysfxy.user.vo.UserVO;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userName;
	private String userPassWrod;

	private ILoginService loginService;

	private int stauts = -1;
	private String url;
	private String errorMag;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3979262800648926457L;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String login(){
		Map<String, Object> prams = new HashMap<String, Object>();
		prams.put("userName", userName);
		prams.put("userPassWrod", userPassWrod);
		UserVO user = loginService.queryUser(prams);
		if (user != null) {
			stauts = 0;
			url = "/jsp/main.jsp";
			SessionUtil.setSessionInfo(ServletActionContext.getRequest(), ServletActionContext.getResponse(), user);
		} else {
			errorMag = "√‹¬ÎªÚ’Àªß¥ÌŒÛ";
		}
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassWrod() {
		return userPassWrod;
	}

	public void setUserPassWrod(String userPassWrod) {
		this.userPassWrod = userPassWrod;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	public int getStauts() {
		return stauts;
	}

	public String getUrl() {
		return url;
	}

	public String getErrorMag() {
		return errorMag;
	}

}
