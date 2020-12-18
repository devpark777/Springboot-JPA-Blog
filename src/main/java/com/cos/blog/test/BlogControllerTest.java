package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //스프링이 com.cos.blog 패키지 이하를 스캔해서 빈 등록
@RestController
public class BlogControllerTest {
    
	@GetMapping("/test/hello") // ===> http://localhost:8080/hello
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
