package sree.shopping.sreenushopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		
		return mv;
		
	}
	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		
		return mv;
		
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		
		return mv;
		
	}
/*	@RequestMapping(value="/test")
	public ModelAndView greeting(@RequestParam(value="greeting" ,required=false)String greeting){
		if(greeting == null){
			greeting = "Hello there is no Message";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView greeting(@PathVariable(value="greeting" ,required=false)String greeting){
		if(greeting == null){
			greeting = "Hello there is no Message";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	

}
