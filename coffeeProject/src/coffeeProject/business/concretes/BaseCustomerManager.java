package coffeeProject.business.concretes;

import coffeeProject.business.abstracts.CustomerService;
import coffeeProject.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Mernis sistem ile Tc kimlik do�rulamas� yap�ld�");
        System.out.println("Veri taban�na kaydedildi:" + customer.getFirstName()  +" "+  customer.getLastName());
		
	}
		
	}


