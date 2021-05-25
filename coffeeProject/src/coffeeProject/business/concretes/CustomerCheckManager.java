package coffeeProject.business.concretes;

import coffeeProject.business.abstracts.CustomerCheckService;
import coffeeProject.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
