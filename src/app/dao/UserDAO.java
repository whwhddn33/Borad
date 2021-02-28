package app.dao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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
//		sqlsession.insert("User.join",user);
		if(sqlsession.insert("User.join",user) > 0){
			Cookie cookie = new Cookie("joinid", user.getUserid());
			cookie.setPath("/");
			response.addCookie(cookie);
			return cookie;//cookie == DB삽입완료
		}
		return null;// cookie == DB삽입 실패
	}
	
	public int checkid(String userid) {
		int result = (Integer)sqlsession.selectOne(userid); 
		return result; 
	}
//	public boolean login(String userid,String userpw) {
//	}
}













