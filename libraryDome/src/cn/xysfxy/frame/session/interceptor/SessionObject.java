package cn.xysfxy.frame.session.interceptor;

public class SessionObject {
	private String loginId;
	private String loginName;
	private String roleId;
	private String roleName;
	private String orgId;
	private String orgName;
	private String loginTime;
	
	
	
	public SessionObject() {
		super();
	}



	public SessionObject(String loginId, String loginName, String roleId,
			String roleName, String orgId, String orgName, String loginTime) {
		super();
		this.loginId = loginId;
		this.loginName = loginName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.orgId = orgId;
		this.orgName = orgName;
		this.loginTime = loginTime;
	}



	public String getLoginId() {
		return loginId;
	}



	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}



	public String getLoginName() {
		return loginName;
	}



	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	public String getRoleId() {
		return roleId;
	}



	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}



	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}



	public String getOrgId() {
		return orgId;
	}



	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}



	public String getOrgName() {
		return orgName;
	}



	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}



	public String getLoginTime() {
		return loginTime;
	}



	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}



	
	
}
