package cn.xysfxy.frame.session.interceptor;

import java.util.Map;

import cn.xysfxy.login.action.LoginAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizationInterceptor extends AbstractInterceptor {
 
    public String intercept(ActionInvocation invocation) throws Exception {
       
        Map<String, Object> session = invocation.getInvocationContext().getSession();
        SessionObject userInfo = (SessionObject)session.get("userInfo");
       
        Action action = (Action) invocation.getAction();  
        if (action instanceof LoginAction) {  
            return invocation.invoke();
        }
        if (null != userInfo && !"".equals(userInfo)) {
            return invocation.invoke();
        } else {
            return Action.LOGIN;
        }
    }
}