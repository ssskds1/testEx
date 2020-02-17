package spring.web.ch05.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("ch05.userController")
@RequestMapping("/ch05/ex02/user")
public class UserController {
	@RequestMapping
	public String form(){
		return "ch05/ex02/userIn";
	}
	
	@RequestMapping(value="/register")
	@ResponseBody
	public User register(User user){
		System.out.println(user.getAge());
		System.out.println(user.getAge());
		System.out.println(user.getName());

		return user;
	}
}
