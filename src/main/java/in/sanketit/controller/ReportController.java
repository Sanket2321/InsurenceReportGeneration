package in.sanketit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.sanketit.service.ReportService;

@Controller
public class ReportController {
	@Autowired
	private ReportService service;
	@GetMapping("/sanket")
    public  String indexpage()
    {
		return "index";
    	
    }
}
