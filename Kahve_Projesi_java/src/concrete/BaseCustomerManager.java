package concrete;

import abstracts.ICustomerServiceManager;
import entities.Customer;

public class BaseCustomerManager implements ICustomerServiceManager{

	@Override
	public void save(Customer customer) {
		System.out.println("database kaydedildi" + customer.getFirstName());
		
	}

}
