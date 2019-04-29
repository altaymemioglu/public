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
	
	@RequestMapping(value = { "/checkin" }, method = RequestMethod.GET)
	public ModelAndView checkinPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("checkin");
		return model;

	}
	
	@RequestMapping(value = { "/bootstrap" }, method = RequestMethod.GET)
	public ModelAndView bootstrap() {
		ModelAndView model = new ModelAndView();
		model.setViewName("bootstrap");
		return model;

	}
	
	@RequestMapping(value = { "/checkout" }, method = RequestMethod.GET)
	public ModelAndView checkoutPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("checkout");
		return model;

	}
	
	@RequestMapping(value = { "/reservation" }, method = RequestMethod.GET)
	public ModelAndView reservationPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("reservation");
		return model;

	}
}