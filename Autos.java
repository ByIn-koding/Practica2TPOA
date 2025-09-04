package autos;

public class Autos {
 int cantidad_puertas;
 String color;
 int velocidades;
 String motor;
  
 public Auto(int cant_puertas, String color) {
	 this.color = color;
	 this.cantidad_puertas = cant_puertas;
	 
 }
 public void avanza() {
	 System.out.println("El auto esta avanzando...");
 }
  public double reversa(double dato) {
	  double velocidad = 5.3, resultado;
	  resultado = velocidad * dato;
	  return resultado;
	  
  }
 public static void main(String[] args) {
	 Auto auto = new Auto();
	 System.out.println(auto.color);
	 auto.avanza();
	 double velo = auto.reversa(8.8);
	 System.out.println("Velocidad" + velo);
 }
}
