package mvn.spring.mvc.web;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

import mvn.spring.mvc.proj.entity.CollectionJavaBean;
import mvn.spring.mvc.proj.entity.JavaBean;
import mvn.spring.mvc.proj.service.CollectionBeanService;
import mvn.spring.mvc.proj.service.JavaBeanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger("HomeController");
	
	@Autowired
	private CollectionBeanService collectionBeanService;
	
	@Autowired
	private JavaBeanService javaBeanService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}."+ locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("Date", formattedDate );

		return "public/home";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homePage(Model model, Locale locale){
		logger.info("Inside home page controller... ");
		Calendar cal = Calendar.getInstance(locale);
		model.addAttribute("Date", cal.getTimeZone().toString());
		logger.info("Returning following model "+model.toString());
		return "public/home";
		
	}
	
	@RequestMapping(value="/addCollection",method=RequestMethod.GET)
	public ModelAndView showAddCollection(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("CollectionJavaBean", new CollectionJavaBean());
		modelAndView.setViewName("addOrUpdate/collection");
		return modelAndView;
	}
	
	@RequestMapping(value="/addCollection",method=RequestMethod.POST)
	public ModelAndView saveCollection(@ModelAttribute CollectionJavaBean bean, BindingResult result){
		collectionBeanService.saveCollBean(bean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("CollectionJavaBean", new CollectionJavaBean());
		modelAndView.setViewName("addOrUpdate/collection");
		return modelAndView;
	}
	
	@RequestMapping(value="/addBean",method=RequestMethod.GET)
	public ModelAndView showAddBean(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("javaBean", new JavaBean());
		modelAndView.setViewName("addOrUpdate/bean");
		return modelAndView;
	}
	
	@RequestMapping(value="/addBean",method=RequestMethod.POST)
	public ModelAndView saveBean(@ModelAttribute JavaBean bean, BindingResult result){
		javaBeanService.saveBean(bean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("javaBean", new JavaBean());
		modelAndView.setViewName("addOrUpdate/bean");
		return modelAndView;
	}
}
