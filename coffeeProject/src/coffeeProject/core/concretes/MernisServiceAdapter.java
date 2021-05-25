package coffeeProject.core.concretes;

import coffeeProject.business.abstracts.CustomerCheckService;
import coffeeProject.entities.concretes.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return false;
	}

}
