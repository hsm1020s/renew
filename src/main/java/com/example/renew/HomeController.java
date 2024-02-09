package com.example.renew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller // 컨트롤러로 동작하게 할 어노테이션 추가
public class HomeController {

	public static void main(String[] args) {
		SpringApplication.run(HomeController.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "index"; // 정적 리소스(예: templates 폴더 아래의 index.html)를 반환
	}
}
