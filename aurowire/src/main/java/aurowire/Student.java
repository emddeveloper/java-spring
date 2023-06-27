package aurowire;

public class Student {
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Student(int id) {
		super();
		Id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + "]";
	}
	
}
