package app.userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.ActionForward;
@WebServlet("*.User")
public class UserFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request);
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request);
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("변수확인");
		System.out.println("requestURI : "+requestURI);
		System.out.println("contextPath : "+contextPath);
		System.out.println("command 확인 : "+ requestURI);
		System.out.println("command substring 확인 : "+ requestURI.substring(contextPath.length()));
		
		ActionForward forward = null;
		
		if (command.equals("/userController/UserJoinCheck.User")) {
			try {
				forward = new UserJoinCheckAction().execute(request,response);
			} catch (Exception e) {
				System.out.println("usercontroller error"+e);
			}
		}else if (command.equals("/userController/UserCheckId.User")) {
			try {
				System.out.println("}else if (command.equals(\"/userController/UserCheckId.User\")) { 진입");
				forward = new UserCheckIdAction().execute(request, response);
			} catch (Exception e) {
				System.out.println(e);
			}
		}else if (command.equals("/userController/UserLogin.User")) {
			try {
				System.out.println("userLogin컨트롤러 진입");
				forward = new UserLoginAction().execute(request, response);
			} catch (Exception e) {
				System.out.println(e);
			}
		}else{
			System.out.println("컨트롤러 진입실패");
			forward = new ActionForward();
			forward.setPath("/app/error/404.jsp");
			forward.setRedirect(false);
		}
		
		if(forward!=null) {
			if(forward.isRedirect()) {
				//redirect 방식
				response.sendRedirect(forward.getPath());
			}else {
				//forward 방식
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

}
