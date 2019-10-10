package Lipunmyynti;

public class Profiili {
	private String status;
	private double alennusProsentti;
	private double hinta;
	
	
	public Profiili() {
		alennusProsentti = 15;
	}
	
	public String getStatus() {
		return status;
	}
	
	public double getHinta() {
		return this.hinta;
	}
	public void setHinta(double hinta) {
		this.hinta=hinta;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getAlennusProsentti() {
		return alennusProsentti;
	}
	
	public void setAlennusProsentti(double alennusProsentti) {
		this.alennusProsentti = alennusProsentti;
	}
	
	public double muunnaHinta(double alkuperainenHinta) {
		return alkuperainenHinta * (100.0 - alennusProsentti) / 100.0; 
	}
	

}
