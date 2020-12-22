package lt2020.sveikinimai.kodasap.sveikinimo.service;

public class ServisoSluoksnioSveikinimas {

	private String tekstas;
	private String image;
	private String audio;
	private String nameLastname;
	private int dateTime;

	public ServisoSluoksnioSveikinimas() {
	}

	public ServisoSluoksnioSveikinimas(String tekstas, String image, String audio, String nameLastname, int dateTime) {
		this.tekstas = tekstas;
		this.image = image;
		this.audio = audio;
		this.nameLastname = nameLastname;
		this.dateTime = dateTime;
	} // toliau - get ir set metodai

	public String getTekstas() {
		return tekstas;
	}

	public void setTekstas(String tekstas) {
		this.tekstas = tekstas;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getNameLastname() {
		return nameLastname;
	}

	public void setNameLastname(String nameLastname) {
		this.nameLastname = nameLastname;
	}

	public int getDateTime() {
		return dateTime;
	}

	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}
}
