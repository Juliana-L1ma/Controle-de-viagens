package controleDeViagens;
//este cliente tem 2% de desconto nos pacotes

public class StandardClient extends Cadastro{
	
	public StandardClient(String nome, String cpf, String sexo, String idade, String telefone, String email, String classeCliente) {
		super(nome, cpf, sexo, idade, telefone, email, classeCliente);	
	}
	
	public static double desconto2PorCento (double Valor) {
		double desconto = Valor - 0.02*Valor;
		return desconto;
	}

}
