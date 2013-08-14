package org.spring.mongo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.mongo.domain.User;
import org.spring.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.GET)
	public ModelAndView showForm(Locale locale, HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		User user = new User();
		String formattedDate = dateFormat.format(date);
		modelAndView.addObject(user);
		modelAndView.addObject(formattedDate);
		modelAndView.addObject("enableEdit", true);
		modelAndView.setViewName("userForm");
		return modelAndView;
		
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user, BindingResult result){
		ModelAndView modelAndView = new ModelAndView();
		
		userService.saveUser(user);
		modelAndView.addObject(user);
		modelAndView.addObject("enableEdit", false);
		modelAndView.setViewName("userForm");
		return modelAndView;
		
	}
}
