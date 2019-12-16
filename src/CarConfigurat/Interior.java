package CarConfigurat;

public class Interior implements Configurator {

	String colorI;
	String material;
	double colorPrice;
	double materialPrice;
	
	public Interior(String colorToChoose, String materialToChose) {
		this.colorI = colorToChoose;
		this.material=materialToChose;
	}
	
	@Override
	public String configure(Car car) {
		return "Color: " + this.colorI + 
				" color price: " + this.colorPrice+
				" euro " +"Material: " + this.material + 
				" material price: " + this.materialPrice +
				" euro \n"+ car.carConfigurations;
	}

	@Override
	public double addConfigPrice(double price) {
		if(this.colorI == "black" && this.material == "polyester")
		{
			this.materialPrice=99.99;
			this.colorPrice = 29.99;
		}
		else if(this.colorI == "white"&& this.material=="leather")
		{
			this.materialPrice=199.99;
			this.colorPrice = 50.00;
		}
		return price + this.colorPrice+this.materialPrice;
	}
	
}
