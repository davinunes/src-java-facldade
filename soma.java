
import javax.swing.JOptionPane;

public class soma {
	static public void main(String[] args)
	{
		String n1, n2;
		int num1,num2, soma;
		n1 = JOptionPane.showInputDialog("Digite o Primeiro Numero:");
		n2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		num1 = Integer.parseInt(n1);
		num2 = Integer.parseInt(n2);
		soma = num1 + num2;
		JOptionPane.showMessageDialog(null, "A Soma é: " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);
		
	}
}
