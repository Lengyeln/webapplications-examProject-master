package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Banda;
import webApplications.examProject.model.Bandatag;
import webApplications.examProject.persist.BandaRepository;

@Service
public class BandaManager {
	
	@Autowired
	private BandaRepository bandaRepository;
	
	public Banda saveBand(Banda banda){
		return this.bandaRepository.save(banda);
	}
	
	public Banda getBandaById(int id) {
		Banda talaltBanda = bandaRepository.findOne(id);
		return talaltBanda;
	}
	
	public List<Banda> getAllBanda() {
		Iterable<Banda> it = this.bandaRepository.findAll();
		List<Banda> bandaLista = new ArrayList<>();
		for(Banda b : it) {
			bandaLista.add(b);
		}
		return bandaLista;
	}
	
	public void deleteBandaById(int id){
		bandaRepository.delete(id);
	}
	
	public boolean findAlbumIdInBanda(int id) {
		List<Banda> bandaLista = this.getAllBanda();
		for(Banda b : bandaLista) {
			List<Album> albumLista = b.getAlbumok();
			for(Album a : albumLista) {
				if (a.getAlbumID() == id)
					return true;
			}
		}
		return false;
	}
	
	public boolean findMemberIdInBanda(int id) {
		List<Banda> bandaLista = this.getAllBanda();
		for(Banda b : bandaLista) {
			List<Bandatag> bandatagLista = b.getTagok();
			for(Bandatag m : bandatagLista) {
				if (m.getBandatagID() == id)
					return true;
			}
		}
		return false;
	}

}
