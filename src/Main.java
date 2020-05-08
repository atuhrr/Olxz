import java.util.ArrayList;

public class Main {

	public static int TAMANHO_MAXIMO_ANUNCIANTES = 5;
	private static int alugueis = 0;
	private static ArrayList<Anunciante> anunciantes = new ArrayList<Anunciante>();
	
	public static void addAnunciante(Anunciante anunciante) throws TamanhoMaximoExcedidoException {
		if(anunciantes.size() == TAMANHO_MAXIMO_ANUNCIANTES) {
			throw new TamanhoMaximoExcedidoException("Lista de vendas não pode ter mais que 2 itens");
		}
		anunciantes.add(anunciante);
	}
	
	public static int getNumeroAlugueis() {
		for(int i = 0; i < anunciantes.size(); i++) {
			alugueis += anunciantes.get(i).getTamanhoAlugaveis();
		}
		
		return alugueis;
	}
	
	public static String listarAnunciantesComVendas() {
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < anunciantes.size(); i++) {
			if(anunciantes.get(i).getTamanhoVendaveis()>0) {
			buffer.append("\nAnunciante: ");
			buffer.append(anunciantes.get(i).getNome());
			buffer.append("\nEndereço: ");
			buffer.append(anunciantes.get(i).getEndereco().toString());
			buffer.append("\nSomatório das possíveis vendas: ");
			buffer.append(anunciantes.get(i).calcularTotalVendas());
			buffer.append('\n');
			}
		}
		return buffer.toString();
	}
	
	public static String listarAlugueisMaisCaros() {
		StringBuilder buffer = new StringBuilder();
		
		for(int i = 0; i < anunciantes.size(); i++) {
			if(anunciantes.get(i).getTamanhoAlugaveis()>0) {
				
				buffer.append("\nAnunciante: ");
				buffer.append(anunciantes.get(i).getNome());
				buffer.append("\nAlugável mais rentável: ");
				buffer.append(anunciantes.get(i).getAluguelMaisCaro().getNomeClasse());
				buffer.append("\nValor do aluguel: ");
				buffer.append(anunciantes.get(i).getAluguelMaisCaro().calcularValorAluguel());
				buffer.append("\n");
				
			}
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		
		try {
			
		addAnunciante(new Anunciante("a1", "Rua 1", "11111", "Umópolis"));
		addAnunciante(new Anunciante("a2", "Rua 2", "22222", "Duópolis"));
		addAnunciante(new Anunciante("a3", "Rua 3", "33333", "triópolis"));
		
		anunciantes.get(0).addVenda(new Telemovel("123456", 600));
		anunciantes.get(0).addAluguel(new Apartamento("Rua 11", "111-111", "Local 1", 111, 1111));
		anunciantes.get(0).addAluguel(new Automovel("Fiat", "500", 0, 300));
		
		anunciantes.get(1).addVenda(new Automovel("BMW", "M3", 35000, 0));
		anunciantes.get(1).addVenda(new Telemovel("572146", 400));
		anunciantes.get(1).addAluguel(new Apartamento("Rua 22", "222-222", "Local 2", 222, 2222));
		
		anunciantes.get(2).addAluguel(new Apartamento("Rua 331", "331-331", "Local 31", 331, 3331));
		anunciantes.get(2).addAluguel(new Apartamento("Rua 332", "332-332", "Local 32", 332, 3332));
		
		} catch (TamanhoMaximoExcedidoException e) {
			e.printStackTrace();
		}
		
		System.out.println("Número de artigos disponiveis para aluguel: " + getNumeroAlugueis());
		System.out.println("Anunciantes com vendas: " + listarAnunciantesComVendas());
		System.out.println("Alugueis mais rentáveis" + listarAlugueisMaisCaros());
	}

}
