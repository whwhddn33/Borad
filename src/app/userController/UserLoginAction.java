package app.userController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.ActionForward;
import app.dao.UserBean;
import app.dao.UserDAO;

public class UserLoginAction implements Action{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		ActionForward forward = new ActionForward();
		
		UserDAO udao = new UserDAO();
		UserBean uBean = new UserBean();
		
		uBean.setUserid(request.getParameter("id"));
		uBean.setUserpw(request.getParameter("password"));
		System.out.println(uBean.getUserid());
		System.out.println(uBean.getUserpw());
		System.out.println("로그인엑션 진입");
		System.out.println(udao.login(uBean, response));
		if(udao.login(uBean, response) != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginid", uBean.getUserid());
			System.out.println(session.getAttribute("loginid"));
			session.setAttribute("loginpw", uBean.getUserpw());
			System.out.println(session.getAttribute("loginpw"));
			forward.setRedirect(true);
			forward.setPath("/main.jsp");
		}
		return forward;
	}

}
