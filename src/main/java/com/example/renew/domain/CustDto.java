package com.example.renew.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Setter
@Getter
public class CustDto {
    private String custId; // 회원아이디1
    private String pwd; // 회원비밀번호2
    private String name; // 이름3
    private String mpNo; // 핸드폰번호4
    private String custTp; // 회원유형5
    private String grade; // 회원등급코드6
    private String stus; // 회원상태7
    private String rcmdr; // 추천인아이디8
    private Date birth; // 생년월일9 생일
    private String email; // 이메일10
    private LocalDateTime regDate; // 회원가입일시11
    private String acno; // 계좌번호12
    private LocalDateTime  lginDttm; // 최근로그인일자13
    private String gender; // 성별  --이거로 바뀜14
    private String regn; // 지역15
    private LocalDateTime  fstReg; // 최초등록일시16
    private String fstRegr; // 최초등록자식별번호17
    private LocalDateTime  lastUpd; // 최종수정일시18
    private String lastUpdr; // 최종수정자식별번호19
    private String pwd2 ;
    private String sms;


    public CustDto(){}

    public CustDto(String custId, String pwd, String name, String mpNo, String custTp, String grade, String stus, String rcmdr, Date birth, String email, LocalDateTime regDate, String acno, LocalDateTime lginDttm, String gender, String regn, LocalDateTime fstReg, String fstRegr, LocalDateTime lastUpd, String lastUpdr, String pwd2, String sms) {
        this.custId = custId;
        this.pwd = pwd;
        this.name = name;
        this.mpNo = mpNo;
        this.custTp = custTp;
        this.grade = grade;
        this.stus = stus;
        this.rcmdr = rcmdr;
        this.birth = birth;
        this.email = email;
        this.regDate = regDate;
        this.acno = acno;
        this.lginDttm = lginDttm;
        this.gender = gender;
        this.regn = regn;
        this.fstReg = fstReg;
        this.fstRegr = fstRegr;
        this.lastUpd = lastUpd;
        this.lastUpdr = lastUpdr;
        this.pwd2 = pwd2;
        this.sms = sms;
    }

    @Override
    public String toString() {
        return "CustDto{" +
                "custId='" + custId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", mpNo='" + mpNo + '\'' +
                ", custTp='" + custTp + '\'' +
                ", grade='" + grade + '\'' +
                ", stus='" + stus + '\'' +
                ", rcmdr='" + rcmdr + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                ", acno='" + acno + '\'' +
                ", lginDttm=" + lginDttm +
                ", gender='" + gender + '\'' +
                ", regn='" + regn + '\'' +
                ", fstReg=" + fstReg +
                ", fstRegr='" + fstRegr + '\'' +
                ", lastUpd=" + lastUpd +
                ", lastUpdr='" + lastUpdr + '\'' +
                ", pwd2='" + pwd2 + '\'' +
                ", sms='" + sms + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustDto dto = (CustDto) o;
        return Objects.equals(custId, dto.custId) && Objects.equals(pwd, dto.pwd) && Objects.equals(name, dto.name) && Objects.equals(mpNo, dto.mpNo) && Objects.equals(custTp, dto.custTp) && Objects.equals(grade, dto.grade) && Objects.equals(stus, dto.stus) && Objects.equals(rcmdr, dto.rcmdr) && Objects.equals(email, dto.email) && Objects.equals(acno, dto.acno) && Objects.equals(gender, dto.gender) && Objects.equals(regn, dto.regn) && Objects.equals(fstRegr, dto.fstRegr) && Objects.equals(lastUpdr, dto.lastUpdr) && Objects.equals(pwd2, dto.pwd2) && Objects.equals(sms, dto.sms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, pwd, name, mpNo, custTp, grade, stus, rcmdr, email, acno, gender, regn, fstRegr, lastUpdr, pwd2, sms);
    }

}
