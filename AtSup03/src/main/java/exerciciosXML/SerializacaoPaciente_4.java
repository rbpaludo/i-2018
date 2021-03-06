package exerciciosXML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.stream.XMLStreamException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import exerciciosXML.paciente.Certidao;
import exerciciosXML.paciente.Comunicacao;
import exerciciosXML.paciente.DadoDemografico;
import exerciciosXML.paciente.Data;
import exerciciosXML.paciente.Endereco;
import exerciciosXML.paciente.Identificador;
import exerciciosXML.paciente.Individuo;
import exerciciosXML.paciente.Nacionalidade;
import exerciciosXML.paciente.Nome;

/**
 * Classe para serialização de uma instância do objeto Indivíduo
 * 
 * @author rbpaludo
 *
 */
public class SerializacaoPaciente_4 {

	/**
	 * Instancia um objeto Individuo, com todas as suas referencias e seus atributos obrigatorios e alguns opcionais, 
	 * além de chamar a função que faz a serialização da instância criada
	 * 
	 * @param args Nome do arquivo que será usado para armazenar a instância serializada
	 * @throws ParseException Caso aconteça algum erro durante a conversão de texto para data. Não deveria ocorrer nesta versão.
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 * @throws XMLStreamException Caso aconteça algum erro durante a serialização da instância criada. 
	 */
	public static void main(String[] args) throws ParseException, IOException, XMLStreamException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Calendar dataEntradaPais = Calendar.getInstance();
		dataEntradaPais.setTime(sdf.parse("14/07/1991"));
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(sdf.parse("14/01/1987"));

		Nacionalidade nacionalidade = new Nacionalidade("Blumenau", "Santa Catarina", "Brasil", dataEntradaPais);
		Data nascimento = new Data(dataNascimento, "Exata");
		DadoDemografico dadoDemo = new DadoDemografico("Feminino", "Epaminondas Soares", "Gerovildes Carmelindes", "Solteira", "Branca", "da Suazilândia", "Negro", "Filha Única", "Filha Única");
		dadoDemo.setDataNascimento(nascimento);
		dadoDemo.setNacionalidade(nacionalidade);

		Comunicacao comm = new Comunicacao("Telefone", "Muito", "Ligar somente à noite", "Restrito");

		Data inicioEndereco = new Data(dataEntradaPais, "Estimada");
		Endereco endereco = new Endereco(2, "Itoupavazinha", "Kyoto", 21, "Santa Catarina", "123456-12", "132123", "Brasil", "UmTipoLegal");
		endereco.setDataInicio(inicioEndereco);

		Nome nome = new Nome(3, "Dra", "Maricreuza", "Djibuti Alou", "de Souza", "Ana", "Sim");

		Certidao certidao = new Certidao("Nascimento", "Creuzer", "212-a", "12", "1-b");
		Identificador id = new Identificador(3, "Nascimento", "51", "Joricreuzo", dataNascimento, "Um tipo mais legal");

		Individuo individuo = new Individuo(1, new Nome[] {nome}, new Identificador[] {id});
		individuo.setComunicacoes(new Comunicacao[] {comm});
		individuo.setEnderecos(new Endereco[] {endereco});
		individuo.setDadoDemografico(dadoDemo);

		System.out.println("Para economizar seu tempo foi criado o seguinte objeto Individuo: \n" + individuo.toString());

		serializaPaciente(individuo, args[0]);
		System.out.println("\n\nO individuo foi armazenado no arquivo informado\n\n");
	}

	/**
	 * Serializa uma instância de um Individuo e armazena-a no arquivo informado
	 * 
	 * @param individuo Instância do Individuo a ser serializada
	 * @param arquivo Path do arquivo informado. Será usado para armazenar a instância serializada do Individuo
	 * @throws IOException Caso aconteça algum erro durante o armazenamento de algum arquivo. 
	 * 						Provavelmente por inexistência do arquivo informado.
	 * @throws XMLStreamException Caso aconteça algum erro durante a serialização da instância criada. 
	 */
	public static void serializaPaciente(Individuo individuo, String arquivo) throws IOException, XMLStreamException {



		XmlMapper objMapper = new XmlMapper();

		String data = objMapper.writeValueAsString(individuo);

		Files.write(Paths.get(arquivo), data.getBytes(), StandardOpenOption.APPEND);
	}
}
