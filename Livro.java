
import javax.swing.JOptionPane;

public class Livro {
	private String titulo;
	private int pag;
	private double preco;
	
	public Livro()
	{
		titulo = "Programação OO em Java";
		pag = 789;
		preco = 297.45;
		
	}
	public void mostrarLivro ()
	{
		JOptionPane.showMessageDialog(null, "Título: " + titulo + "\nPáginas: " + pag + "\nPreço: " + preco);
	}
	public static void main (String args[])
	{
		Livro livro = new Livro();
		livro.mostrarLivro();
	}
}
