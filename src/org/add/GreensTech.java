package org.add;

public class GreensTech {
	private void greensOmr() {
		System.out.println(
				"Balamurugan Garden, Okkiam,Landmark: ICICI Bank Upstairs, Plot No.19, Old Mahabalipuram Rd, Opposite to Sankeetha hotel, Thoraipakkam, Tamil Nadu 600097");

	}

	private void GreensAdayar() {
		System.out.println("No.11, First Street,Padmanabha Nagar,Adyar, Chennai-600 020");
	}

	private void GreensTambaram() {
		System.out.println("No.1, Appa Rao colony,Tambaram,SanatoriumChennai - 600047");
	}

	private void GreensVelachery() {
		System.out.println("28, Nagendra Nagar, opposite Phoenix Market City, Velachery, Chennai, Tamil Nadu 600042");
	}

	private void GreensAnnanagar() {
		System.out.println(
				"4th floor, SDV Arcade, AB-5, 2nd Ave, AB Block, Shanthi Colony, Anna Nagar, Chennai, Tamil Nadu 600040");
	}

	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.GreensVelachery();
		g.GreensTambaram();
		g.GreensAnnanagar();
		g.GreensAdayar();
		g.greensOmr();
	}
	
	
	
}
