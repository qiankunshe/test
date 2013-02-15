package cn.xysfxy.user.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.xysfxy.user.service.IUserService;
import cn.xysfxy.user.vo.UserVO;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 936736379722846051L;

	private int page;
	private int pagesize;
	
	private Map<Object,Object> result;

	private String userName;
	
	private IUserService userService;

	@Override
	public String execute() {

		return SUCCESS;
	}

	public String queryUser() {
		System.out.println(page);
		System.out.println(pagesize);
		try {
			Map<String,Object> prams = new HashMap<String, Object>();
			prams.put("skipResults", page*pagesize);
			prams.put("maxResults", pagesize);
			
			result = new HashMap<Object, Object>();
			List<UserVO> results= userService.queryUser(prams);
			result.put("Rows", results);
			result.put("Total", 11);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public Map<Object, Object> getResult() {
		return result;
	}

	public void setResult(Map<Object, Object> result) {
		this.result = result;
	}

}
