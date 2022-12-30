
public class Testagetandset {
	public static void main(String[] args) {
		Accountcreated conta = new Accountcreated(1111,2222);
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente adriano = new Cliente();
		//conta.titular = adriano;
		
		conta.setTitular(adriano);
		adriano.setNome("Adriano o grande");
		
		Accountcreated conta2 = new Accountcreated(111,222);
		System.out.println(conta2.getNumero());
		
		Accountcreated conta3 = new Accountcreated(11,22);
		System.out.println(Accountcreated.getTotal());
		
		
	}

}
