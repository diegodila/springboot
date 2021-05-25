import static org.junit.Assert.*;

import org.junit.Test;

public class TestSoma {

	@Test
	public void testeSomar() {
		int nro1 = 5;
	    int nro2 = 5;
	    Calculator calc= new Calculator();
	    int resultadoEsperado = 10;
	    int resultadoReal= calc.somar(nro1, nro2);
	    assertEquals(resultadoEsperado, resultadoReal);
	}

}
