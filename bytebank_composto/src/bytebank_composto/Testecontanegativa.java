package bytebank_composto;

public class Testecontanegativa {
	public static void main(String[] args) {
		Accountcreated conta = new Accountcreated();
		conta.deposita(100);
		conta.saca(10000);
		System.out.println(conta.pegaSaldo());
		
		//proibido:
	    // conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		System.out.println(conta.pegaSaldo());
		
		 
		
	}

}
