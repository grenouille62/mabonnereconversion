package ecolededev.pe.home;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ecolededev.pe.rome.Rome;
import ecolededev.pe.rome.RomeService;

@Controller
class HomeController {

	@Autowired
	private RomeService romeService;

	@ModelAttribute("module")
	String module() {
		return "home";
	}

	@GetMapping("/")
	String index(Principal principal, Model model) {
		if (principal != null) {
			return "home/homeSignedIn";
		} else {
			HomeForm homeForm = (HomeForm) model.asMap().get("homeForm");
			if (homeForm == null) {
				homeForm = new HomeForm();
				model.addAttribute("homeForm", homeForm) ;
				List<Rome> romeList = romeService.loadAll();
				homeForm.setListeRome(romeList);
			}
			return "home/homeNotSignedIn";
		}
	}
}
