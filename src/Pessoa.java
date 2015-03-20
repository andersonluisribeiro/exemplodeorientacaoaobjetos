import javax.swing.JOptionPane;


public class Pessoa {

	String nome;
	
	//ela é pública, não retorna nada, se chama imprime nome e
	//não recebe nada como parâmetro
	public void imprimirNome(){
		JOptionPane.showMessageDialog(null, "O nome da pessoa é: " + nome);	
	}
}
