package com.lightingtime.JavaLearning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class JavaLearningApplicationTests {

	@Autowired
	ApplicationContext ioc;

	@Test
	void contextLoads() {
	}

	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}
}
