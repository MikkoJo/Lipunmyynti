package Lipunmyynti;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Lipunmyynti 
{

	private Map<Profiili,Paasylippu>tilaukset;
	
	public Lipunmyynti() {
		
		this.tilaukset=new HashMap<>();
	}
	
	
	
	public void lisaaTilaus(Profiili profiili, Paasylippu paasylippu) {
		
		tilaukset.put(profiili, paasylippu);
		
		
	}
	
	public Map<Profiili, Paasylippu> getTilaukset() {
		return tilaukset;
	}



	public void setTilaukset(Map<Profiili, Paasylippu> tilaukset) {
		this.tilaukset = tilaukset;
	}



	public double laskeHinta(Profiili profiili) {
		
		Paasylippu lippu=tilaukset.get(profiili);
		double hinta=profiili.muunnaHinta(lippu.getHinta());
		return hinta;
		
	}
	
	
	
}
