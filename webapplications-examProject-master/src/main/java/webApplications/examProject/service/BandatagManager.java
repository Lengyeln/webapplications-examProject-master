package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Bandatag;
import webApplications.examProject.persist.BandatagRepository;

@Service
public class BandatagManager {
	
	@Autowired
	private BandatagRepository bandatagRepository;
	
	public Bandatag saveBandatag(Bandatag bandatag){
		return this.bandatagRepository.save(bandatag);
	}
	
	public Bandatag getBandatagById(int id){
		Bandatag talaltBandatag = bandatagRepository.findOne(id);
		return talaltBandatag;
	}
	
	public List<Bandatag> getAllBandatag() {
		Iterable<Bandatag> it = this.bandatagRepository.findAll();
		List<Bandatag> bandatagLista = new ArrayList<>();
		for(Bandatag m : it) {
			bandatagLista.add(m);
		}
		return bandatagLista;
	}
	
	public void deleteBandatagById(int id){
		bandatagRepository.delete(id);
	}

}
