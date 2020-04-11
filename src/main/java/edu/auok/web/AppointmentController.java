package edu.auok.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppointmentController {
	
	@RequestMapping("/appointment")
	public String appointmentPage() {
		return "appointment.html";
	}
}
