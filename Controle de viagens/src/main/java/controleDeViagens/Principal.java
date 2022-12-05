package controleDeViagens;

import java.util.Scanner;


public class Principal {

	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String destino;
		int acompanhantes;
		PacoteViagem pacotes = new PacoteViagem();
		
		//criando objeto e inserindo os dados
		StandardClient cliente1 = new StandardClient("Maria Clara", "123.456.789.22", "Feminino", "18", "11 46545-5468", "mariaclara@gmail.com", "StandardClient");
		BlueClient cliente2 = new BlueClient("Roberto Marinho", "987.654.352.44", "Masculino", "50", "11 5646-6561", "robertomarinho@gmail.com", "BlueClient");
		MasterClient cliente3 = new MasterClient("Abel Ferreira", "456.123.789.66", "Masculino", "42", "11 9874-4562", "abelferreira@gmail.com", "MasterClient");
		
		//Vetor para as classes de desconto.
		Cadastro [] classes = new Cadastro[3];

		//Colocando as classes em cada posição.
		classes[0]= cliente1;
		classes[1]=cliente2;
		classes[2]=cliente3;
		
		System.out.println("Olá ! Somos a empresa Travel Agency, nesse m�s de Black Friday" + "\nestamos com pacotes em promoção. Vamos confirmar seus dados e" + "\nseguiremos para a escolha dos pacotes");
        System.out.println();
        
        //exibindo dados do cliente
        for(int x = 0; x < 3; x++) {
        	System.out.println("Cliente: " + classes[x].getNome());
			System.out.println("CPF: " + classes[x].getCpf());
			System.out.println("Idade: " + classes[x].getIdade());
			System.out.println("Sexo: " + classes[x].getSexo());
			System.out.println("E-mail: " + classes[x].getEmail());
			System.out.println("Telefone: " + classes[x].getTelefone());
			System.out.println("Classe: " + classes[x].getClasseCliente());
			System.out.println();
			
			int escolha = 1;
			for (int y=0; y < escolha; y++) {
				System.out.println("Seus dados estão certos ? Digite 1 para sim ou 2 para n�o ");
				
				if(in.nextLine().equals("1")) {
					System.out.println();
					System.out.println("Digite o pacote que você quer: " + "\nPacote 1 - com destino a Santa Catarina - valor = R$ 600,90 (preço por pessoa) dias 15 a 17 de dezembro 2022" + "\nPacote 2 - com destino a Fortaleza - valor = R$ 1600,90 (preço por pessoa) dias 23 a 25 dezembro 2022" + "\nPacote 3 - com destino a Rio de Janeiro - valor = R$ 500,00 (preço por pessoa) dias 10 a 12 de janeiro de 2023" + "\nDigite 'Pacote' e o número dele");
					destino = in.nextLine();
					
					
					if(destino.equals("Pacote 1")) {
						System.out.println("Quantas pessoas deseja levar? Você pode levar até 3 acompanhantes ");
//						in.nextInt();
						acompanhantes = in.nextInt();
						
						System.out.println("Confirme a sua classe: ");
						System.out.println("Digite 1 para Standard | 2 para Blue | 3 para Master");
						int classe = in.nextInt();
						
						System.out.println("Digite a forma de pagamento: Cartão ou Boleto");
						in.nextLine();
						String pagamento = in.nextLine();
						
						System.out.println("");
						System.out.println("Segue abaixo os dados da viagem");
						System.out.println("");
						
					    System.out.printf("Pacote 1 com destino a Santa Catarina " + "\nCheckin: 15 de dezembro de 2022 " + "\nCheckout: 17 de dezembro de 2022" + "\nAcompanhantes: " + acompanhantes + "\nValor Bruto: %.2f %n", pacotes.pacote1(3, 600.90, acompanhantes) );
					    
					    System.out.println("Detalhes de pagamento");
					    System.out.println("Forma de pagamento: " + pagamento);
					    
					    if(classe == 1) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", StandardClient.desconto2PorCento(pacotes.pacote1(3, 600.90, acompanhantes)));
						}
					    if(classe == 2) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", BlueClient.desconto5PorCento(pacotes.pacote1(3, 600.90, acompanhantes)));
						}
					    if(classe == 3) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", MasterClient.desconto10PorCento(pacotes.pacote1(3, 600.90, acompanhantes)));
						}
					    
					    
					    System.out.println("****************************************************************");
						System.out.println();
					}
					if(destino.equals("Pacote 2")) {
						
						System.out.println("Quantas pessoas deseja levar? Você pode levar até 3 acompanhantes ");
//						in.nextInt();
						acompanhantes = in.nextInt();
						
						
						System.out.println("Confirme a sua classe: ");
						System.out.println("Digite 1 para Standard | 2 para Blue | 3 para Master");
						int classe = in.nextInt();
						
						System.out.println("Digite a forma de pagamento: Cartão ou Boleto");
						in.nextLine();
						String pagamento = in.nextLine();
						
						System.out.println();
					    in.nextLine();
						System.out.println("Segue abaixo os dados da viagem");
					    System.out.println();
					    System.out.printf("Pacote 2 com destino a Fortaleza " + "\nCheckin: 23 de dezembro de 2022"  + "\nCheckout: 25 de dezembro de 2022 " + "\nAcompanhantes: " + acompanhantes + "\nValor Bruto:  %.2f %n", pacotes.pacote1(3, 1600.90, acompanhantes) );
					    
					    System.out.println("Detalhes de pagamento");
					    System.out.println("Forma de pagamento: " + pagamento);
					    if(classe == 1) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", StandardClient.desconto2PorCento(pacotes.pacote1(3, 1600.90, acompanhantes)));
						}
					    if(classe == 2) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", BlueClient.desconto5PorCento(pacotes.pacote1(3, 1600.90, acompanhantes)));
						}
					    if(classe == 3) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", MasterClient.desconto10PorCento(pacotes.pacote1(3, 1600.90, acompanhantes)));
						}
					    
					    System.out.println("****************************************************************");
						System.out.println();
					}
					if(destino.equals("Pacote 3")) {
						
						System.out.println("Quantas pessoas deseja levar? Você pode levar até 3 acompanhantes ");
//						in.nextInt();
						acompanhantes = in.nextInt();
						
						System.out.println("Escolha a sua classe: ");
						System.out.println("Digite 1 para Standard | 2 para Blue | 3 para Master");
						int classe = in.nextInt();
						
						System.out.println("Digite a forma de pagamento: Cartão ou Boleto");
						in.nextLine();
						String pagamento = in.nextLine();
						
						System.out.println("Segue abaixo os dados da viagem");
					    System.out.println();
					    System.out.printf("Pacote 3 com destino a Rio de Janeiro " + "\nCheckin: 10 de janeiro de 2023" +  "\nCheckout: 12 de janeiro de 2023" + "\nAcompanhantes: " + acompanhantes + "\nValor Bruto:  %.2f %n", pacotes.pacote1(3, 500.00, acompanhantes) );
					    
					    System.out.println("Detalhes de pagamento");
					    System.out.println("Forma de pagamento: " + pagamento);
					    
					    if(classe == 1) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n",StandardClient.desconto2PorCento(pacotes.pacote1(3, 500.00, acompanhantes)));
						}
					    if(classe == 2) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", BlueClient.desconto5PorCento(pacotes.pacote1(3, 500.00, acompanhantes)));
						}
					    if(classe == 3) {
							System.out.printf("Valor do pacote com desconto:  %.2f %n", MasterClient.desconto10PorCento(pacotes.pacote1(3, 500.00, acompanhantes)));
						}
						
					    System.out.println("****************************************************************");
						System.out.println();
					}
				}else {
					System.out.println("Contate a empresa para atualizar seus dados");
					 System.out.println("****************************************************************");
						System.out.println();
				}
        	
        }
		
		
	}
	
	}
}
