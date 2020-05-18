package Main.Model;

import javax.persistence.Entity;


@Entity
public class Dog extends Animal {



	private Integer raza;
	private String owner_name;
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("I am a Dog");
	}
	public Integer getRaza() {
		return raza;
	}
	public void setRaza(Integer raza) {
		this.raza = raza;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	@Override
	public String toString() {
		return "Dog [raza=" + raza + ", owner_name=" + owner_name + "]";
	}
	
}
