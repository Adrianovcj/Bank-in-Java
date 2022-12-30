
public class Testemetodo {
	 public static void main(String[] args) {
		    Accountcreated contaDoadriano = new Accountcreated ();
		    contaDoadriano.saldo = 100;
		    contaDoadriano.deposita(50);
		    System.out.println(contaDoadriano.saldo);
		    boolean conseguiuretirar = contaDoadriano.saca(50);
		    System.out.println(contaDoadriano.saldo);
		    System.out.println(conseguiuretirar);
		    
		    Accountcreated contaYo = new Accountcreated();
		    contaYo.deposita(3000);
		    
		    contaYo.transfere(500,contaDoadriano);
		    System.out.println(contaYo.saldo);
		    
		    contaDoadriano.titular = "Adriano o grande";
		    System.out.println(contaDoadriano.titular);
		  }
		}
