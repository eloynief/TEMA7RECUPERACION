package tema7;

public class Persona {
	String nombre;
	int edad;
	static int edadStatic;
	double estatura;
	void saludar (){
		System.out.println("Hola. Mi nombre es " + nombre);
		System.out.println("Encantado de conocerte");
	}
	void cumplirAños (){
		edad++;
	}
	
	static void cumplirAñosStatic (){
		edadStatic++;
	}
	
	void crecer (double incremento){
		estatura += incremento;
	}
}
