
public class Apartamento implements Alugaveis{
	
	private Endereco endereco;
	private double area;
	private double valorAluguel;
	
	public Apartamento(String nomeDaRua, String codPostal, String localidade, double area, double valorAluguel) {
		this.endereco = new Endereco(nomeDaRua, codPostal, localidade);
		this.setArea(area);
		this.setValorAluguel(valorAluguel);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(String nomeDaRua, String codPostal, String localidade) {
		endereco.setNomeDaRua(nomeDaRua);
		endereco.setCodPostal(codPostal);
		endereco.setLocalidade(localidade);
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	@Override
	public double calcularValorAluguel() {
		return valorAluguel*(1 + TAXA);
	}

	@Override
	public String getNomeClasse() {
		return "Apartamento";
	}

}
