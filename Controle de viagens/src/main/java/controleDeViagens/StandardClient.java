package controleDeViagens;
//este cliente tem 2% de desconto nos pacotes

public class StandardClient extends Cadastro{
	
	public double desconto2PorCento (double Valor) {
		double desconto = 0.02*Valor;
		return desconto;
	}

}
