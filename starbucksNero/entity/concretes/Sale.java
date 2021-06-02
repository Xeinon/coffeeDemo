package starbucksNero.entity.concretes;

public class Sale {

	private int id;
	private int customerId;
	
	public Sale(int id, int customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}
