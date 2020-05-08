
public class Endereco {
	
	public Endereco(String nomeDaRua, String codPostal, String localidade) {
		this.nomeDaRua = nomeDaRua;
		this.codPostal = codPostal;
		this.localidade = localidade;
	}
	private String nomeDaRua;
	private String codPostal;
	private String localidade;
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	@Override
	public String toString() {
		return "Rua: " + nomeDaRua + "\nCódigo Postal: " + codPostal + "\nLocalidade:" + localidade;
	}
	
	
}
