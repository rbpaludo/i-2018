package IntegracaoAplicacoes.AtSup03;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import javax.xml.stream.XMLStreamException;

import exerciciosXML.CarregaXML_2;
import exerciciosXML.ConverteCSV_XML_1;
import exerciciosXML.ConverteObjXML_3;
import exerciciosXML.ConverteXMLObj_3;
import exerciciosXML.DesserializaPaciente_4;
import exerciciosXML.SerializacaoPaciente_4;
import exerciciosXML.turma.Turma;

/**
 * 
 * @author rbpaludo
 *
 */
public class App 
{
	/**
	 * Menu para funcionalidades das atividades supervisionadas
	 * @param args: Não utilizado 
	 */
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
    					+ "4 - Desserialização de um arquivo XML de uma Turma para objeto Turma (Para economizar tempo, execute primeiro o exercício 3) \n"
    					+ "5 - Serialização e desserialização de pacientes \n");
    			resposta = Integer.parseInt(scanner.nextLine());
    			
    			switch(resposta) {
    			case 1:
    				System.out.println("Insira o nome do arquivo .csv que você quer converter. (Sugestão para economizar tempo: joaoSilva.csv)");
    				ConverteCSV_XML_1.main(new String[] {scanner.nextLine()});
    				break;
    			case 2:
    				System.out.println("Insira o nome do arquivo .xml que você quer converter. (Sugestão para economizar tempo: calcados.xml)");
    				CarregaXML_2.main(new String[] {scanner.nextLine()});
    				break;
    			case 3:
    				System.out.println("Insira o arquivo no qual você quer inserir a Turma serializada: ");
    				ConverteObjXML_3.main(new String[] {scanner.nextLine()});
    				break;
    			case 4:
    				System.out.println("Insira o arquivo que voce quer converter para objeto Java: (Sugestão para economizar tempo: Insira o mesmo nome que voce inseriu no exercicio 3)");
    				ConverteXMLObj_3.main(new String[] {scanner.nextLine()});
    				break;
    			case 5:
    				System.out.println("Insira o nome do arquivo no qual deseja armazenar a instância do objeto Individuo serializada: ");
    				String arquivo = scanner.nextLine();
    				SerializacaoPaciente_4.main(new String[] {arquivo});
    				DesserializaPaciente_4.main(new String[] {arquivo});
    				break;
    			case 0:
    				System.out.println("Até mais!");
    				break;
    			default:
    				System.out.println("\n Opção inválida, insira um dos números que são dados \n");
    			}
    		} catch (IOException e) {
    			System.out.println("Houve um problema no processo de escrever dados em algum arquivo. \n"
    					+ "É provável que o arquivo informado não exista. \n"
    					+ "Envie este erro para o desenvolvedor:");
    			e.printStackTrace();
			} catch (XMLStreamException e) {
				System.out.println("Houve um problema no processo de converter algum ojeto para XML. ");
			} catch (ParseException e) {
				System.out.println("Houve um problema no processo de conversão de texto para data. Alguma informação errada da data foi dada");
			}
    	} while (resposta != 0);
    	
		scanner.close();
    }
}
