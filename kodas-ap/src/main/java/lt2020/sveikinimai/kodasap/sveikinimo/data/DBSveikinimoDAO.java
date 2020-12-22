package lt2020.sveikinimai.kodasap.sveikinimo.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import lt2020.sveikinimai.kodasap.PagingData;



@Repository
@Qualifier("dbDao")
public class DBSveikinimoDAO implements SveikinimoDAO {

	@Autowired
	private PagingData pagingData;
	@PersistenceContext
	private EntityManager entityManager;

	public List<Sveikinimas> getSveikinimai() {
		
		return entityManager.createQuery("SELECT u from User u", Sveikinimas.class)
				.setMaxResults(pagingData.getLimit())
				.getResultList();
	}

	public void createSveikinima(Sveikinimas sveikinimas) {
		entityManager.persist(sveikinimas);
	}

	public void deleteSveikinima(String tekstas) {
		Sveikinimas sveikinimas = entityManager.createQuery("SELECT u from User u where username = :un", Sveikinimas.class)
				.setParameter("un", tekstas).getSingleResult();
		if (entityManager.contains(sveikinimas)) {
			entityManager.remove(sveikinimas);
		} else {
			entityManager.remove(entityManager.merge(sveikinimas));
		}
	}

	@Override
	public Sveikinimas getSveikinimas(String tekstas) {
		Sveikinimas user = entityManager.createQuery("SELECT u from User u where username = :un", Sveikinimas.class)
				.setParameter("un", tekstas).getSingleResult();
		return user;
	}

	public PagingData getPagingData() {
		return pagingData;
	}

	public void setPagingData(PagingData pagingData) {
		this.pagingData = pagingData;
	}

}


