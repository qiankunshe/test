package cn.xysfxy.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import cn.xysfxy.base.util.FreemarkerUtil;

import com.opensymphony.xwork2.ActionSupport;


public class TemplateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3027098675783064040L;
	
	private String str;
	
	@Override
	public String execute() throws Exception {
		if(str == null)
		{
			str = "";
		}
		Map<String,String> parms  = new HashMap<String, String>();
		parms.put("str", str);
		FreemarkerUtil.crateHTML(ServletActionContext.getServletContext(), parms, "test.ftl", "test.html");
		return SUCCESS;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
