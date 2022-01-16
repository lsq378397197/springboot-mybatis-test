package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {
	public static boolean flag = false;
	private List<Object> list = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello,world";
	}

	@GetMapping("/test")
	public String test(){
		flag = true;
		while (flag) {
			new HashMap<>().put("x", new Date().getTime());
		}
		return "test";
	}

	@GetMapping("stop")
	public String stop(){
		flag = false;
		return "success";
	}

	@GetMapping("oom")
	public void oom(){
		while (true) {
			list.add(new byte[1024 * 1024]);
		}
	}

	@GetMapping("oom2")
	public void oom2() throws InterruptedException {
		List<Object> list = new LinkedList<>();
		int i = 0;
		while (true) {
			i++;
			if (i % 1000 == 0) {
				TimeUnit.MILLISECONDS.sleep(10);
			}
			list.add(new Object());
		}
	}

}
