package com.kartik.authorizationmicroservice.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kartik.authorizationmicroservice.model.JwtResponse;

@SpringBootTest
public class JwtResponseTest {
	
	private JwtResponse jwtResArg;
	@BeforeEach
	void setUp() throws Exception
	{
		jwtResArg = new JwtResponse("token");
	}
	
	@Test
	void test()
	{
		assertThat(jwtResArg.getToken().equals("token"));
	}

}
