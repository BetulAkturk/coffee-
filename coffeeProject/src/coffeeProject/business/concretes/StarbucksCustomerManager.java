package coffeeProject.business.concretes;




import coffeeProject.business.abstracts.CustomerCheckService;
import coffeeProject.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
       
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Tc kimlik no do�rulanamad�");

		} 
			
		
		
	}
 
	
}