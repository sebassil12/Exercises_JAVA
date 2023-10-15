package ej_POO;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private String nui;
	private String address;
	private Date birthday;
	private String nationality;
	private String email;
	private String genre;
	private float stature;
	
	public Person(String name, int age, String nui, String address, Date birthday, String nationality,
			String email, String genre, float stature) {
		this.name=name;
		this.age=age;
	}
	

	public Person() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNui() {
		return nui;
	}

	public void setNui(String nui) {
		this.nui = nui;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getStature() {
		return stature;
	}

	public void setStature(float stature) {
		this.stature = stature;
	}

	private void walk() {
		System.out.println("I'm walking");
	}
	
	private void sing() {
		System.out.println("I'm singing");
	}
	
	private void think() {
		System.out.println("I'm thinking");
	}
	
	private void eat() {
		System.out.println("I'm eating");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nui=" + nui + ", address=" + address + ", birthday="
				+ birthday + ", nationality=" + nationality + ", email=" + email + ", genre=" + genre + ", stature="
				+ stature + "]";
	}
	
	
}
