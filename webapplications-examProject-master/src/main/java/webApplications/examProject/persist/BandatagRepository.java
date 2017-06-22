package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webApplications.examProject.model.Bandatag;

@Repository
public interface BandatagRepository extends CrudRepository<Bandatag, Integer> {

}
