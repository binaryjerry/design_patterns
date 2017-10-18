package cn.itheima.mybatis.first;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itheima.mybatis.po.User;

public class MybatisTest {
	
	@Test
	public void getUserById() throws IOException{
		//1.创建sqlsessionFactoryBuilder对象
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		//2.加载配置文件
	    InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	    //3.创建sqlSessionFactory对象
	    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
	    //4.创建sqlSession对象
	    SqlSession sqlSession = sqlSessionFactory.openSession();
	    //5.使用sqlSession对象执行查询
	    User user = sqlSession.selectOne("getUserById", 10);
	    sqlSession.close();
		
	}

}
