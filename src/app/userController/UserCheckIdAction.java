package app.userController;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import app.dao.UserDAO;

public class UserCheckIdAction implements Action{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		ActionForward forward = new ActionForward();
		UserDAO udao = new UserDAO();
		
		String userid = request.getParameter("userid");
		PrintWriter out = response.getWriter();
		if(udao.checkid(userid) != 0) out.println("pass");
		else out.print("nonpass");
		
		return null;
	}

}
