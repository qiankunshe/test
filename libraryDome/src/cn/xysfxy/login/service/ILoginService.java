package cn.xysfxy.login.service;

import java.util.Map;

import cn.xysfxy.base.business.service.BaseService;
import cn.xysfxy.user.vo.UserVO;

public interface ILoginService extends BaseService {
	UserVO queryUser(Map<String,Object> prams);
}
