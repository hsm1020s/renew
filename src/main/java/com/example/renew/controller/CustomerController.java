package com.example.renew.controller;

import com.example.renew.dao.CustomerDaoImpl;
import com.example.renew.domain.CustDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Controller
@RequestMapping("/customers")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    //private final CustomerService customerService;
    private  final CustomerDaoImpl customerDao;

    @GetMapping
    public String findAll(Model model) {
        List<CustDto> customerList = customerDao.findAll();
        model.addAttribute("customers", customerList);

        log.info("customerService.findAll() = {}", customerList);
        return "customers";
    }
}
