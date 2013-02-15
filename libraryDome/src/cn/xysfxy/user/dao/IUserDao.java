package cn.xysfxy.user.dao;

import java.util.List;
import java.util.Map;

import cn.xysfxy.base.business.dao.IBaseDAO;
import cn.xysfxy.user.vo.UserVO;

public interface IUserDao extends IBaseDAO{
	List<UserVO> queryUser(Map<String,Object> prams);
}
