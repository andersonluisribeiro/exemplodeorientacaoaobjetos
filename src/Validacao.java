import javax.swing.JOptionPane;


public class Validacao {
	
	public static void main(String[] args) {
		
		//Login e senha est�o num banco de dados
		Usuario usuario = new Usuario();
		usuario.login = "admin";
		usuario.senha = "admin";
		
		
		//Login e senha informados pelo usu�rio do sistemas
		String loginInformado = JOptionPane.showInputDialog("Informe o login");
		String senhaInformada = JOptionPane.showInputDialog("Informe a senroha");
		
		//Realizando a autentica��o
		usuario.autenticar(loginInformado, senhaInformada);
		
		
	}

}
