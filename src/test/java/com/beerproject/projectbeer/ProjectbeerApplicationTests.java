package com.beerproject.projectbeer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.beerproject.projectbeer.controllers.BeerController;

@SpringBootTest
class ProjectbeerApplicationTests {

	BeerController controller = new BeerController();

	@Test
	void contextLoads() {
	}

	@Test
	public void testController() {
		assertEquals("200", controller.findAll());
	}

}
