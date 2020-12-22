package lt2020.sveikinimai.kodasap.sveikinimo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt2020.sveikinimai.kodasap.sveikinimo.data.Sveikinimas;
import lt2020.sveikinimai.kodasap.sveikinimo.data.SveikinimoDAO;


@Service
public class SveikinimoService {
	@Autowired
	@Qualifier("dbDao")
	private SveikinimoDAO sveikinimoDAO; 


	@Transactional(readOnly = true)
	public List<ServisoSluoksnioSveikinimas> getSveikinimai() {
		
		return sveikinimoDAO.getSveikinimai()
				.stream()
				.map(dbuser -> new ServisoSluoksnioSveikinimas(dbuser.getTekstas(), 
						dbuser.getImage(),
						dbuser.getAudio(),
						dbuser.getNameLastname(),
						dbuser.getDateTime()))
				.collect(Collectors.toList());
	}

	@Transactional
	public void createSveikinima(ServisoSluoksnioSveikinimas sveikinimas) {
		var dbSveikinimas = new Sveikinimas(sveikinimas.getTekstas(),
				sveikinimas.getImage(),
				sveikinimas.getAudio(), 
				sveikinimas.getNameLastname(),
				sveikinimas.getDateTime());
		sveikinimoDAO.createSveikinima(dbSveikinimas);
	}

	public SveikinimoDAO getSveikinimoDAO() {
		return sveikinimoDAO;
	}

	public void setSveikinimoDAO(SveikinimoDAO sveikinimoDAO) {
		this.sveikinimoDAO = sveikinimoDAO;
	}
	
	@Transactional(readOnly = true)
	public ServisoSluoksnioSveikinimas getSveikinimas(String tekstas) {
		var dbUseris = sveikinimoDAO.getSveikinimas(tekstas);
		var servisoUseris = new ServisoSluoksnioSveikinimas(dbUseris.getTekstas(),
				dbUseris.getImage(), 
				dbUseris.getAudio(), 
				dbUseris.getNameLastname(),
				dbUseris.getDateTime());
		return servisoUseris;
	}

	@Transactional
	public void deleteSveikinima(String tekstas) {
		sveikinimoDAO.deleteSveikinima(tekstas);

	}

}
