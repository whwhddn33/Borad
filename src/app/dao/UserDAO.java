package app.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

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
	
	public List<String> checkId() {
		System.out.println("List<String> checkId() 진입");
		List<String> idList = sqlsession.selectList("User.checkId");
		System.out.println(idList);
		return idList;
		
		
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













