package xyz.phillipradexu.converter;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;

import xyz.phillipjie.entity.Student;

public  class StringToStudent implements Converter<String,Student>{

	public Student convert(String stu) {
		String[] split = stu.split("-");
		Student student=new Student();
		student.setId(Integer.valueOf(split[0]));
		student.setName(split[1]);
		student.setBirthday(null);
		return student;
	}


}
