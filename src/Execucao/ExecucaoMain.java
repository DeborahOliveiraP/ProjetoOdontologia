package Execucao;
import java.util.Scanner;


import java.util.ArrayList;
import entidades.Pessoas;
import entidades.Funcionario;
import entidades.Paciente;

public class ExecucaoMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		ArrayList<Pessoas> pessoas = new ArrayList<>();
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Paciente> pacientes = new ArrayList<>();
		
		//estênciando as viriáveis
		Funcionario fun1 = new Funcionario("Bem-vindo a central de cadastramento do funcionário");
		Funcionario fun2 = new Funcionario(); //variável funcionário 1
		Paciente pac1 = new Paciente("Bem-vindo a cental de assinemte do paciente");
		Paciente pac2 = new Paciente();

			//menu inicial de escolha 
			System.out.println("Cadastro de pessoa de uma clinica\n"
					+ "[1] para cadastra Funcionário\n"
					+ "[2] para cadastra Paciente\n"
					+"=====================================================\n"
					+"Selecione umas das opçoes\n"
					+"OU tecle em qualquer tecla para SAIR do programa...\n"
					+"=====================================================");
			
			String pf = entrada.next(); //tecla de entrada para informar se será paciente ou funcionario de acordo com o menu
			
		
		while (!pf.equals("0")) {
				
			// FUNCIONÁRIO		
			if (pf.equals("1")) {
				if (true) { //primeiro cadastro de funcionário
					System.out.println(fun1.bemVindo);
					System.out.println("Nome Funcionario");
					fun1.setNome(entrada.next());
					System.out.println("cpf Funcionário");
					fun1.setCpf(entrada.nextInt());										
					fun1.contato();
					fun1.endereco();
					fun1.profissao();
					funcionarios.add(fun1);
					
					System.out.println("Deseja finalizar? [sim/nao]");
					String continua = entrada.next();
						if (continua.equals("sim")|| continua.equals("s")) {
							break;

					}
						
				}
				if (true) { //primeiro cadastro de funcionário
					
					System.out.println("Nome Funcionario");
					fun2.setNome(entrada.next());
					System.out.println("cpf Funcionário");
					fun2.setCpf(entrada.nextInt());
					fun2.contato();
					fun2.endereco(); //método com todos os endereços
					fun2.profissao();
					funcionarios.add(fun2);
					
					System.out.println("Deseja finalizar? [sim/nao]");
					String continua = entrada.next();
						if (continua.equals("sim")|| continua.equals("s")) {
							break;
							
						}
						
				}
				
			}
			// PACIENTE
			if (pf.equals("2")) { 
					if (true) {// primeiro cadastro do paciente
						
						System.out.println(pac1.bemVindo);
						System.out.println("Nome do paciente: ");
						pac1.setNome(entrada.next());
						System.out.println("CPF paciente: ");
						pac1.setCpf(entrada.nextInt());
						pac1.endereco();//endereço em geral
						pac1.contato(); // contato email e telefone
						pac1.planoSaude();//tipos de serviço que o cliente ira escolher com seus valors
						pacientes.add(pac1); // processamento para ser adicionado no arraylist
												
						System.out.println("Deseja finalizar? [sim/nao]");
						String continua = entrada.next();
							if (continua.equals("sim")|| continua.equals("s")) {
								break;
							}
					}
					if (true) {//segundo cadastro de pacientes
						System.out.println("Nome do paciente");
						pac2.setNome(entrada.next());
						System.out.println("CPF paciente");
						pac2.setCpf(entrada.nextInt());
						
						pac2.endereco();
						pac2.contato();
						pac2.planoSaude();
						
						pacientes.add(pac2);
						
						System.out.println("Deseja finalizar? [sim/nao] ");
						String continua = entrada.next();
							if (continua.equals("sim")|| continua.equals("s")) {
								break;
	
							}
					}
			}else {
				System.out.print("Finalizando o programa... ");
				break;
			}
			
				
				
		}
		
		for (Funcionario fu: funcionarios) {
			System.out.println("----------------------------------------");
			System.out.println("Nome Funcionario: " + fu.getNome());
			System.out.println("CPF Funcionario: " + fu.getCpf());
			fu.retornoEndereco();
			fu.profissaoRetorno();
			System.out.println("----------------------------------------");

		}
		for (Paciente pa: pacientes) {
			System.out.println("----------------------------------------");
			System.out.println("Nome: " + pa.getNome());
			System.out.println("CPF: " + pa.getCpf());
			pa.retornoEndereco();
			pa.contatoRetorno();
			pa.planoSaudeRetorno();
			System.out.println("\n---------------------------------------");
			

		}
		
		
	}
}