package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testeSeIgualADois() {
		int a = 1+1;
		
		assertEquals(2,a);
	}
	
	@Test
	void testeSeIgualATres() {
		int x = 2+10-9;
		assertEquals(3,x);
	}

}