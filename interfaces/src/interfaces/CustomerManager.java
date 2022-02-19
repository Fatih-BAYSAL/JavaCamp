package interfaces;

public class CustomerManager {
	// loosly(esnek baglilik) - tightly(kati baglilik) coupled
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	

	public void add(Customer customer) {
		System.out.println("Musteri eklendi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	
	public void delete(Customer customer) {
		System.out.println("Musteri silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	} 

}
