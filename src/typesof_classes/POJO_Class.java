package typesof_classes;

public class POJO_Class {
	/*
	 * A class that contains only private variables and setter and getter methods to
	 * use those variables is called POJO (Plain Old Java Object) class. It is a
	 * fully encapsulated class. All the members or instance variables should be
	 * private. POJO class does not extend or implement classes or interfaces that
	 * are pre-specified. They do not contain annotations that are pre-specified.
	 */
	private int id;
	private String name;
	private String Address;

	public POJO_Class() {
		super();
	}

	public POJO_Class(int id, String name, String address) {
		this.id = id;
		this.name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "POJO_Class [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
}
