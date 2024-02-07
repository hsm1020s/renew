package com.example.renew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class RenewApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenewApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "index"; // index.html 파일의 이름을 리턴
	}
}
