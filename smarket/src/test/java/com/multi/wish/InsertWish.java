package com.multi.wish;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.dto.WishDTO;
import com.multi.service.OrderlistService;
import com.multi.service.WishService;

@SpringBootTest
class InsertWish {
	
	@Autowired
	WishService service;

	@Test
	void contextLoads() {
		WishDTO wish = new WishDTO(0, "id04", 7, null,null);
		try {
			service.register(wish);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
