package starbucksNero;

import java.time.LocalDate;

import starbucksNero.adapters.MernisCheckService;
import starbucksNero.business.concretes.BaseCustomerManager;
import starbucksNero.business.concretes.SalesManager;
import starbucksNero.business.concretes.StarbucksCustomerManager;
import starbucksNero.entity.concretes.Customer;
import starbucksNero.entity.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Türkkahvesi",2);
		Customer customer = new Customer(1,"Ad","Soyad",LocalDate.of(1900,11,4), "12345678901");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisCheckService());
		baseCustomerManager.add(customer);
		SalesManager salesManager = new SalesManager();
		salesManager.sale(product, customer);
		
		
	}

}
