package friendsofmine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thibauttang on 27/02/2017.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }

}
