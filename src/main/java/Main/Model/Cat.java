package Main.Model;

import javax.persistence.Entity;


@Entity
public class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("I am a Cat");
	}


	private String eyes_color;

	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEyes_color() {
		return eyes_color;
	}

	public void setEyes_color(String eyes_color) {
		this.eyes_color = eyes_color;
	}

	
	@Override
	public String toString() {
		return "Cat [eyes_color=" + eyes_color + "]";
	}
}
