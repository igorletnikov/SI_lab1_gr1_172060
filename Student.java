class Student {
	public Student(String index, String firstName, String lastName) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String index;
	String firstName;
	String lastName;

	//TODO constructor

	//TODO seters & getters

	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
	}
}
