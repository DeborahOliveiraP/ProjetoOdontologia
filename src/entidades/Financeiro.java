package entidades;
import java.util.Scanner;

public class Financeiro implements FuncionarioAtendente, FuncionarioDentista,FuncionarioExtracao,FuncionarioRestauracao,FuncionarioOrtodontia,FuncionarioOdontopediatria {
	
	Scanner enter = new Scanner(System.in);
	
	private int salario;
	private int duracaoTratamento;
	private boolean planoSaude;
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public int getDuracaoTratamento() {
		return duracaoTratamento;
	}
	public void setDuracaoTratamento(int duracaoTratamento) {
		this.duracaoTratamento = duracaoTratamento;
	}
	public boolean isPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
		
	}
	
	@Override
	public void dentista() { 
		setSalario(3500);
	}
	@Override
	public void atendente() {
		setSalario(1200);
	}
	@Override
	public void extracao() { 
		setSalario(3000);
	}	
	@Override
	public void restauração() { 
		setSalario(3500);
	}
	@Override
	public void odontopediatria() { 
		setSalario(5000);
	}
	@Override
	public void ortodontia() { 
		setSalario(4500);
	}
}
