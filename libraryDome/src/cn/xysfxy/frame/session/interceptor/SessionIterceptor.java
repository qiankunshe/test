package cn.xysfxy.frame.session.interceptor;  
  
import java.util.Map;

import cn.xysfxy.login.action.LoginAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
  
public class SessionIterceptor extends AbstractInterceptor {  
  
    @Override  
    public String intercept(ActionInvocation actionInvocation) throws Exception {  
    	Map session = actionInvocation.getInvocationContext().getSession();
        SessionObject userInfo = (SessionObject)session.get("userInfo");
       
        Action action = (Action) actionInvocation.getAction();  
        if (action instanceof LoginAction) {  
            return "loginTrue";  
        }
        if (null != userInfo && !"".equals(userInfo)) {
            return "loginTrue";
        } else {
            return Action.LOGIN;
        }
    }  
  
} 