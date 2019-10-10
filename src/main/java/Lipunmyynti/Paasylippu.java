package Lipunmyynti;



public class Paasylippu {
	
	private double hinta;
	private String pvm;
	

	public Paasylippu(double hinta, String pvm) {
		this.hinta = hinta;
		this.pvm = pvm;
	}
	public Paasylippu() {
		
	}

	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public String getPvm() {
		return pvm;
	}
	public void setPvm(String pvm) {
		this.pvm = pvm;
	}
	

	
	
	
}
