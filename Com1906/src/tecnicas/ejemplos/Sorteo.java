package tecnicas.ejemplos;

import javax.swing.JOptionPane;

public class Sorteo {
	public static int aleatorio(int limInf, int limSup) {
		return (int) (Math.random() * (limSup - limInf + 1)) + limInf;
	}

	public static void main(String[] args) {
		String com1906[] = { "Jhonatan", "Kevin", "Mar�a Carolina", "Ezequiel", "Carlos", "Jorgen", "Betsy", "Aquiles",
				"Lourdes", "Roberto", "Sergio", "Juan Carlo", "Alejandro", "Jhon", "Edilberto", "Miguel", "Melanie",
				"Henry", "Lautaro", "Sebasti�n", "Gabriel", "Ang�lica" };
		int i = aleatorio(1, com1906.length);
		// System.out.println(com1906[i]);
		JOptionPane.showMessageDialog(null, com1906[i]);
	}

}
