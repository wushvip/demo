package com.chinamobile.rt.ws.bdoc_demo;

import com.chinamobile.rt.ws.bdoc_demo.service.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdocDemoApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void testSPI(){
		ServiceLoader<Animal> animalLoader = ServiceLoader.load(Animal.class);
		for(Animal loader:animalLoader){
			System.out.println(loader);
			System.out.println(loader.eat());
			System.out.println(loader.say());
		}
	}
}
