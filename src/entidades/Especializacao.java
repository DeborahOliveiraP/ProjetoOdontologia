package entidades;
import java.util.Scanner;

public class Especializacao {
	
	 private double tratamento;
	 private double limpeza = 250;
	 private double extracao = 150;
	 private double odontopediatria = 400;
	 private double ortodontia = 150;
	 private double restauracao = 250;
	 
	 public void servico() {
	 double valor;
	 Scanner enter = new Scanner(System.in);
	 String escolha = enter.next();
	 double valorPago;
	 double valorDividido;

	 if (escolha.equals("1")) {
			System.out.println("O plano escolhido custa R$ "+ limpeza +" pode ser dividido em até 12x sem juro\n"+
			"Em quanta vezer deseja dividir o valor?" );
			valorDividido = enter.nextDouble();
			if (valorDividido <= 12) {
				valorPago = limpeza / valorDividido;
				System.out.println("O valor que será pago mensal de R$ "+ valorPago +" de " + valorDividido + "x");
				setTratamento(limpeza);
			}else if (valorDividido > 12){
				valorPago = (limpeza* 0.3) / valorDividido; 
				setTratamento(limpeza + valorPago);
			}
			
		}
		
		else if (escolha.equals("2")) {
			System.out.println("O plano escolhido custa R$ "+ extracao +" pode ser dividido em até 12x sem juro\n"+
					"Em quanta vezer deseja dividir o valor?" );
						valorDividido = enter.nextDouble();
			if (valorDividido <= 12) {
				valorPago = extracao / valorDividido;
				System.out.println("O valor que será pago mensal de R$ "+ valorPago +" de " + valorDividido + "x");
				setTratamento(extracao);
			}else if (valorDividido > 12){
				valorPago = (extracao * 0.3) / valorDividido; 
				setTratamento(extracao + valorPago);
			}
			
		}else if (escolha.equals("3")) {
			System.out.println("O plano escolhido custa R$ "+ odontopediatria +" pode ser dividido em até 12x sem juro\n"+
					"Em quanta vezer deseja dividir o valor?" );
						valorDividido = enter.nextDouble();
			if (valorDividido <= 12) {
				valorPago = limpeza / valorDividido;
				System.out.println("O valor que será pago mensal de R$ "+ valorPago +" de " + valorDividido + "x");
				setTratamento(odontopediatria);
			}else if (valorDividido > 12){
				valorPago = (odontopediatria * 0.3) / valorDividido; 
				setTratamento(odontopediatria + valorPago);
			}
			
		}else if (escolha.equals("4")) {
			System.out.println("O plano escolhido custa R$ "+ ortodontia +" pode ser dividido em até 12x sem juro\n"+
					"Em quanta vezer deseja dividir o valor?" );
						valorDividido = enter.nextDouble();
			if (valorDividido <= 12) {
				valorPago = ortodontia / valorDividido;
				System.out.println("O valor que será pago mensal de R$ "+ valorPago +" de " + valorDividido + "x");
				setTratamento(ortodontia);
			}else if (valorDividido > 12){
				valorPago = (ortodontia * 0.3) / valorDividido; 
				setTratamento(ortodontia + valorPago);
			}
			
		}else if (escolha.equals("5")) {
			System.out.println("O plano escolhido custa R$ "+ restauracao +" pode ser dividido em até 12x sem juro\n"+
					"Em quanta vezer deseja dividir o valor?" );
						valorDividido = enter.nextDouble();
			if (valorDividido <= 12) {
				valorPago = restauracao / valorDividido;
				System.out.println("O valor que será pago mensal de R$ "+ valorPago +" de " + valorDividido + "x");
				setTratamento(restauracao);
			}else if (valorDividido > 12){
				valorPago = (restauracao * 0.3) / valorDividido; 
				setTratamento(restauracao + valorPago);
			}
		}else if (escolha.equals("s")) {
			
			setTratamento(0);
		}
		
	 }
	    public void servicoRetorno() {
		if (getTratamento() == 0) {
			System.out.println("");
		}else {
		 System.out.print("Total do valor do tratamento a ser pago R$ " + getTratamento());
	 	}
	 }

        public double getTratamento() {
	    return tratamento;
        }
        public void setTratamento(double tratamento) {
	    this.tratamento = tratamento;
        }
		public double getLimpeza() {
			return limpeza;
		}
		public void setLimpeza(double limpeza) {
			this.limpeza = limpeza;
		}
		public double getExtracao() {
			return extracao;
		}
		public void setExtracao(double extracao) {
			this.extracao = extracao;
		}
		public double getOdontopediatria() {
			return odontopediatria;
		}
		public void setOdontopediatria(double odontopediatria) {
			this.odontopediatria = odontopediatria;
		}
		public double getOrtodontia() {
			return ortodontia;
		}
		public void setOrtodontia(double ortodontia) {
			this.ortodontia = ortodontia;
		}
		public double getRestauracao() {
			return restauracao;
		}
		public void setRestauracao(double restauracao) {
			this.restauracao = restauracao;
		}
		
	

}