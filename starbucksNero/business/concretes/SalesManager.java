package starbucksNero.business.concretes;

import starbucksNero.business.abstracts.SalesService;
import starbucksNero.entity.concretes.Customer;
import starbucksNero.entity.concretes.Product;


public class SalesManager implements SalesService {
	@Override
	public void sale(Product product, Customer customer) {
		System.out.println("�r�n sat�n al�nd�, " + customer.getFirstName() + " " +"y�ld�z�" + " " + product.getProductUnit()+ " " +"artt�");
		
	}

}
