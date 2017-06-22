package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webApplications.examProject.model.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
