package coffeShopDemo;

import java.rmi.RemoteException;

import coffeShopDemo.adapters.MernisServiceAdapter;
import coffeShopDemo.concretes.BaseCustomerManager;
import coffeShopDemo.concretes.StarbucksCustomerManager;
import coffeShopDemo.entities.Customer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, RemoteException  {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(2,"Fatih","Baysal",1999,"222222222"));
		
	}

}
