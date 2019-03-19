package xyz.phillipjie.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentServlet {
	@RequestMapping("welcome")
	public String first() {
		
		return "welcome.jsp";
		
	}
}
