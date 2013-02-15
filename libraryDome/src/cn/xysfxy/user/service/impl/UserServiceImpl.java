package cn.xysfxy.user.service.impl;

import java.util.List;
import java.util.Map;

import cn.xysfxy.base.business.service.impl.BaseServiceImpl;
import cn.xysfxy.user.dao.IUserDao;
import cn.xysfxy.user.service.IUserService;
import cn.xysfxy.user.vo.UserVO;

public class UserServiceImpl extends BaseServiceImpl  implements IUserService{
	private IUserDao userDAO;

	public IUserDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDao userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<UserVO> queryUser(Map<String, Object> prams) {
		return userDAO.queryUser(prams);
	}

}
