package ej_POO;

public class main {

	public static void main(String[] args) {
		Bycicle bicicletaCannondale = new Bycicle(120, 42, 8);
		Bycicle bicicletaFelt = new Bycicle(140, 50, 9);
		Bycicle bicicletaGiant = new Bycicle(160, 52, 10);
		System.out.println("Hello World");
		Person persona1 = new Person();
		persona1.setName("Mario");
		persona1.setNui("0987654321");
		
		System.out.println("Usted creo: " + persona1);
		User usuario1 = new User();
		usuario1.setPassword("qjhuhqw");
		System.out.println("Usted creo: " + usuario1);
	}

}
