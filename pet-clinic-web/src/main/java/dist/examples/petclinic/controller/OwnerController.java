package dist.examples.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dist.examples.petclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String listVets(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
