package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer fatih = new IndividualCustomer();
		fatih.customerNumber = "12345";
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "9876";
		
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber = "6578";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {fatih,hepsiBurada,sendika};
		
		customerManager.addMultiple(customers);
		
		
		
		
		
		//customerManager.add(fatih);
		//customerManager.add(hepsiBurada);
		//customerManager.add(sendika); 
		
		
		
		
		
		
		
		

	}

}
