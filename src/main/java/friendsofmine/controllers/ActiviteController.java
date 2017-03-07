package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import friendsofmine.domain.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
;
/**
 * Created by thibauttang on 07/03/2017.
 */

@Controller
public class ActiviteController {

    @Autowired
    private Bootstrap bootstrap;

    @RequestMapping(value="/activites", method=RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("activites", bootstrap.getActivites());
        return "activites";
    }

}