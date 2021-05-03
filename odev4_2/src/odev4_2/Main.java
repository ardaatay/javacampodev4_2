package odev4_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

import odev4_2.abstracts.BaseCustomerManager;
import odev4_2.adaptors.MernisServiceAdapter;
import odev4_2.concrete.StarbucksCustomerManager;
import odev4_2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Calendar dateOfBirth = new GregorianCalendar(1988, 1, 5);

		Customer customer = new Customer();
		customer.setFirstName("Arda");
		customer.setLastName("Atay");
		customer.setDateOfBirth(dateOfBirth.getTime());
		customer.setNationalityId("90");

		customerManager.Save(customer);
	}

}
