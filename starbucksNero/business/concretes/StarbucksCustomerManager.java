package starbucksNero.business.concretes;

import starbucksNero.business.abstracts.CustomerCheckService;
import starbucksNero.entity.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
		
	}



	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
			
			System.out.println("Müþteri baþarýyla eklendi : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullanici bulunamadi : " + customer.getFirstName() + " " + customer.getLastName() );
		}
		
	}
}
