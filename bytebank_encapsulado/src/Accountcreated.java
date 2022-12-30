

public class Accountcreated {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	//construtor pode receber parametros
	// esse tipo de construto obriga a passar parametos
	
	public Accountcreated(int agencia, int numero ) {
		this.agencia = agencia;
		total++;
		System.out.println(total);
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Accountcreated destino) {
		 if (this.saldo >= valor) { 
			 this.saldo -= valor;
			 destino.deposita(valor);
			 return true;
	 } else { 
		 return false;
     }
}

	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int novonumero) {
		if (numero <= 0) {
			System.out.println("numero dev ser positivo");
			return;
		}
		this.numero = novonumero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <=0) {System.out.println("nao pode valor menor que 0 ");
		return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return total;
	}
}
