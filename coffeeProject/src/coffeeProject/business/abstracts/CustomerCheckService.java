package coffeeProject.business.abstracts;

import coffeeProject.entities.concretes.Customer;

public interface CustomerCheckService {
       boolean checkIfRealPerson(Customer customer);
}
