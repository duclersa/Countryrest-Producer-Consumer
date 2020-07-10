package NewCountryPackage;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Integer>{

	////List<Country> findByUser(String name);
	//List<Country> findByDoneTrue();
	
//	@Query("select t from Todo t where t.user=?1 and t.des=?2") 
//	Todo findByUserAndDescription(String user, String description);

	List<Country> findByName(String name);
}


