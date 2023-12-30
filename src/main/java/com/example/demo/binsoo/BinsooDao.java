package com.example.demo.binsoo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BinsooDao{

    @Autowired
    private SqlSession sqlSession;

    public List<BinsooVO> getlist() {
        return sqlSession.selectList("binsoo.getList");
    }

}