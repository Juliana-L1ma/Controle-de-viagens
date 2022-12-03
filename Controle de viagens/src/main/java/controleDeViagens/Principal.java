package controleDeViagens;

import java.util.Scanner;


public class Principal {
	private static final controleDeViagens.Cadastro cliente1 = null;

	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String destino;
		int acompanhantes;
		PacoteViagem pacotes = new PacoteViagem();
		
		StandardClient cliente1 = new StandardClient("Maria Clara", "123.456.789.22", "Feminino", "18", "11 46545-5468", "mariaclara@gmail.com", "StandardClient");
		BlueClient cliente2 = new BlueClient("Roberto Marinho", "987.654.352.44", "Masculino", "50", "11 5646-6561", "robertomarinho@gmail.com", "BlueClient");
		MasterClient cliente3 = new MasterClient("Abel Ferreira", "456.123.789.66", "Masculino", "42", "11 9874-4562", "abelferreira@gmail.com", "MasterClient");
		
		//Vetor para as classes de desconto.
		Cadastro [] classes = new Cadastro[3];

		//Colocando as classes em cada posição.
		classes[0]= cliente1;
		classes[1]=cliente2;
		classes[2]=cliente3;
		
		System.out.println("Ol� ! Somos a empresa Travel Agency, nesse m�s de Black Friday" + "\nestamos com pacotes em promo��o. Vamos confirmar seus dados e" + "\nseguiremos para a escolha dos pacotes");
        System.out.println();
        
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
				System.out.println("Seus dados est�o certos ? Digite 1 para sim ou 2 para n�o ");
				
				if(in.nextLine().equals("1")) {
					System.out.println();
					System.out.println("Digite o pacote que voc� quer: " + "\nPacote 1 - com destino a Santa Catarina" + "\nPacote 2 - com destino a Fortaleza" + "\nPacote 3 - com destino a ");
					destino = in.nextLine();
					
					
					if(destino.equals("Pacote 1")) {
						System.out.println("\nOs dias do pacote s�o fixos ent�o voc� ter� 3 dias a partir do dia do seu checkin");
						System.out.println("Digite a data de check in (apenas n�meros)");
						int dataDeCheckin = in.nextInt();
						
						in.nextLine();
						System.out.println("Quantas pessoas deseja levar? Você pode levar até 3 acompanhantes ");
//						in.nextInt();
						acompanhantes = in.nextInt();
						
						int checkout = dataDeCheckin + 2;
						
						System.out.println("Segue abaixo os dados da conta");
					    System.out.println();
					    System.out.println("Pacote 1 com destino a Salvador " + "\nCheckin: " + dataDeCheckin + "\nCheckout: " + checkout + "\nAcompanhantes: " + acompanhantes + "\nValor Bruto: " + pacotes.pacote1(3, 600.90, acompanhantes) );
					    System.out.println("Valor com desconto de acordo com sua classe: " + StandardClient.desconto2PorCento(pacotes.pacote1(3, 100, acompanhantes)));
					    System.out.println("****************************************************************");
						System.out.println();
					}
					if(destino.equals("Pacote 2")) {
						System.out.println("\nOs dias do pacote s�o fixos ent�o voc� ter� 3 dias a partir do dia do seu checkin");
						System.out.println("Digite a data de check in (apenas n�meros)");
						int dataDeCheckin = in.nextInt();
						
						in.nextLine();
						System.out.println("Quantas pessoas deseja levar? Você pode levar até 3 acompanhantes ");
//						in.nextInt();
						acompanhantes = in.nextInt();
						
						int checkout = dataDeCheckin + 2;
						
						System.out.println("Segue abaixo os dados da conta");
					    System.out.println();
					    System.out.println("Pacote 2 com destino a México " + "\nCheckin: " + dataDeCheckin + "\nCheckout: " + checkout + "\nAcompanhantes: " + acompanhantes + "\nValor Bruto: " + pacotes.pacote1(3, 600.90, acompanhantes) );
					    System.out.println("Valor com desconto de acordo com sua classe: " + StandardClient.desconto2PorCento(pacotes.pacote1(3, 100, acompanhantes)));
					    System.out.println("****************************************************************");
						System.out.println();
					}
				}else {
					System.out.println("Contate a empresa para atualizar seus dados");
				}
        	
        }
		
		
	}
	
	}
}
