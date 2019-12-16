package CarConfigurat;

/*
 * Prin intermediul interfetei Configurator se 
 * aleg optiunile aferente fiecarui tip de masina.
 * Metoda configure returneaza un String cu optiunile 
 * selectate de utilizator si preturile aferente.
 * Metoda addConfigPrice aduna pretul optiunilor la 
 * pretul de pornire al fiecarui tip de masina
 * si il returneaza.
 */

public interface Configurator {
	
	abstract String configure(Car car);
	
	double addConfigPrice(double price);

}
