package CarConfigurat;

public class Tehnologies implements Configurator{

	Boolean navigation;
	Boolean bluetooth ;
	Boolean cruiseControl;
	
	double navigationPrice;
	double bluetoothPrice;
	double cruiseControlPrice;
	
	
	public Tehnologies(Boolean navigationToChoose, Boolean bluetoothToChoose,Boolean cruiseControlToChoose) {
		this.navigation=navigationToChoose;
		this.bluetooth=bluetoothToChoose;
		this.cruiseControl=cruiseControlToChoose;
	}
	
	@Override
	public String configure(Car car) {
		return "Navigation: " + this.navigation + 
				" navigation price: " + this.navigationPrice+
				" euro ,Bluetooth: " + this.bluetooth + 
				" Bluetooth price: " + this.bluetoothPrice +
				" euro ,CruiseControl: " + this.cruiseControl + 
				" CruiseControl price: " + this.cruiseControlPrice +
				" euro \n"+ car.carConfigurations;
	}

	@Override
	public double addConfigPrice(double price) {
		if(this.navigation)
			this.navigationPrice=199.00;
		else
			this.navigationPrice=0;
		
		if(this.bluetooth)
			this.bluetoothPrice=199.00;
		else
			this.bluetoothPrice=0;
		
		if(this.cruiseControl)
			this.cruiseControlPrice=199.00;
		else
			this.cruiseControlPrice=0;
		
		return price + this.navigationPrice +this.bluetoothPrice + this.cruiseControlPrice;
	}
	
}
