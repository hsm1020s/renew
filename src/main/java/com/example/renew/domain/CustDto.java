package com.example.renew.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustDto {
    private String custId;
    private String pwd;
    private String name;
    private String mpNo;
    private String custTp;
    private String grade;
    private String stus;
    private String rcmdr;
    private Date birth;
    private String email;
    private LocalDateTime regDate;
    private String acno;
    private LocalDateTime lginDttm;
    private String gender;
    private String regn;
    private LocalDateTime fstReg;
    private String fstRegr;
    private LocalDateTime lastUpd;
    private String lastUpdr;
    private String pwd2;
    private String sms;
    // 클래스의 나머지 부분
}
