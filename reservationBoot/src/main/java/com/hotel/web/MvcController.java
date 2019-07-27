package com.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	
	@GetMapping(path = "/main")
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("main");
		return model;
	}
	
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
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