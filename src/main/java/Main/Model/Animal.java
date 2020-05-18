package Main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;

@NamedQuery(name = "Animal.findByName",
query = "select u from Animal u where u.name = :name")
@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String specie;
	private String name;
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSpecie() {
		return specie;
	}
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", specie=" + specie + ", name=" + name + "]";
	}
	
}
