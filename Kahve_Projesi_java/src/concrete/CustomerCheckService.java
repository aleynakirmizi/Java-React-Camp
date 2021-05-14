package concrete;

import abstracts.ICustomerCheckService;
import entities.Customer;

public class CustomerCheckService implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
