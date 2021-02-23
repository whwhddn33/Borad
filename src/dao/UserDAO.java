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
		sqlsession = sqlfactory.openSession(true);
	}
	
	
	public boolean join(UserDTO user) {
		return 1==sqlsession.insert("User.join",user);
	}
//	public boolean login(String userid,String userpw) {
//	}
}













