package sy.action;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import sy.model.Tuser;
import sy.service.UserServiceI;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "userAction")
public class UserAction {

	private static final Logger logger = Logger.getLogger(UserAction.class);
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	public void test() {
		logger.info("使用Spring Autowired...");
//		ApplicationContext ac =
//				WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//		UserServiceI userService = (UserServiceI)ac.getBean("userService");
		
		userService.save();
	}
	
	
	public void addUser(){
		Tuser t = new Tuser();
		t.setId(UUID.randomUUID().toString());
		t.setName("john");
		t.setPwd("john");
		t.setCreatedatetime(new Date());
		userService.save(t);
	}
}
