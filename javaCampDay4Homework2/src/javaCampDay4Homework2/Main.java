package javaCampDay4Homework2;

import java.time.LocalDate;

import javaCampDay4Homework2.Concrete.NeroCustomerManager;
import javaCampDay4Homework2.Concrete.StarbucksCustomerManager;
import javaCampDay4Homework2.abstracts.BaseCustomerManager;
import javaCampDay4Homework2.adapters.MernisServiceAdapter;
import javaCampDay4Homework2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Starbucks:");
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.save(new Customer("Meyra", "Can", LocalDate.of(1999,8,26), "00000000000"));
		
		System.out.println("Nero:");
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer("Meyra", "Can", LocalDate.of(1999,8,26), "11111111111"));
		

	}

}
