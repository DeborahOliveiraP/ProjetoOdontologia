package entidades;
import java.util.Scanner;

public class Paciente extends Pessoas implements PlanoSaude{
	Scanner ent = new Scanner(System.in);
	
	
	private boolean planoSaude;
	private float orcamento;
	public Endereco endereco;
	public String bemVindo;
	
	Endereco end = new Endereco();
	Especializacao esp1 = new Especializacao();
	
	
	public Paciente() {
		
	}
	public Paciente(String bemvindo) {
		this.bemVindo = bemvindo;
	}
	
	// entrada de dados para cadastrar paciente
	public void endereco() {
		System.out.println("Número da residencia");
		end.setNumero(ent.next());
		System.out.println("Logradouro");
		end.setLogradouro(ent.next());
		System.out.println("Bairro");
		end.setBairro(ent.next());
		System.out.println("CEP");
		end.setCep(ent.next());
		System.out.println("Cidade");
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
	
	public boolean isPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public float getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	} 
		
	public void planoSaudeRetorno() {
		esp1.servicoRetorno();
	}
	@Override
	public void planoSaude() {
		System.out.println("Paciente possui plano de saúde?\n"
				+ "[s] para sim\n"
				+ "[n] para não\n");
		String plano = ent.next();
		if (plano.equals("s")) {
			System.out.println("o seu plano cobrirá todo o tratamento!");
		}
		
		else {
			System.out.println("o plano não cobrirá o tratamento!");
			System.out.println("===================================================");
			System.out.println("Escolha qual o seu tipo de tratamento que deseja realizar\n"
					+ "[1] - Tratamento de Limpeza\n" 
					+ "[2] - Tratamento de Extracao\n"
					+ "[3] - Tratamento de Odontopediatria\n"
					+ "[4] - Tratamento de Ortodontia\n"
					+ "[5] - Tratamento de Restauracao\n"
					);
			esp1.servico();
		}
		
		
	}

}