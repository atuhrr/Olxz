import java.util.ArrayList;

public class Anunciante {
	public static int TAMANHO_MAXIMO_ALUGAVEIS = 3;
	public static int TAMANHO_MAXIMO_VENDAVEIS = 2;
	
	private String nome;
	private Endereco endereco;
	private ArrayList<Alugaveis> alugueis = new ArrayList<Alugaveis>();
	private ArrayList<Vendaveis> vendas = new ArrayList<Vendaveis>();
	
	public Anunciante(String nome, String nomeDaRua, String codPostal, String localidade) {
		this.nome = nome;
		this.endereco =new Endereco(nomeDaRua, codPostal, localidade);
	}
	
	public void addAluguel(Alugaveis alugavel) throws TamanhoMaximoExcedidoException{
		if(alugueis.size() == TAMANHO_MAXIMO_ALUGAVEIS) {
			throw new TamanhoMaximoExcedidoException("Lista de aluguéis não pode ter mais que 3 itens");
		}
		alugueis.add(alugavel);
	}
	
	public void removeAluguel(int indice){
		alugueis.remove(indice);
	}
	
	public void removeAluguel(Alugaveis alugavel){
		alugueis.remove(alugavel);
	}
	
	public int getTamanhoAlugaveis() {
		return alugueis.size();
	}
	
	public Alugaveis getAluguelMaisCaro() {
		int posicaoMaisCaro = 0;
		double valorMaior = alugueis.get(0).calcularValorAluguel();
		for (int i = 0; i < alugueis.size(); i++) {
			if(alugueis.get(i).calcularValorAluguel() > valorMaior) {
				valorMaior = alugueis.get(i).calcularValorAluguel();
				posicaoMaisCaro = i;
			}
		}
		return alugueis.get(posicaoMaisCaro);
	}
	
	public double calcularTotalVendas() {
		double total = 0;
		
		for(int i = 0; i<vendas.size(); i++) {
			total += vendas.get(i).calcularValorVenda();
		}
		
		return total;
	}
	
	public void addVenda(Vendaveis vendavel) throws TamanhoMaximoExcedidoException {
		if(alugueis.size() == TAMANHO_MAXIMO_VENDAVEIS) {
			throw new TamanhoMaximoExcedidoException("Lista de vendas não pode ter mais que 2 itens");
		}
		vendas.add(vendavel);
	}
	
	public void removeVenda(int indice) {
		vendas.remove(indice);
	}
	
	public void removeVenda(Vendaveis vendavel) {
		vendas.remove(vendavel);	
	}
	
	public int getTamanhoVendaveis() {
		return vendas.size();
	}
	
	public void setEndereco(String nomeDaRua, String codPostal, String localidade) {
		endereco.setNomeDaRua(nomeDaRua);
		endereco.setCodPostal(codPostal);
		endereco.setLocalidade(localidade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
}
