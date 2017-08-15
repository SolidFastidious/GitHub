package com.BuildingCodeViolation.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class BuildingCodeViolationModelView {
	
	@RequestMapping("/index")
	public ModelAndView indexMVC() {
		
		return new ModelAndView("index", "message","");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/UploadBuildingCode")
	public ModelAndView uoloadBuildingCodeMVC() {
		
		return new ModelAndView("UploadBuildingCode", "message","");
	}
	
	@RequestMapping("/downloadList")
	public ModelAndView dowmloadListView() {
		
		return new ModelAndView("downloadList", "message","");
	}


}
