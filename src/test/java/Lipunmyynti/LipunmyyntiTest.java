package Lipunmyynti;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class LipunmyyntiTest {
		Profiili profTest;
		Paasylippu lippuTest;
		Lipunmyynti lipunmyynti;
	@Before
	public void setUp() throws Exception {
		profTest=new Profiili();
		
		lipunmyynti= new Lipunmyynti();
	}

	/*@Test
	public void lisaaTilausTest() {
		profTest.setHinta(20.0);
		lippuTest= new Paasylippu();	
	lipunmyynti.lisaaTilaus(profTest,lippuTest);
	double paasyLippu = lipunmyynti.getTilaukset().get(profTest).getHinta();
	assertSame(paasyLippu, );
	
	
	
		
	}*/

	@Test
	public void laskeHintaTest() {
		
		
		fail("Not yet implemented");
	}

	
	
}
