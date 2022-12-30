package bytebank_composto;

public class Accountcreated {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

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

	public double pegaSaldo() {
		return this.saldo;
	}
}
