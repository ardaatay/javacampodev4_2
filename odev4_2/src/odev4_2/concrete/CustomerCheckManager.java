package odev4_2.concrete;

import odev4_2.abstracts.ICustomerCheckService;
import odev4_2.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
