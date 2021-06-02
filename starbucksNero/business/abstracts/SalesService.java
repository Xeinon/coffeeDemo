package starbucksNero.business.abstracts;

import starbucksNero.entity.concretes.Customer;
import starbucksNero.entity.concretes.Product;

public interface SalesService {
	void sale(Product product, Customer customer);
}
