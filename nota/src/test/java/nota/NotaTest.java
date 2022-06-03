package nota;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void inicializacionTest() {
		Nota n1 = new Nota(4);
		assertNotNull(n1);
	}

	@Test
	public void obtenerValorTest() {
		Nota n1 = new Nota(4);
		int esperado = 4;
		int obtenido = n1.getValor();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void aprobado4Test() {
		Nota n1 = new Nota(4);
		assertTrue(n1.aprobado());
	}

	@Test
	public void aprobado10Test() {
		Nota n1 = new Nota(10);
		assertTrue(n1.aprobado());
	}

	@Test
	public void desAprobado2Test() {
		Nota n1 = new Nota(2);
		assertTrue(n1.desaprobado());
	}

	@Test
	public void desAprobado0Test() {
		Nota n1 = new Nota(0);
		assertTrue(n1.desaprobado());
	}

	@Test
	public void recuperaYsubeNotaTest() {
		Nota n1 = new Nota(2);
		assertTrue(n1.desaprobado());
		n1.recuperar(8);
		assertEquals(8, n1.getValor());
		assertTrue(n1.aprobado());
	}

	@Test
	public void recuperaYnoSubeNotaTest() {
		Nota n1 = new Nota(5);
		n1.recuperar(2);
		assertEquals(5, n1.getValor());
		assertTrue(n1.aprobado());
	}

	@Test(expected = Error.class)
	public void valorIncorrectoTest() {
		Nota n1 = new Nota(12);
	}

}
