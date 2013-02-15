package cn.xysfxy.login.dao.impl;

import java.util.Map;

import cn.xysfxy.base.business.dao.impl.BaseDAOImpl;
import cn.xysfxy.login.dao.ILoginDao;
import cn.xysfxy.user.vo.UserVO;

public class LoginDaoImpl extends BaseDAOImpl implements ILoginDao {

	@Override
	public UserVO queryUser(Map<String, Object> parms) {
		
		return (UserVO) queryOject("userMap.queryLogin", parms);
	}
	
}
