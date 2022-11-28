package controleDeViagens;

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String destino;
		int tempoDeEstadia = 3;
		int acompanhantes;
		PacoteViagem pacotes = new PacoteViagem();
		
		StandardClient cliente1 = new StandardClient();
		BlueClient cliente2 = new BlueClient();
		MasterClient cliente3 = new MasterClient();
		
		
		
		//inserindo dados do cliente 1
		cliente1.setNome("Maria Clara");
		cliente1.setCpf("123.456.789.22");
		cliente1.setIdade("18");
		cliente1.setSexo("Feminino");
		cliente1.setEmail("mariaclara@gmail.com");
		cliente1.setTelefone("11 46545-5468");
	    cliente1.setClasseCliente("StandardClient");
	    
		//inserindo dados do cliente 2
		cliente2.setNome("Roberto Marinho");
		cliente2.setCpf("987.654.352.44");
		cliente2.setIdade("50");
		cliente2.setSexo("Masculino");
		cliente2.setEmail("robertomarinho@gmail.com");
		cliente2.setTelefone("11 5646-6561");
		cliente2.setClasseCliente("BlueClient");
		
		//inserindo dados do cliente 3
		cliente3.setNome("Abel Ferreira");
		cliente3.setCpf("456.123.789.66");
		cliente3.setIdade("42");
		cliente3.setSexo("Masculino");
		cliente3.setEmail("abelferreira@gmail.com");
		cliente3.setTelefone("11 9874-4562");
		cliente3.setClasseCliente("MasterClient");

		System.out.println("Olá ! Somos a empresa Travel Agency, nesse mês de Black Friday" + "\nestamos com pacotes em promoção. Vamos confirmar seus dados e" + "\nseguiremos para a escolha dos pacotes");
        System.out.println();
			System.out.println("Cliente: " + cliente1.getNome());
			System.out.println("CPF: " + cliente1.getCpf());
			System.out.println("Idade: " + cliente1.getIdade());
			System.out.println("Sexo: " + cliente1.getSexo());
			System.out.println("E-mail: " + cliente1.getEmail());
			System.out.println("Telefone: " + cliente1.getTelefone());
			System.out.println("Classe de cliente: " + cliente1.getClasseCliente());
			System.out.println();
			
			int escolha = 1;
			for (int x=0; x < escolha; x++) {
				System.out.println("Seus dados estão certos ? Digite 1 para sim ou 2 para não ");
				
				if(in.nextLine().equals("1")) {
					System.out.println();
					System.out.println("Digite o pacote que você quer: " + "\nPacote 1 - com destino a Santa Catarina" + "\nPacote 2 - com destino a Fortaleza" + "\nPacote 3 - com destino a ");
					destino = in.nextLine();
					if(destino.equals("Pacote 1 - ")) {
						System.out.println();
						System.out.println("Os dias do pacote são fixos então você terá 3 dias a partir do dia do seu checkin");
						System.out.println("Digite a data de check in (apenas números)");
						int dataDeCheckin = in.nextInt();
						System.out.println("Digite a quantidade de acompanhantes (Você pode escolher no máximo 3)");
						acompanhantes = in.nextInt();
						System.out.println("Pacote: " + destino + "\nCheckin: " + dataDeCheckin + "\nCheckout: " + (dataDeCheckin+2) + "\n Valor do pacote: " + pacotes.pacote1(tempoDeEstadia));
					}
				}else {
					System.out.println("Contate a empresa para atualizar seus dados");
				}
				
			
			
			
		
		
		
	}
	
	}
}
