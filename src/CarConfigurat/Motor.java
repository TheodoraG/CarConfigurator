package CarConfigurat;

public class Motor implements Configurator{
	String motorType;
	double motorPrice;
	
	public Motor(String type) {
		this.motorType = type;
	}
	
	@Override
	public String configure(Car car) {
		return "Motor type: " + this.motorType + 
				" motor price: "+ this.motorPrice +
				" euro \n" + car.carConfigurations;
	}

	@Override
	public double addConfigPrice(double price) {
		if(this.motorType == "benzine")
			this.motorPrice = 300;
		else if(motorType == "diesel")
			this.motorPrice = 400;

		return price + this.motorPrice;
	}

	
	
}
