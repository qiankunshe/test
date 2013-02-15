package cn.xysfxy.login.dao;

import java.util.Map;

import cn.xysfxy.base.business.dao.IBaseDAO;
import cn.xysfxy.user.vo.UserVO;

public interface ILoginDao extends IBaseDAO{
	UserVO queryUser(Map<String,Object> prams);
}
