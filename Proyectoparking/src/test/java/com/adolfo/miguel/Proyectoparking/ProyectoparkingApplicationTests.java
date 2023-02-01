package com.adolfo.miguel.Proyectoparking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.adolfo.miguel.Proyectoparking.pool.pool;
import com.adolfo.miguel.Proyectoparking.user.user;

@SpringBootTest
class ProyectoparkingApplicationTests {

	@Test
	public void check_pool() {
	
		pool sorteo = new pool(10);

		int expected = sorteo.pool;

		int[] actual = sorteo.setSorteo(10);


		assertEquals(expected,actual);
	
	
	}

	public void check_user(){


		user miguel = new user("Blanco", "Fernandez", "Miguel", "Administrador");

		String expected = miguel.getApellido1();

		String actual = miguel.getApellido2();

		assertEquals(expected, actual);

	}

}
