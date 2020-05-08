
public class Telemovel implements Vendaveis{
	
	private String designacao;
	private double valorVenda;
	
	public Telemovel(String designacao, double valorVenda) {
		this.setDesignacao(designacao);
		this.setValorVenda(valorVenda);
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public double calcularValorVenda() {
		return valorVenda*(1 + Vendaveis.TAXA);
	}
	
}
