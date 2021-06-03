import java.util.Scanner;

/**
 * 
 * @author José Romero Guerrero
 * @version 1.5
 */
public class GestionVacunas {

	public static void main(String[] args) {
		
		String nombre,dni,numerovacuna="",vacuna1="",vacuna2="",mesvacuna1="",mesvacuna2="";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombre = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dni = teclado.next();
		System.out.println("¿Vacuna 1 o 2?");
		numerovacuna = teclado.next();
		
		
		if(numerovacuna.equals("1")) {
			System.out.println("Introduzca la vacuna 1: ");
			vacuna1 = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 1:");
			mesvacuna1 = teclado.next();
			
		}else if(numerovacuna.equals("2")) {
			
			System.out.println("Introduzca la vacuna 2: ");
			vacuna2 = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 2:");
			mesvacuna2 = teclado.next();
			
		}else {
			System.out.println("Error");
		}
						
		System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
		System.out.println("Vacuna 1 "+ vacuna1 +" Fecha:"+mesvacuna1);
		System.out.println("Vacuna 2 "+ vacuna2 +" Fecha:"+mesvacuna2);
		
		if(vacuna2.equals("")) {
			if(vacuna1.equals("Moderna")) {
				System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
			}else if(vacuna1.equals("Pfizer")) {
				System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
			}else if(vacuna1.equals("Janssen")) {
				System.out.println("El paciente está ya vacuando");
			}else {
				System.out.println("El paciente "+ nombre + " está ya vacunado ");
			}
		}		
		}
		
	}


