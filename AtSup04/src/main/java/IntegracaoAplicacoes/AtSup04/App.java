package IntegracaoAplicacoes.AtSup04;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import javax.xml.stream.XMLStreamException;

import exerciciosJDBC.DBManipulation;

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
    			System.out.println("\n\n\n Bem vindo ao conjunto de algoritmos da quarta atividade supervisionada! \n");
    			System.out.println("Insira de 1 a x, conforme a questão que deseja testar ou 0 para sair: \n");
    			System.out.println("1 - Consulta de identificação de um indivíduo \n"
    					+ "2 - Carregamento de um arquivo XML de tênis e sapatos \n"
    					+ "3 - Serialização de uma instância de um objeto Turma para XML \n"
    					+ "4 - Desserialização de um arquivo XML de uma Turma para objeto Turma (Para economizar tempo, execute primeiro o exercício 3) \n"
    					+ "5 - Serialização e desserialização de pacientes \n");
    			resposta = Integer.parseInt(scanner.nextLine());
    			
    			switch(resposta) {
    			case 1:
    				
    				break;
    			case 2:

    				break;
    			case 3:

    				break;
    			case 4:

    				break;
    			case 5:

    				break;
    			case 0:
    				System.out.println("Até mais!");
    				break;
    			default:
    				System.out.println("\n Opção inválida, insira um dos números que são dados \n");
    			}
    		} finally {
				// Nada
			}
    	} while (resposta != 0);
    	
		scanner.close();
    }
}
