package com.hexaware.springmvcexample;
import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	/*
	 *Simply selects the home view to render by returning its name 
	 *
	 */
	
	@RequestMapping(value = "/home", method = RequestMethod.GET )
	public String home(Locale locale,Model model)
	{
		System.out.println("Home Page Requested locale = " + locale);
		Date date = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,locale);
		String formattedDate = df.format(date);
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("myname", "Yasaswi");

		return "home";
	}
	 

}

