package CarConfigurat;

public class Suv extends Car {

	public Suv(double price) {
		this.carPrice = price;
	}
	
	@Override
	double getPrice() {
		if(configurations != null){
			for(Configurator configurator: configurations)
				this.carPrice = configurator.addConfigPrice(this.carPrice);
		}
		return this.carPrice ;
	}


	String getConfigSelected() {
		//String config = "";
		if(configurations != null)
			for(Configurator configurator: configurations)
				this.carConfigurations =  configurator.configure(this);
		else
			this.carConfigurations = "No configuration";
		return this.carConfigurations;
	}
	
	
}
