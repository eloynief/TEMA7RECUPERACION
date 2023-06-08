package tema7;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		
		Persona p=new Persona(); //creacion de objeto
		
		p.nombre="Pepe";
		p.saludar();
		
		Persona.edadStatic=0;//cuando el atributo o metodo es static, no hace falta crear un objeto
		
		
	}
	
	
	
}
