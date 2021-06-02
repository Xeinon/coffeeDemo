package starbucksNero.business.concretes;

import starbucksNero.entity.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	@Override
	public void add(Customer customer) {
		super.add(customer);
		System.out.println("Nero datas�na eklendi : " + customer.getFirstName() + " " + customer.getLastName());
	}
}
