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
		UserDAO udao = new UserDAO();
		
		String userid = request.getParameter("userid");
		System.out.println("UsercheckId Action userid : "+userid);
		PrintWriter out = response.getWriter();
		if (udao.checkId(userid)) {
			out.println("ok");
		}else {
			out.println("not-ok");
  		}
		return null;
	}

}