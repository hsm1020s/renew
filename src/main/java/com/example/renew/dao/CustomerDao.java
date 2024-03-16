package com.example.renew.dao;

import com.example.renew.domain.CustDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao {
    List<CustDto> findAll();
}
