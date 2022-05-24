package com.ankit.springdockerdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerDemoApplicationTests {

	@Test
	void test1() {
		Assertions.assertEquals(4,4);
	}

}
