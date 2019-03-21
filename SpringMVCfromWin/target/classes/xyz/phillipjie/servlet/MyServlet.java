package xyz.phillipjie.servlet;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("my")
public class MyServlet {
@RequestMapping("testexcpt")
	public String testexcpt() {
	System.out.println(1/0);
	return "welcome";
	}
}
