package sy.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.pageModel.Dept;
import sy.service.DeptServiceI;
import sy.service.UserServiceI;

public class TestSpring {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestSpring.class);

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml", "classpath:spring-hibernate.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		
//		Tuser t = new Tuser();
//		t.setId(UUID.randomUUID().toString());
//		t.setName("100");
//		t.setPwd("100");
//		t.setCreatedatetime(new Date());
//		userService.save(t);
	}
	
	@Test
	public void testDept(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml", "classpath:spring-hibernate.xml" });
		DeptServiceI deptService = (DeptServiceI) ac.getBean("deptService");
		List<Dept> result = deptService.getTreeNode(null);
	}
	
}
