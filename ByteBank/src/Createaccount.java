
public class Createaccount {
	
	public static void main(String[] args) {
		Accountcreated primeiraConta = new Accountcreated();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		 Accountcreated segundaConta= new Accountcreated();
		 segundaConta.saldo = 500;
		 
		 System.out.println("Primeira conta tem "+ primeiraConta.saldo);
		 System.out.println("Segunda conta tem "+ segundaConta.saldo);
		 
		 
		
	}

}
