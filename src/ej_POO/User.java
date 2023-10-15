package ej_POO;

import java.util.Date;

public class User extends Person{
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getNui()="
				+ getNui() + ", getAddress()=" + getAddress() + ", getBirthday()=" + getBirthday()
				+ ", getNationality()=" + getNationality() + ", getEmail()=" + getEmail() + ", getGenre()=" + getGenre()
				+ ", getStature()=" + getStature() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	


}
