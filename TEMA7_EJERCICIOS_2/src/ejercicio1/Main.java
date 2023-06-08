package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hora = 0;
		int minuto = 0;
		int segundo=0;
		int incremento=0;
		
		
		Scanner sc= new Scanner(System.in);
		
		//variable tipo objeto
		Hora tiempo=null;
		
		
		

		System.out.println("Introduce la cantidad a incrementar: ");
		incremento=sc.nextInt();
		
		segundo=segundo+incremento;

		tiempo=new Hora(hora,minuto,segundo);
		
		tiempo.incrementaSegundo();
		
		System.out.println(tiempo.hora+":"+tiempo.minuto+":"+tiempo.segundo);
		
		
		
	}

}
