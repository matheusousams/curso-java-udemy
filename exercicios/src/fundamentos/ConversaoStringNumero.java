package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String val1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String val2 = JOptionPane.showInputDialog("Digite o segundo número ");
		
		System.out.println(val1+val2);
		
		double valor1 = Double.parseDouble(val1);
		double valor2 = Double.parseDouble(val2);
		
		System.out.println(valor1+valor2);
	}
}
