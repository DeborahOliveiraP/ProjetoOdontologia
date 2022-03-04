package entidades;

import java.util.Scanner;


public abstract class Pessoas {

	   private String nome;
	   private String dataNascimento;
	   private int cpf;
	   private Endereco endereco;
	   private Contato contato;
	   
	   Scanner ent = new Scanner(System.in);
	   Contato contatos = new Contato();
	  
	   //métodos de contatos
	   public void contato() {
		   System.out.println("N do Celular: ");
		   contatos.setCelular(ent.next());
		   System.out.println("Email: ");
		   contatos.setEmail(ent.next());
		   
	   }
	   public void contatoRetorno() {
		   System.out.println("Celular: " + contatos.getCelular());
		   System.out.println("Email: " + contatos.getEmail());
	   }
   
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	   
}
