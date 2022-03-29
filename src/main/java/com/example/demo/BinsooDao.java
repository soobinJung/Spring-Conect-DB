package com.example.demo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BinsooDao{

    @Autowired
    SqlSession sqlSession;

    public List<Binsoo> getlist() {
        return sqlSession.selectList("binsoo.getlist");
    }

}