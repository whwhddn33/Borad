package dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.UserDTO;
import mybatis.config.SqlMapConfig;

public class UserDAO {
	SqlSession sqlsession;
	SqlSessionFactory sqlfactory = SqlMapConfig.getSqlFactory();
	
	public UserDAO() {
		sqlsession = sqlfactory.openSession(true);//true => 오토커밋
	}
	
	
	public void join(UserDTO user) {
		sqlsession.insert("User.join",user);
	}
	
	public void idCheck(UserDTO userid) {
		sqlsession.selectOne("UserDTO.getUserid");
	}
//	public boolean login(String userid,String userpw) {
//	}
}













