package lt2020.sveikinimai.kodasap.sveikinimo.data;

import java.util.List;


public interface SveikinimoDAO {
	List<Sveikinimas> getSveikinimai();

	void createSveikinima(Sveikinimas Sveikinimas);

	void deleteSveikinima(String tekstas);

	Sveikinimas getSveikinimas(String tekstas);
	

}
