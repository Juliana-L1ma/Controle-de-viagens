package controleDeViagens;

public class BlueClient extends Cadastro{
	
	public BlueClient(String nome, String cpf, String sexo, String idade, String telefone, String email, String classeCliente) {
		super(nome, cpf, sexo, idade, telefone, email, classeCliente);
		
	}
	
	public static double desconto5PorCento (double Valor) {
		double desconto = Valor - 0.05*Valor;
		return desconto;
	}



	
}


