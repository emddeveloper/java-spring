package aurowire.xml.config;

public class Employee {

	private Address address;

	public Employee(Address address) {

		super();
		System.out.println("inside constructor");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
