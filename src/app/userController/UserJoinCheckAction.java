package app.userController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import app.dao.UserBean;
import app.dao.UserDAO;

public class UserJoinCheckAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		ActionForward forward = new ActionForward();
		
		UserDAO udao = new UserDAO();
		UserBean uBean = new UserBean();
		
		uBean.setUserid(request.getParameter("userid"));
		uBean.setUsername(request.getParameter("username"));
		uBean.setUserphone(request.getParameter("userphone"));
		uBean.setUserpw(request.getParameter("userpw"));
		if (udao.join(uBean, response)!= null) {
			forward.setRedirect(true);
			forward.setPath("/login_signup.jsp");
		}
		return forward;
	}

}
