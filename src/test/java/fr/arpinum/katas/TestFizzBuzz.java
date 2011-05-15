package fr.arpinum.katas;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

	private String[] nombres;

	@Before
	public void avant() {
		nombres = new FizzBuzz().nombres();
	}

	@Test
	public void peutObtenirLesNombres() {
		assertThat(nombres, notNullValue());
		assertThat(nombres.length, is(101));
	}

	@Test
	public void peutObtenirLesNombresSimples() {
		assertThat(nombres[1], is("1"));
		assertThat(nombres[2], is("2"));
		assertThat(nombres[98], is("98"));
	}

	@Test
	public void peutObtenirFizz() {
		assertThat(nombres[3], is("fizz"));
		assertThat(nombres[6], is("fizz"));
		assertThat(nombres[99], is("fizz"));
	}

	@Test
	public void peutObtenirBuzz() {
		assertThat(nombres[5], is("buzz"));
		assertThat(nombres[10], is("buzz"));
		assertThat(nombres[100], is("buzz"));
	}

	@Test
	public void peutObtenirFizzBuzz() {
		assertThat(nombres[15], is("fizzbuzz"));
	}
}
