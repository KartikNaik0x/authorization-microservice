package com.kartik.authorizationmicroservice.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kartik.authorizationmicroservice.model.JwtRequest;

@SpringBootTest
public class JwtRequestTest {
	
	private JwtRequest jwtReqAllArg = new JwtRequest("admin", "password");
	
	@Test
	void testUserNameGetter()
	{
		assertThat(jwtReqAllArg.getUsername().equals("admin")).isTrue();
	}

}
