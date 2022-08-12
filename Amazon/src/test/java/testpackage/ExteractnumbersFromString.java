package testpackage;

public class ExteractnumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="asedfiaerAcfcue123jnsd84804";
		
		String numbersOnly=given.replaceAll("[a-z & A-Z]","");
		
		System.out.println(numbersOnly);
		

	}

}
