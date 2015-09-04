
import javax.swing.JOptionPane;

public class NomeSobre {
	static public void main(String[] args)
	{
		String nome, sobre;
		nome = JOptionPane.showInputDialog("Digite o Primeiro Nome:");
		sobre = JOptionPane.showInputDialog("Digite o Sobre Nome:");
		JOptionPane.showMessageDialog(null, "Seu Nome é: " + nome + " " + sobre, "Nome Completo:", JOptionPane.PLAIN_MESSAGE);
		
	}
}
