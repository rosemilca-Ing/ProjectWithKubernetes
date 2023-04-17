package com.projet.service1;


import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

@Controller
public class WelcomeController {  
	@Value("${backEndURL}")
	String backEndURL;
	
    @GetMapping({"/hello", "/"})
    public String hello(Model model) {
    	RestTemplate restTemplate = new RestTemplate();
    	
    	String name = restTemplate.getForObject(backEndURL, String.class);
    	model.addAttribute("name", name);
        return "welcome";
    }
}
