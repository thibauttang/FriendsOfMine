package friendsofmine.controllers;

import friendsofmine.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping(value = "/utilisateurs")
    public String list(Model model) {
        model.addAttribute("utilisateurs", utilisateurService.findAllUtilisateurs());
        return "utilisateurs";
    }

}
