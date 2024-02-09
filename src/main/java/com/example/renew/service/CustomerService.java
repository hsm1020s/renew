package com.example.renew.service;

import com.example.renew.domain.CustDto;
import com.example.renew.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerMapper customerMapper;


    public CustomerService(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public List<CustDto> findAll(){
        return customerMapper.findAll();
    }
}
