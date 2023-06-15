package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {


	 @GetMapping({"/","/principal","/Home"})
	 public ModelAndView mostrarPagPrincipal () {
			
			ModelAndView principal= new ModelAndView ("PagPrincipal"); 
			return principal;
			
		}
}