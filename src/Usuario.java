import javax.swing.JOptionPane;


public class Usuario {

	String login;
	String senha;
	
	//Autantica��o do usu�rio utilizada por todo o sistema
	public void autenticar(String loginInformado, String senhaInformada){
		if(login.equals(loginInformado) && senha.equals(senhaInformada)){
			JOptionPane.showMessageDialog(null, "Login efetuado!");
		}else{
			JOptionPane.showMessageDialog(null, "Login inv�lido!");
		}
	}
	
}
