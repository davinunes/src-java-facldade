
import javax.swing.JOptionPane;

public class Livro {
	private String titulo;
	private int pag;
	private double preco;
	
	public Livro()
	{
		titulo = "Programa��o OO em Java";
		pag = 789;
		preco = 297.45;
		
	}
	public void mostrarLivro ()
	{
		JOptionPane.showMessageDialog(null, "T�tulo: " + titulo + "\nP�ginas: " + pag + "\nPre�o: " + preco);
	}
	public static void main (String args[])
	{
		Livro livro = new Livro();
		livro.mostrarLivro();
	}
}
