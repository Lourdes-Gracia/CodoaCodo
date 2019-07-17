package poo.u01;

public class Motocicleta {
	private String matricula;
	private String color;
	private int ruedas; // Getter y Setter
	private int velocidad;
	private boolean enMarcha;
	public static final int VEL_MAXIMA = 130;

	// M�todo Constructor
	public Motocicleta(String matricula) {
		this.matricula = matricula;
		this.velocidad = 0;
		enMarcha = false;
	}

	// Otro M�todo Constructor
	
	// Getters y Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String m) {
		matricula = m;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public boolean enMarcha() {
		//System.out.print(String.valueOf(23));
		return enMarcha;
	}

	public void arrancar() {
		if (!enMarcha) {
			enMarcha = true;
			velocidad = 0;
		}
	}

	public String toString() {
		return "Matricula: " + matricula + "\n"+
				"Velocidad: " + velocidad + " Km/h \n"+
				"En marcha: " + enMarcha;
	}
	
	// L�mite de velocidad en acelerar
	public void acelerar() {
		if (enMarcha) {
			if (velocidad > 0) {
				velocidad *= 1.1;
			} else
				velocidad = 10;
		}
	}

}
