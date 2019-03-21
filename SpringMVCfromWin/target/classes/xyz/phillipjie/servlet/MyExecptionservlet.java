package xyz.phillipjie.servlet;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExecptionservlet {
	@ExceptionHandler({ArithmeticException.class})
	public ModelAndView aArithmeticException(ArithmeticException e) {
		System.out.println("我错了");
		System.out.println(e);
		System.out.println("我错了");
		ModelAndView maw=new ModelAndView("welcome");
		maw.addObject("err", e);
		return maw;
	}
}
