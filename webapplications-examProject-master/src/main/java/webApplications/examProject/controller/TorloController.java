package webApplications.examProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandaManager;
import webApplications.examProject.service.BandatagManager;

@Controller
public class TorloController {
	
	@Autowired
	private BandaManager bandaManager;
	@Autowired
	private BandatagManager bandatagManager;
	@Autowired
	private AlbumManager albumManager;
	
	@RequestMapping("/albumTorles")
	public String albumRemove(@RequestParam(required=true) Integer id, RedirectAttributes redirectAttr) {
		if (bandaManager.findAlbumIdInBanda(id)) {
			redirectAttr.addFlashAttribute("hiba", "Nem lehet eltávolítani, mert tartozik hozzá banda!");
			return "redirect:/albumok";
		}
		albumManager.deleteAlbumById(id);
		return "redirect:/albumok";
	}
	
	@RequestMapping("/bandatagTorles")
	public String memberRemove(@RequestParam(required=true) Integer id, RedirectAttributes redirectAttr) {
		if (bandaManager.findMemberIdInBanda(id)) {
			redirectAttr.addFlashAttribute("hiba", "Nem lehet eltávolítani, mert tartozik hozzá banda!");
			return "redirect:/bandatagok";
		}
		bandatagManager.deleteBandatagById(id);
		return "redirect:/bandatagok";
	}
	
	@RequestMapping("/bandaTorles")
	public String bandRemove(@RequestParam(required=true) Integer id) {
		bandaManager.deleteBandaById(id);
		return "redirect:/bandak";
	}

}
