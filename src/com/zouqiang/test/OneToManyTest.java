package com.zouqiang.test;

import com.zouqiang.entity.Clazz;
import com.zouqiang.entity.Student;
import com.zouqiang.mapper.ClazzMapper;
import com.zouqiang.mapper.StudentMapper;
import com.zouqiang.utils.Log4j2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 邹强
 * 2018-4-3 2:01
 */
public class OneToManyTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OneToManyTest oneToManyTest = new OneToManyTest();
        //oneToManyTest.testSelectClazzById(sqlSession);
        oneToManyTest.testSelectStudentById(sqlSession);
        sqlSession.commit();
        sqlSession.close();
    }

    private void testSelectClazzById(SqlSession session) {
        ClazzMapper mapper = session.getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectClazzById(1);
        Log4j2.logger.info(clazz.getId() + " " + clazz.getCode() + " " + clazz.getName());
        List<Student> students = clazz.getStudents();
        for (Student student : students) {
            Log4j2.logger.info(student);
        }
    }

    private void testSelectStudentById(SqlSession session) {
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.selectStudentById(1);
        Log4j2.logger.info(student);
        Log4j2.logger.info(student.getClazz());
    }
}
