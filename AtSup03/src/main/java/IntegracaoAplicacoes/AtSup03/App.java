package IntegracaoAplicacoes.AtSup03;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.stream.XMLStreamException;

import exerciciosXML.CarregaXML_2;
import exerciciosXML.ConverteCSV_XML_1;
import exerciciosXML.ConverteObjXML_3;
import exerciciosXML.ConverteXMLObj_3;
import exerciciosXML.SerializacaoPaciente_4;
import exerciciosXML.turma.Turma;

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
    			System.out.println("\n\n\n Bem vindo ao conjunto de algoritmos da terceira atividade supervisionada! \n");
    			System.out.println("Insira de 1 a 4, conforme a questão que deseja testar ou 0 para sair: \n");
    			System.out.println("1 - Conversão lista CSV de alunos para XML \n"
    					+ "2 - Carregamento de um arquivo XML de tênis e sapatos \n"
    					+ "3 - Serialização de uma instância de um objeto Turma para XML \n"
    					+ "4 - Desserialização de um arquivo XML de uma Turma para objeto Turma \n"
    					+ "5 - Serialização e desserialização de pacientes \n");
    			resposta = Integer.parseInt(scanner.nextLine());
    			
    			switch(resposta) {
    			case 1:
    				ConverteCSV_XML_1.main(new String[] {"joaoSilva.csv"});
    				break;
    			case 2:
    				CarregaXML_2.main(new String[] {"calcados.xml"});
    				break;
    			case 3:
    				ConverteObjXML_3.main(null);
    				break;
    			case 4:
    				ConverteXMLObj_3.main(new String[] {"turmaXML.xml"});
    				break;
    			case 5:
    				SerializacaoPaciente_4.main(new String[] {""});
    				break;
    			case 0:
    				break;
    			default:
    				System.out.println("\n Opção inválida, insira um dos números que são dados \n");
    			}
    		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} while (resposta != 0);
    	
		scanner.close();
    }
}
