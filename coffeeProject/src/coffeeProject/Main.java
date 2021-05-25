package coffeeProject;

import java.time.LocalDate;


import coffeeProject.business.concretes.BaseCustomerManager;
import coffeeProject.business.concretes.NeroCustomerManager;
import coffeeProject.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		 BaseCustomerManager baseCustomerManager= new NeroCustomerManager();
		 baseCustomerManager.Save(new Customer(2, "Betül", "Aktürk",LocalDate.of(1994, 10, 27), "61255243222" )); 
	}
}
