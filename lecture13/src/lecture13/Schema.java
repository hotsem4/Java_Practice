package lecture13;

public class Schema {
	
	public int numberOfMember;
	public String id;
	public String password;
	public String name;
	
	public Schema(int numberOfMember, String id, String password, String name) {
		this.numberOfMember = numberOfMember;
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public int getNumberOfMember() {
		return numberOfMember;
	}

	public void setNumberOfMember(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Schema [numberOfMember=" + numberOfMember + ", id=" + id + ", password=" + password + ", name=" + name
				+ "]";
	}
	
	
}
