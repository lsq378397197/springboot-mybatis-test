package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.UserLog;
import com.example.demo.mapper.UserLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class SpringbootDemoApplicationTests {

	@Autowired
	private UserLogMapper userLogMapper;

	@Test
	public void testSelect() {
		List<UserLog> users = userLogMapper.selectList(null);
		System.out.println(users);
	}

	@Test
	public void testQueryAllUserLogs() {
		List<UserLog> userLogs = userLogMapper.queryAllUserLogs();
		System.out.println(userLogs);
		log.info("userLogs={}", JSON.toJSONString(userLogs,true));
	}

}
