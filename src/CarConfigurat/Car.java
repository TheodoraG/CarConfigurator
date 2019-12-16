package CarConfigurat;

/*
 * Clasa abstracta din care se deriveaza 5 clase: Coupe, Sedan, Suv, Break, Hatchback. 
 * Pentru crearea Bridge-ului dintre clasa Car si interfata Configurator, clasa Car
 * are un membru de tip protected, un arrayList, numit configurations.
 * Metoda joinConfigurator adauga o optiune in arrayListul de configuratii.
 * Metoda getPrice calculeaza pretul final al tuturor configuratiilor.
 * Metoda getConfigSelected afiseaza optiunile alese de utilizator.
 */

import java.util.ArrayList;

public abstract class Car {
	protected ArrayList<Configurator> configurations = new ArrayList<Configurator>();
	double carPrice;
	String carConfigurations ="";
	
	public boolean joinConfigurator(Configurator configurator){
		return configurations.add(configurator);
	}
	
	abstract double getPrice();
	
	abstract String getConfigSelected();

}
