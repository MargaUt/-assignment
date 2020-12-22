package lt2020.sveikinimai.kodasap.sveikinimo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sveikinimas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String tekstas;
	private String image;
	private String audio;
	private String nameLastname;
	private int dateTime;

	public Sveikinimas() {
		super();
	}

	public Sveikinimas(String tekstas, String image, String audio, String nameLastname, int dateTime) {
		super();
		this.tekstas = tekstas;
		this.image = image;
		this.audio = audio;
		this.nameLastname = nameLastname;
		this.dateTime = dateTime;

	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	@Override
//	public String toString() {
//		return tekstas;
//	}

}
