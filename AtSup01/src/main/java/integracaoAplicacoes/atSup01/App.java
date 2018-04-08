package integracaoAplicacoes.atSup01;

import java.io.IOException;
import java.util.Scanner;

import exercicios.AdicionaTexto_4;
import exercicios.ConverteArqIndex_7;
import exercicios.ConverteBinTxt_6;
import exercicios.ConverteTxtBin_5;
import exercicios.ExibeLinhaIndexada_8;
import exercicios.ExibeTexto_3;
import exercicios.PrimeirosBytes_1;
import exercicios.VerificaJPEG_2;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		int resposta = 0;
		boolean exec5 = false, exec7 = false;
		Scanner scanner = new Scanner(System.in);
		int aux;
		String path1, path2;
		
		do {
			try {
				
				System.out.println("\n\n\nBem vindo ao conjunto de algoritmos da primeira atividade supervisionada!");
				System.out.println("Insira de 1 a 8, conforme a questão que deseja testar ou 0 para sair:\n");
				System.out.println("1 - Primeiros bytes de um arquivo \n"
						+ "2 - Arquivo JPEG ou não \n"
						+ "3 - Exibir conteúdo de arquivo \n"
						+ "4 - Adicionar texto a arquivo \n"
						+ "5 - Converter arquivo texto para arquivo binário \n"
						+ "6 - Converter arquivo binário para texto (requer execução da questão 5) \n"
						+ "7 - Conversão da questão 6 melhorada com index \n"
						+ "8 - Exibir conteúdo de uma linha de um arquivo binário (requer execução da questão 7)");
				resposta = Integer.parseInt(scanner.nextLine());

				switch (resposta) {
				case 0:
					System.out.println("Adeus");
					break;
				case 1:
					System.out.println("Informe o caminho de um arquivo, e eu lhe direi quais são os primeiros bytes dele:");
					path1 = scanner.nextLine();
					PrimeirosBytes_1.main(new String[] {path1});
					break;
				case 2:
					System.out.println("Informe o caminho de um arquivo JPEG(.jpg), e eu lhe direi se ele é realmente um arquivo JPEG:");
					path1 = scanner.nextLine();
					VerificaJPEG_2.main(new String[] {path1});
					break;
				case 3:
					System.out.println("Informe o caminho de um arquivo texto, e eu lhe direi o que ele contém em si:");
					path1 = scanner.nextLine();
					ExibeTexto_3.main(new String[] {path1});
					break;
				case 4:
					System.out.println("Informe o caminho de um arquivo texto:");
					path1 = scanner.nextLine();
					System.out.println("Agora informe um texto qualquer, entre aspas(\"), e eu escreverei no arquivo informado:");
					path2 = scanner.nextLine();
					AdicionaTexto_4.main(new String[] {path1, path2});
					break;
				case 5:
					System.out.println("Informe o caminho de um arquivo texto:");
					path1 = scanner.nextLine();
					System.out.println("Informe o caminho de um arquivo qualquer, e eu reescreverei o arquivo texto, na forma de bytes:");
					path2 = scanner.nextLine();
					ConverteTxtBin_5.main(new String[] {path1, path2});
					exec5 = true;
					break;
				case 6:
					if(exec5) {
						System.out.println("Informe o caminho de um arquivo produzido pela questão 5, e eu lhe direi o que ele contém em si:");
						path1 = scanner.nextLine();
						System.out.println("\n");
						ConverteBinTxt_6.main(new String[] {path1});
					} else {
						System.out.println("Execute a questão 5 primeiro!");
					}
					break;
				case 7:
					System.out.println("Informe o caminho de um arquivo texto:");
					path1 = scanner.nextLine();
					System.out.println("Informe o caminho de um arquivo qualquer, e eu reescreverei o arquivo texto, na forma de bytes, mas melhor do que na questão 5:");
					path2 = scanner.nextLine();
					ConverteArqIndex_7.main(new String[] {path1, path2});
					exec7 = true;
					break;
				case 8:
					if(exec7) {
						System.out.println("Informe o caminho de um arquivo produzido pela questão 7:");
						path1 = scanner.nextLine();
						System.out.println("Informe o número de uma linha qualquer do arquivo, e eu lhe direi o que ela diz:");
						aux = Integer.parseInt(scanner.nextLine());
						System.out.println("\n");
						ExibeLinhaIndexada_8.main(new String[] {path1, String.valueOf(aux)});
					} else {
						System.out.println("Execute a questão 7 primeiro!");
					}
					break;
				default:
					System.out.println("Esta opção não é válida\n\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("Esta opção é inválida, digite números\n\n");
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		} while (resposta != 0);
		
		scanner.close();
	}
}
