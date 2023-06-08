package ejercicio1;

public class Hora {
	
	int hora=0;
	int minuto=0;
	int segundo=0;
	
	
	public Hora() {
		super();
	}

	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora<24) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto<60) {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo<60) {
			this.segundo = segundo;
		}
	}
	
	//
	void incrementaSegundo() {

		if(segundo>59) {
			//segundo=0;
			while(segundo>59) {
				minuto++;
				segundo=segundo-60;
			}
		}//if segundo
		
		if (minuto>59) {
			//minuto=0;
			while(minuto>59) {
				hora++;
				minuto=minuto-60;
			}
		}//if minuto
			
			
		if (hora>23) {
			hora=0;
		}//if hora
		
	}//incrementasegundo
	
	
}//clase
