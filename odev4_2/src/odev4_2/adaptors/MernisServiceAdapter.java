package odev4_2.adaptors;

import odev4_2.abstracts.ICustomerCheckService;
import odev4_2.entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		//Mernis servisinden gelen veri eklenebilir.
		return true;
	}

}
