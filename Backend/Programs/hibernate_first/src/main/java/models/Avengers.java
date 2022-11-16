package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avengers {
private String name;
@Id
private int id;
private int age;
private String planet;

public Avengers() {}

public Avengers(String name, int id, int age, String planet) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.planet = planet;
}
public void setName(String name) {
	this.name = name;
}

public void setId(int id) {
	this.id = id;
}

public void setAge(int age) {
	this.age = age;
}

public void setPlanet(String planet) {
	this.planet = planet;
}

public String getName() {
	return name;
}
public int getId() {
	return id;
}
public int getAge() {
	return age;
}
public String getPlanet() {
	return planet;
}


}
