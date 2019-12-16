package CarConfigurat;

public class MainClass {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(30000.00);
		sedan1.joinConfigurator(new Motor("benzine"));
		sedan1.joinConfigurator(new Color("white"));
		
		System.out.println("Sedan1 - pret: "+ sedan1.getPrice());
		System.out.println("Sedan1 - configurations: "+ sedan1.getConfigSelected());	
				
	}

}
