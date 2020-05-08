
public class Automovel implements Alugaveis, Vendaveis {
	
	private String marca;
	private String modelo;
	private double valorVenda;
	private double valorAluguel;
	
	public Automovel(String marca, String modelo, double valorVenda, double valorAluguel) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setValorVenda(valorVenda);
		this.setValorAluguel(valorAluguel);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	@Override
	public double calcularValorVenda() {
		return valorVenda*(1 + Vendaveis.TAXA);
	}
	@Override
	public double calcularValorAluguel() {
		return valorAluguel*(1 + Alugaveis.TAXA);
	}
	@Override
	public String getNomeClasse() {
		return "Automóvel";
	}
	
	
}
