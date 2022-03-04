package entidades;

import java.util.Scanner;

public class Funcionario extends Pessoas {

	    private String especializacao;
	    private Financeiro financeiro;
	    private Contato contato;
	    public String bemVindo;
	    
	    Scanner ent = new Scanner(System.in);
	    Endereco end = new Endereco();
	    Financeiro fin = new Financeiro();
	    
	    public Funcionario() {
	    	
	    }
		public Funcionario(String bemvindo) {
			bemVindo = bemvindo;
		}
	    
	    // método de cadastramento paciente
	    public void endereco() {
			System.out.println("Número da residência: ");
			end.setNumero(ent.next());
			System.out.println("Logradouro: ");
			end.setLogradouro(ent.next());
			System.out.println("Bairro: ");
			end.setBairro(ent.next());
			System.out.println("CEP: ");
			end.setCep(ent.next());
			System.out.println("Cidade: ");
			end.setCidade(ent.next());
		} 
		// retorno de dados para exibir os dados do pacinte
		public void retornoEndereco(){
			System.out.println("Numero: "+end.getNumero());
			System.out.println("Logradouro: " + end.getLogradouro());
			System.out.println("Bairro: "+ end.getBairro());
			System.out.println("CEP: " + end.getCep());
			System.out.println("Cidade: " + end.getCidade());	
		}
		
	    public String getEspecializacao() {
		
			return especializacao;
		}
		public void setEspecializacao(String especializacao) {
			this.especializacao = especializacao;
		}
		public Financeiro getFinanceiro() {
			return financeiro;
		}
		public void setFinanceiro(Financeiro financeiro) {
			this.financeiro = financeiro;
		}
		public Contato getContato() {
			return contato;
		}
		public void setContato(Contato contato) {
			this.contato = contato;
		}
		
		public void profissao() {
			System.out.println("Qual a sua profissao informe\n"
					+ "[a] para Atendente\n"
					+ "[d] para Dentista\n"
					+ "[e] para Extração\n"
					+ "[r] para Restauração\n"
					+ "[o] para Ortodontia\n"
					+ "[p] para Odontopediatria\n");
			String profissao = ent.next();
			if (profissao.equals("a") || profissao.equals("A")) {
			fin.atendente(); }
			if (profissao.equals("d") || profissao.equals("D")) {
			fin.dentista(); }
			if (profissao.equals("e") || profissao.equals("E")) {
			fin.extracao(); }
            if (profissao.equals("r") || profissao.equals("R")) {
			fin.restauração(); }
			if (profissao.equals("o") || profissao.equals("O")) {
			fin.ortodontia(); }
			if (profissao.equals("p") || profissao.equals("P")) {
			fin.odontopediatria(); }
			
		}
		public void profissaoRetorno() {
			System.out.println("Seu salário será de R$ "+ fin.getSalario());
			
		}

	} 
