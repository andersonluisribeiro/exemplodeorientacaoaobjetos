import javax.swing.JOptionPane;


public class Pessoa {

	String nome;
	
	//ela � p�blica, n�o retorna nada, se chama imprime nome e
	//n�o recebe nada como par�metro
	public void imprimirNome(){
		JOptionPane.showMessageDialog(null, "O nome da pessoa �: " + nome);	
	}
}
