package com.example.renew.dao;

import com.example.renew.domain.CustDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    private final CustomerDao customerDao;

    public CustomerDaoImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<CustDto> findAll(){
        return CustomerDao.findAll();
    }
}
