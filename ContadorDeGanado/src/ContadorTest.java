import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContadorTest {

	Contador contador;

	/**
	 * Este setup se ejecutara antes de cada @Test
	 */
	@Before
	public void setup() {
		contador = new Contador();
	}
	
	/**
	 * Este tearDown se ejecutara despues de cada @test si es necesari un annihilate
	 */
	@After
	public void tearDown() {
		contador = null;
	}

	@Test
	public void creacion() {		
		assertNotNull(contador);
	}

	@Test
	public void deberiaContar() {		
		contador.contar();
		assertEquals(1, contador.mostrar());
	}

	@Test
	public void deberiaReiniciarSinHaberContado() {
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}

	@Test
	public void deberiaReiniciarLuegoDeContar() {
		contador.contar();
		contador.reiniciar();		
		assertEquals(0, contador.mostrar());
	}

	@Test
	public void deberiaContar100Veces() {		
		for (int i = 0; i < 100; i++) {
			contador.contar();
		}
		
		assertEquals(100, contador.mostrar());
	}

}
