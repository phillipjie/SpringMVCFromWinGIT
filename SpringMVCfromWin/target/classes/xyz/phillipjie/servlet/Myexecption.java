package xyz.phillipjie.servlet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//自定义异常@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="shuzu越界")可以写在类前也可以写在方法前
@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="shuzu越界")
public class Myexecption extends Exception{

}
