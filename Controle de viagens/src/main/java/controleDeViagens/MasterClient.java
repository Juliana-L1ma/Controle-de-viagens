package controleDeViagens;

public class MasterClient extends Cadastro{
	
	public MasterClient(String nome, String cpf, String sexo, String idade, String telefone, String email, String classeCliente) {
		super(nome, cpf, sexo, idade, telefone, email, classeCliente);
	}
	
	public static double desconto10PorCento (double Valor) {
		double desconto = Valor - 0.10*Valor;
		return desconto;
	}



}
