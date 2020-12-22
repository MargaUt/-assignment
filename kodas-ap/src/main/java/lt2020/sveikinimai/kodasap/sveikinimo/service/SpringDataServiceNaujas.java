//package lt2020.sveikinimai.kodasap.sveikinimo.service;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import lt2020.sveikinimai.kodasap.sveikinimo.data.Sveikinimas;
//import lt2020.sveikinimai.kodasap.sveikinimo.data.SveikinimoDAO;
//
//public interface SpringDataServiceNaujas extends JpaRepository<Sveikinimas, Long>, SveikinimoDAO {
//	
//	default List<Sveikinimas> getSveikinimas() {
//		return findAll();
//	}
//
//	default void createSveikinima(Sveikinimas sveikinimas) {
//		save(sveikinimas);
//	}
//	
////	default void deleteUser(String username) {
////		delete;
////	}
////
////	User getUser(String username);
//
//}
