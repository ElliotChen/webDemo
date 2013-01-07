package tw.elliot.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.elliot.dao.UserDao;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String init() {
		return "/user/index";
	}
}
