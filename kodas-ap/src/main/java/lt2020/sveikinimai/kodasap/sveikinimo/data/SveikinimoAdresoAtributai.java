package lt2020.sveikinimai.kodasap.sveikinimo.data;

public class SveikinimoAdresoAtributai {
	
	private String pavadinimas;
	private String adresas;
	private String logo;


	public SveikinimoAdresoAtributai() {
		super();
	}

	public SveikinimoAdresoAtributai(String pavadinimas,
			String adresas,
			String logo) {
		super();
		this.pavadinimas = pavadinimas;
		this.adresas = adresas;
		this.logo = logo;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getAdresas() {
		return adresas;
	}

	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
