import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfiiliTest {
	Profiili profiili;
	Profiili profiili1;
	Profiili profiili2;
	Profiili profiili3;
	Profiili profiili4;
	Profiili profiili5;

	@Before
	public void setUp() throws Exception {
		profiili = new Profiili("Henkilo", 40);
		profiili1 = new Profiili("opiskelija", 40);
		profiili2 = new Profiili("Elakelainen", 80);
		profiili3 = new Profiili("Tyoton", 32);
		profiili4 = new Profiili("Henkilo", 69);
		profiili5 = new Profiili("Henkilo", 5);
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
		profiili2.getAlennusProsentti();
		assertEquals(0, profiili.getAlennusProsentti(), 0.000001);
		assertEquals(40, profiili2.getAlennusProsentti(), 0.000001);
		assertEquals(60, profiili3.getAlennusProsentti(), 0.000001);
		assertEquals(40, profiili4.getAlennusProsentti(), 0.000001);
		assertEquals(50, profiili5.getAlennusProsentti(), 0.000001);

	}

	@Test
	public void getAlennusOpiskelija() {
		profiili1.getAlennusProsentti();
		assertEquals(25.0, profiili1.getAlennusProsentti(), 0.00001);
	}

}
