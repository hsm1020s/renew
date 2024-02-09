package com.example.renew.controller;

//import com.example.renew.config.MybatisConfig;
import com.example.renew.domain.CustDto;
import com.example.renew.service.CustomerService;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
// @Import(MybatisConfig.class)
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustDto> findAll() {

        System.out.println("customerService.findAll() = " + customerService.findAll());
        return customerService.findAll();
    }
}
