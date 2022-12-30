package bytebank_composto;

public class Testabanco {
	public static void main(String[] args) {
		Cliente Adriano = new Cliente();
		Adriano.nome = "Adriano o grande";
		Adriano.cpf = "010.010.010.25";
		Adriano.profissao = " garoto de programa";
		
		Accountcreated contaDoadriano = new Accountcreated();
		contaDoadriano.deposita(1000);
		//associa o cliente adriano a contaDoadriano
		contaDoadriano.titular = Adriano;
		System.out.println((contaDoadriano.titular.nome));
		
				
	}

}
