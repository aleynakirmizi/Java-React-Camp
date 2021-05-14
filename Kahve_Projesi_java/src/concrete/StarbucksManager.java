package concrete;

import abstracts.ICustomerCheckService;
import entities.Customer;

public class StarbucksManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;
	
	public StarbucksManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
    public void save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            System.out.println("Not a valid person");
        }

    }

}
