package cn.xysfxy.user.dao.impl;

import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import cn.xysfxy.base.business.dao.impl.BaseDAOImpl;
import cn.xysfxy.user.dao.IUserDao;
import cn.xysfxy.user.vo.UserVO;

public class UserDaoImpl extends BaseDAOImpl implements IUserDao {

	@Override
	public List<UserVO> queryUser(Map<String, Object> parms) {
		
		return queryList("userMap.queryUser", parms, (Integer)parms.get("skipResults"), (Integer)parms.get("maxResults"));
	}
	
}
