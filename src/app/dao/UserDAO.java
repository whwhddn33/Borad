package app.dao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.config.SqlMapConfig;

public class UserDAO {
	SqlSession sqlsession;
	SqlSessionFactory sqlfactory = SqlMapConfig.getSqlFactory();
	
	public UserDAO() {
		sqlsession = sqlfactory.openSession(true);//true => 오토커밋
	}
	
	
	public Cookie join(UserBean user,HttpServletResponse response) {
		if(sqlsession.insert("User.join",user) > 0){
			Cookie cookie = new Cookie("joinid", user.getUserid());
			cookie.setPath("/");
			response.addCookie(cookie);
			return cookie;//cookie == DB삽입완료
		}
		return null;// cookie == DB삽입 실패
	}
	
	public boolean checkId(String userid) {
		System.out.println("checkId boolean 확인 : "+(Integer)sqlsession.selectOne("User.checkId",userid));
		return 0==(Integer)sqlsession.selectOne("User.checkId",userid);
	}


	public Cookie login(UserBean user, HttpServletResponse response) {
		System.out.println("로그인메서드 진입");
		if((Integer)sqlsession.selectOne("User.login",user) == 1) {
			Cookie c = new Cookie("loginid", user.getUserid());
			response.addCookie(c);
			return c;
		}
		return null;
	}






}













