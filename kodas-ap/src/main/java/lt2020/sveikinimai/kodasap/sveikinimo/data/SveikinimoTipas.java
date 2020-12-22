package lt2020.sveikinimai.kodasap.sveikinimo.data;

public class SveikinimoTipas {


	private String gyvasSveikinimasPastate;
	private String sveikinimasPerTv;
	private String internetinisSveikinimas;


	public SveikinimoTipas() {
		super();
	}

	public SveikinimoTipas(String gyvasSveikinimasPastate,
			String sveikinimasPerTv,
			String internetinisSveikinimas) {
		super();
		this.gyvasSveikinimasPastate = gyvasSveikinimasPastate;
		this.sveikinimasPerTv = sveikinimasPerTv;
		this.internetinisSveikinimas = internetinisSveikinimas;
	}
	
	public String getGyvasSveikinimasPastate() {
		return gyvasSveikinimasPastate;
	}

	public void setGyvasSveikinimasPastate(String gyvasSveikinimasPastate) {
		this.gyvasSveikinimasPastate = gyvasSveikinimasPastate;
	}

	public String getSveikinimasPerTv() {
		return sveikinimasPerTv;
	}

	public void setSveikinimasPerTv(String sveikinimasPerTv) {
		this.sveikinimasPerTv = sveikinimasPerTv;
	}

	public String getInternetinisSveikinimas() {
		return internetinisSveikinimas;
	}

	public void setInternetinisSveikinimas(String internetinisSveikinimas) {
		this.internetinisSveikinimas = internetinisSveikinimas;
	}



//	
//	@Override
//	public String toString() {
//		return tekstas;
//	}

}
