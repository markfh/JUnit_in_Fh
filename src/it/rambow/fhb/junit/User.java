package it.rambow.fhb.junit;

public class User {
	private String name, street, city;

	public User(String name, String street, String city) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		User other = (User) obj;
		
		return this.city.equals(other.getCity()) && this.name == other.getName() && this.street == other.getStreet();
	}
}
















