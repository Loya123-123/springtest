package com.itrigger.springtest;

import com.itrigger.springtest.Bean.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringtestApplicationTests {

	@Autowired
	person  person ;
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
