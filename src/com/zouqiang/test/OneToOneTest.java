package com.zouqiang.test;

import com.zouqiang.entity.Person;
import com.zouqiang.mapper.PersonMapper;
import com.zouqiang.utils.Log4j2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 邹强
 * 2018-4-3 10:06
 */
public class OneToOneTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.selectPersonById(1);
        Log4j2.logger.info(person);
        Log4j2.logger.info(person.getCard());
        sqlSession.commit();
        sqlSession.close();
    }
}
