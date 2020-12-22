package lt2020.sveikinimai.kodasap.sveikinimo.rest;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public final class CreateSveikinimoCommand {
	@NotNull
	@Length(min = 1, max = 50)
	private String tekstas;
	@NotNull
	@Length(min = 1, max = 100)
	private String image;
	@NotNull
	@Length(min = 1, max = 100)
	private String audio;
	@NotNull
	@Length(min = 1, max = 200)
	private String nameLastname;
	@Length(min = 1, max = 200)
	private int dateTime;

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
