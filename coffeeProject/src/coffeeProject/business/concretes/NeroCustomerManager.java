package coffeeProject.business.concretes;



import coffeeProject.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{//base miras b�rakt�

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri taban�na kaydedildi:" + customer.getFirstName()  +" "+  customer.getLastName());
		
	}


	
		
	}
        

