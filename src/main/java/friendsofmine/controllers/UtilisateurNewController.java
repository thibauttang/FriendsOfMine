package friendsofmine.controllers;

import friendsofmine.domain.Utilisateur;
import friendsofmine.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class UtilisateurNewController extends WebMvcConfigurerAdapter {

    @Autowired
    private UtilisateurService utilisateurService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/utilisateur").setViewName("utilisateur");
    }

    @GetMapping("/utilisateur/new")
    public String showForm(Utilisateur utilisateur) {
        return "utilisateurForm";
    }

    @PostMapping("/utilisateur")
    public String checkUtilisateurInfo(@Valid Utilisateur utilisateur, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "utilisateurForm";
        }

        utilisateurService.saveUtilisateur(utilisateur);

        return "redirect:/utilisateur/" + utilisateur.getId();
    }
}