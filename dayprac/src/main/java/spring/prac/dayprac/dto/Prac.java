package spring.prac.dayprac.dto;

public class Prac {
       String Name;
       String surname;
       
	@Override
	public String toString() {
		return "Prac [Name=" + Name + ", surname=" + surname + "]";
	}

	public Prac(String name, String surname) {
		super();
		Name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
