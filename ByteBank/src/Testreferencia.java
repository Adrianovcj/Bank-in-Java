
public class Testreferencia {
	public static void main(String[] args) {
		Accountcreated primeiraConta = new Accountcreated();
		primeiraConta.saldo = 300;
		//duas referencias para o mesmo objeto
		System.out.println("Saldo da primeira:" + primeiraConta.saldo);
		Accountcreated segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta:" + segundaConta.saldo);
	}

}
