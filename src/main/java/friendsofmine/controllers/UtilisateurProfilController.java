package friendsofmine.controllers;

import friendsofmine.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilisateurProfilController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping(value = "/utilisateur/{id}")
    public String showUtilisateur(@PathVariable Long id, Model model) {
        if(utilisateurService.findOneUtilisateur(id) == null){
            return "error";
        }
        else {
            model.addAttribute("utilisateur", utilisateurService.findOneUtilisateur(id));
            return "utilisateurShow";
        }
    }

}