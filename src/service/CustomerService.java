package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;
	private static final CustomerService instance = new CustomerService();
	
	private CustomerService(){
		customers = new HashMap<String, Customer>();
	}
	public static CustomerService getInstance(){
		return instance;
	}
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	public Customer find(String id){
		if(id != null){
			return (customers.get(id));
		}
		else
			return null;
	}
	public Customer login(String id, String password) {
		
		if(customers.containsKey(id)){
			Customer customer = this.find(id);
			if(customer.getPassword().equals(password)){
				return customer;
			}
		}
		
			return null;
	}
}
