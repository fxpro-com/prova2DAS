import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class InfixoPosFixoTest {
	
	InfixoPosFixo infixoPosFixo;

	@Before
	public void setUp() throws Exception {
		infixoPosFixo = new InfixoPosFixo();
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("Testando");
	}

	@Test
	public void prefixofixoTest() throws Exception {
		assertEquals(2, infixoPosFixo.calculaPosFixo("4 5 7 + -"));
	}
	
	@Test
	public void infixoTest(){
		assertEquals("3 5 7 + - ", infixoPosFixo.infixo(("(3+5)-7")));
	}
	
	@Test(expected= Exception.class)
	public void testLancaException() throws Exception{
		infixoPosFixo.calculaPosFixo("a a f");
	}
	
	
	
}
