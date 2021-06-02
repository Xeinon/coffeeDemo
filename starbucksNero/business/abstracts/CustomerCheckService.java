package starbucksNero.business.abstracts;

import starbucksNero.entity.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
