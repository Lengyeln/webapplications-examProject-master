package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webApplications.examProject.model.Banda;

@Repository
public interface BandaRepository extends CrudRepository<Banda, Integer> {

}
