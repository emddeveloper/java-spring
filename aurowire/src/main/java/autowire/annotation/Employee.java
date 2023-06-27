package autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address1")  // to identyfy the neab by name 
	private Address address; // inside property 
	
	public Employee(Address address) {  //inseide constructor
		super();
		
		this.address = address;
		System.out.println("inside constructor");
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) { //inside setter
		System.out.println("inside setAddress");
		this.address = address;
	}  

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
