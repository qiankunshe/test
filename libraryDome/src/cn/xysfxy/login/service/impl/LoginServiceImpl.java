package cn.xysfxy.login.service.impl;

import java.util.Map;

import cn.xysfxy.base.business.service.impl.BaseServiceImpl;
import cn.xysfxy.login.dao.ILoginDao;
import cn.xysfxy.login.service.ILoginService;
import cn.xysfxy.user.vo.UserVO;

public class LoginServiceImpl extends BaseServiceImpl  implements ILoginService{
	private ILoginDao loginDAO;

	public void setLoginDAO(ILoginDao loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public UserVO queryUser(Map<String, Object> prams) {
		return loginDAO.queryUser(prams);
	}

}
