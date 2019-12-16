package CarConfigurat;

public class Color implements Configurator{
	String color;
	double colorPrice;
	
	public Color(String colorToChoose) {
		this.color = colorToChoose;
	}
	
	@Override
	public String configure(Car car) {
		return "Color: " + this.color + 
				" color price: " + this.colorPrice+
				" euro \n" + car.carConfigurations;
	}

	@Override
	public double addConfigPrice(double price) {
		if(this.color == "blue" || this.color == "gray" || this.color == "black")
			this.colorPrice = 259.99;
		else if(this.color == "white")
			this.colorPrice = 0;

		return price + this.colorPrice;
	}

}

