
public class Programa {

	public static void main(String[] args) {
		
		//Primeiro exercício
		
		Departamento ti = new Departamento();
		ti.id = 1;
		ti.descricao = "TI";
		
		Solicitante anderson = new Solicitante();
		anderson.id = 1;
		anderson.nome = "Anderson";
		anderson.email = "xxx@xxx.com";
		anderson.departamento = ti;
		
		Ticket ticketUm = new Ticket();
		ticketUm.id = 1;
		ticketUm.solicitante = anderson;
		
		Ticket ticketDois = new Ticket();
		ticketDois.id = 2;
		ticketDois.solicitante = anderson;
		
		Solicitante maria = new Solicitante();
		maria.id = 2;
		maria.nome = "Maria";
		maria.email = "xxx@xxx.com";
		maria.departamento = ti;
		
		Ticket ticketTres = new Ticket();
		ticketTres.id = 3;
		ticketTres.solicitante = maria;
		
		Ticket ticketQuatro = new Ticket();
		ticketQuatro.id = 4;
		ticketQuatro.solicitante = maria;
		
		//Segundo exercício
		
		Departamento contabilidade = new Departamento();
		contabilidade.id = 1;
		contabilidade.descricao = "Contabilidade";
		
		Solicitante valeska = new Solicitante();
		valeska.id = 3;
		valeska.nome = "Valeska";
		valeska.email = "xxx@xxx.com";
		valeska.departamento = contabilidade;
		
		Ticket ticketCinco = new Ticket();
		ticketCinco.id = 5;
		ticketCinco.solicitante = valeska;
		
		Solicitante naldo = new Solicitante();
		naldo.id = 3;
		naldo.nome = "Naldo";
		naldo.email = "xxx@xxx.com";
		naldo.departamento = contabilidade;
		
		Ticket ticketSeis = new Ticket();
		ticketSeis.id = 6;
		ticketSeis.solicitante = naldo;
		
		Solicitante tonon = new Solicitante();
		tonon.id = 3;
		tonon.nome = "Tonon";
		tonon.email = "xxx@xxx.com";
		tonon.departamento = contabilidade;
		
		Ticket ticketSete = new Ticket();
		ticketSete.id = 7;
		ticketSete.solicitante = tonon;
		
		System.out.println(ticketUm.solicitante.nome);
		System.out.println(ticketDois.solicitante.nome);
		System.out.println(ticketTres.solicitante.nome);
		System.out.println(ticketQuatro.solicitante.nome);
		System.out.println(ticketCinco.solicitante.nome);
		System.out.println(ticketSeis.solicitante.nome);
		System.out.println(ticketSete.solicitante.nome);
		
		
		
		
		
		
		
		
	}	
	
	
}
