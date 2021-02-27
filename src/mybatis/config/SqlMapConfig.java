package mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory sqlFactory;
	
	static {
		try {
			String resource = "/mybatis/config/config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static SqlSessionFactory getSqlFactory() {
		return sqlFactory;
	}
}
