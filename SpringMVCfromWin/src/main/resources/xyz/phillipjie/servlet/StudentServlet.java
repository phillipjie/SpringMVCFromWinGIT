package xyz.phillipjie.servlet;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import xyz.phillipjie.entity.Student;

@Controller
public class StudentServlet {
	@RequestMapping("welcome")
	public String first() {
		
		return "welcome";
		
	}
	//@Valid用于hibernate校验
	@RequestMapping("geshihua")
	public String geshihua(@Valid Student student,BindingResult result ,Map<String,Object> map) {
		System.out.println(student);
		if(result.getErrorCount()>0) {
			for(FieldError error:result.getFieldErrors()) {
				System.out.println(error.getDefaultMessage());
				map.put("errors",result.getFieldErrors());
			}
		}
		return "welcome";
	}
	@RequestMapping("zhuanhuanqi")
	public String zhuanhuanqi(@RequestParam("stuinfo") Student sto) {
	System.out.println(sto);
		return "welcome";
	}
}
