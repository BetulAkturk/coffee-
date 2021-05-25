package coffeeProject.business.concretes;



import coffeeProject.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{//base miras býraktý

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri tabanýna kaydedildi:" + customer.getFirstName()  +" "+  customer.getLastName());
		
	}


	
		
	}
        

