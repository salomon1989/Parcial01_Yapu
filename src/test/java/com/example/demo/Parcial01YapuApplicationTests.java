package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import parcial01.dao.Usuariodao;

@SpringBootTest
class Parcial01YapuApplicationTests {
    @Autowired
    private Usuariodao usuariodao;
	@Test
	void contextLoads() {
	  System.out.println(usuariodao.read("salomon"));
	}

}
