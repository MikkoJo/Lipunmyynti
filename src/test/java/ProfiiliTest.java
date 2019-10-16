import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProfiiliTest {
	Profiili profiili;
	Profiili profiili1;

	@Before
	public void setUp() throws Exception {
		profiili =new Profiili("Henkilo", 40);
		profiili1 =new Profiili("opiskelija", 40);
	}

	@Test
	public void getIkaTest() {
		profiili.getIka();
		assertEquals(40, profiili.getIka());
	}
	@Test
	public void getNimiTest() {
		profiili.getStatus();
		assertEquals("Henkilo", profiili.getStatus());
	}
	@Test
	public void getAlennus() {
		profiili.getAlennusProsentti();
		assertEquals(0, profiili.getAlennusProsentti(), 0.000001);
	}
	@Test
	public void getAlennusOpiskelija() {
		profiili1.getAlennusProsentti();
		assertEquals(25.0, profiili1.getAlennusProsentti(),0.00001);
	}

}
