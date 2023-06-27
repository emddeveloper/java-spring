package autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address; // inside property 
	
	@Autowired
	public Employee(Address address) {  //inseide constructor
		super();
		
		this.address = address;
		System.out.println("inside constructor");
	}

	public Address getAddress() {
		return address;
	}
	@Autowired
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
