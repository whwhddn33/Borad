package app.userController;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import action.Action;
import action.ActionForward;
import app.dao.UserDAO;

public class UserCheckIdAction implements Action{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		UserDAO udao = new UserDAO();
		
		System.out.println(udao.checkId());
		HttpSession session = request.getSession();
		session.setAttribute("idList", udao.checkId());
		System.out.println(session.getAttribute("idList"));
		return null;
	}
}