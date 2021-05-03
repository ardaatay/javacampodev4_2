package odev4_2.concrete;

import odev4_2.abstracts.BaseCustomerManager;
import odev4_2.abstracts.ICustomerCheckService;
import odev4_2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
