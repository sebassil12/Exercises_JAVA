package ej_POO;
public class Bycicle {
private int velocidadActual;
private int platoActual;
private int piñonActual;

public Bycicle(int velocidadActual, int platoActual, int piñonActual) {
	this.velocidadActual=velocidadActual;
	this.platoActual=platoActual;
	this.piñonActual=piñonActual;
}

 public void acelerar() {
	 this.velocidadActual*=2;
 }
 public void frenar() {
	 this.velocidadActual/=2;
 }
 public void cambiarPlato(int plato) {
	 this.platoActual=plato;
 }
 public void cambiarPiñon(int piñon) {
	 this.piñonActual = piñon;
 }

}

