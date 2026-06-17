package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Card;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardMapper extends BaseMapper<Card> {
    void changeStatus(@Param("name") String name);
    List<Card> getAll();
}
