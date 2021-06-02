package starbucksNero.business.concretes;

import starbucksNero.business.abstracts.SalesService;
import starbucksNero.entity.concretes.Customer;
import starbucksNero.entity.concretes.Product;


public class SalesManager implements SalesService {
	@Override
	public void sale(Product product, Customer customer) {
		System.out.println("Ürün satýn alýndý, " + customer.getFirstName() + " " +"yýldýzý" + " " + product.getProductUnit()+ " " +"arttý");
		
	}

}
