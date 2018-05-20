package IntegracaoAplicacoes.AtSup02;

import java.io.IOException;
import java.util.Scanner;

import exerciciosSerialize.CausesException_1;
import exerciciosSerialize.SalvaGitHubUserImg;
import exerciciosSerialize.Serializa_2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int resposta = 0;
    	Scanner scanner = new Scanner(System.in);
    	do {
    		try {
    			System.out.println("\n\n\nBem vindo ao conjunto de algoritmos da segunda atividade supervisionada!");
    			System.out.println("Insira de 1 a 3, conforme a questão que deseja testar ou 0 para sair:\n");
    			System.out.println("1 - Exceção de classe não serializavel \n"
    					+ "2 - Serialização e desserialização de uma classe \n"
    					+ "3 - Recuperação do avatar de um usuário do GitHub \n");
    			resposta = Integer.parseInt(scanner.nextLine());
    			
    			switch(resposta) {
    			case 1:
    				System.out.println("Esta é a excessão:");
    				CausesException_1.main(new String[] {});
    				break;
    			case 2:
    				Serializa_2.main(args);
    				break;
    			case 3:
    				System.out.println("Digite o nome de usuário de um usuário do GitHub");
    				SalvaGitHubUserImg.main(new String[] {scanner.nextLine()});
    				System.out.println("A imagem foi armazenada no arquivo image na pasta raíz do projeto");
    				break;
    			case 0:
    				break;
    			default:
    				System.out.println("\n Opção inválida, insira um dos números que são dados \n");
    			}
    		} catch (IOException e) {
				// TODO: handle exception
    			e.printStackTrace();
    			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} while (resposta != 0);
    	
		scanner.close();
    }
}
