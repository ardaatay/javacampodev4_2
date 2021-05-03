package odev4_2.abstracts;

import odev4_2.entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
