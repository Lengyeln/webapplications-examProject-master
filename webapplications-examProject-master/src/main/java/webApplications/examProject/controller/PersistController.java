package webApplications.examProject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Banda;
import webApplications.examProject.model.Bandatag;
import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandaManager;
import webApplications.examProject.service.BandatagManager;

@Controller
public class PersistController {
	
	@Autowired
	private BandaManager bandaManager;
	@Autowired
	private BandatagManager bandatagManager;
	@Autowired
	private AlbumManager albumManager;
	
	@RequestMapping("/albumForm")
	public String albumForm(@RequestParam(required=false) Integer id, @ModelAttribute("album") Album album) {
		if (id == null) {
			album.setAlbumID(0);
			album.setCim("");
			album.setEladottDb(0);
			album.setKiadasDatum(0);
		} else {
			Album tempAlbum = albumManager.getAlbumById(id);
			album.setAlbumID(tempAlbum.getAlbumID());
			album.setCim(tempAlbum.getCim());
			album.setEladottDb(tempAlbum.getEladottDb());
			album.setKiadasDatum(tempAlbum.getKiadasDatum());

		}
		return "albumform";
	}
	
	@RequestMapping("/insertAlbum")
	public String insertAlbum(@Valid @ModelAttribute("album") Album album, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "albumform";
		albumManager.saveAlbum(album);	
		return "redirect:/albumok";
	}
	
	@RequestMapping("/bandatagForm")
	public String memberForm(@RequestParam(required=false) Integer id, @ModelAttribute("bandatag") Bandatag tag, Model model) {
		if (id == null) {
			tag.setBandatagID(0);
			tag.setNev("");
			tag.setNem("");
			tag.setHangszer("");
			tag.setSzuletesiDatum(null);
			tag.setSzuletesiHely("");
			
		} else {
			Bandatag tempMember = bandatagManager.getBandatagById(id);
			tag.setBandatagID(tempMember.getBandatagID());
			tag.setNev(tempMember.getNev());
			tag.setNem(tempMember.getNem());
			tag.setHangszer(tempMember.getHangszer());
			tag.setSzuletesiDatum(tempMember.getSzuletesiDatum());
			tag.setSzuletesiHely(tempMember.getSzuletesiHely());
		}
		return "bandatagform";
	}
	
	@RequestMapping("/insertBandatag")
	public String insertMember(@Valid @ModelAttribute("bandatag") Bandatag tag, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "bandatagform";
		bandatagManager.saveBandatag(tag);	
		return "redirect:/bandatagok";
	}
	
	@RequestMapping("/bandaForm")
	public String bandaForm(@RequestParam(required=false) Integer id, @ModelAttribute("banda") Banda banda, Model model) {
		if (id == null) {
			banda.setBandaID(0);
			banda.setNev("");
			banda.setMufaj("");
			banda.setSzarmazas("");
			banda.setAlbumok(null);
			banda.setTagok(null);
			model.addAttribute("bandatagok", bandatagManager.getAllBandatag());
			model.addAttribute("albumok", albumManager.getAllAlbum());
		} else {
			Banda tempBand = bandaManager.getBandaById(id);
			banda.setBandaID(tempBand.getBandaID());
			banda.setNev(tempBand.getNev());
			banda.setMufaj(tempBand.getMufaj());
			banda.setSzarmazas(tempBand.getSzarmazas());
			banda.setAlbumok(tempBand.getAlbumok());
			banda.setTagok(tempBand.getTagok());
			model.addAttribute("bandatagok", bandatagManager.getAllBandatag());
			model.addAttribute("albumok", albumManager.getAllAlbum());
		}
		return "bandaform";
	}
	
	@RequestMapping("/insertBanda")
	public String insertBand(@Valid @ModelAttribute("banda") Banda banda, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "bandaform";
		bandaManager.saveBand(banda);	
		return "redirect:/bandak";
		
	}
}
