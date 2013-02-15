package cn.xysfxy.user.service;

import java.util.List;
import java.util.Map;

import cn.xysfxy.base.business.service.BaseService;
import cn.xysfxy.user.vo.UserVO;

public interface IUserService extends BaseService {
	List<UserVO> queryUser(Map<String,Object> prams);
}
