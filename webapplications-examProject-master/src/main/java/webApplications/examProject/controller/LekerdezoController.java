package webApplications.examProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Banda;
import webApplications.examProject.model.Bandatag;
import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandaManager;
import webApplications.examProject.service.BandatagManager;

@Controller
public class LekerdezoController {
	
	@Autowired
	private BandaManager bandaManager;
	@Autowired
	private AlbumManager albumManager;
	@Autowired
	private BandatagManager bandatagManager;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(){
		return "index";
	}
	
	@RequestMapping("/bandak")
	public String bandak(Model model) {
		List<Banda> bandaLista = bandaManager.getAllBanda();
		model.addAttribute("bandak", bandaLista);
		return "bandak";
	}
	
	@RequestMapping("/bandatagok")
	public String tagok(Model model) {
		List<Bandatag> bandatagLista = bandatagManager.getAllBandatag();
		model.addAttribute("bandatagok", bandatagLista);
		return "bandatagok";
	}
	
	@RequestMapping("/albumok")
	public String albums(Model model) {
		List<Album> albumLista = albumManager.getAllAlbum();
		model.addAttribute("albumok", albumLista);
		return "albumok";
	}
}
