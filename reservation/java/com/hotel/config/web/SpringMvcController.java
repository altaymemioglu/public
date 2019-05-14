package com.hotel.config.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMvcController {
	
	@RequestMapping(value = { "/main" }, method = RequestMethod.GET)
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("main");
		return model;
	}
	
	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public ModelAndView welcome1() {
		ModelAndView model = new ModelAndView();
		model.setViewName("welcomePage");
		return model;
	}

	@RequestMapping(value = { "/customer" }, method = RequestMethod.GET)
	public ModelAndView customer() {
		ModelAndView model = new ModelAndView();
		model.setViewName("customer");
		return model;
	}
	
	@RequestMapping(value = { "/help" }, method = RequestMethod.GET)
	public ModelAndView help() {
		ModelAndView model = new ModelAndView();
		model.setViewName("help");
		return model;
	}
	
	@RequestMapping(value = { "/checkin" }, method = RequestMethod.GET)
	public ModelAndView checkin() {
		ModelAndView model = new ModelAndView();
		model.setViewName("checkin");
		return model;
	}
	
	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public ModelAndView checkout() {
		ModelAndView model = new ModelAndView();
		model.setViewName("checkout");
		return model;
	}
	
	@RequestMapping(value = { "/reservation" }, method = RequestMethod.GET)
	public ModelAndView reservation() {
		ModelAndView model = new ModelAndView();
		model.setViewName("reservation");
		return model;
	}
	
	@RequestMapping(value = { "/employee" }, method = RequestMethod.GET)
	public ModelAndView employee() {
		ModelAndView model = new ModelAndView();
		model.setViewName("employee");
		return model;
	}
}