package Lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfiiliTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void setHintaTest() {
		Profiili profiili=new Profiili();
		 profiili.setHinta(20.0);
		 double kuku= profiili.getHinta();
		assertEquals(kuku, 20.0, 0.001);
	}

}
