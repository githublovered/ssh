package ssh.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zwl.po.Company;
import com.zwl.service.CompanyService;
import com.zwl.service.UserService;

public class TestA {
	@Autowired
	//private UserService userService;
	private CompanyService companyService;
	@Before
	public void setUp(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		companyService=ctx.getBean(CompanyService.class);
	}
	
	@Test
	public void testFind(){
		List<Company> companies = companyService.findAll();
		for (Company company : companies) {
			System.out.println(company.getName());
		}
	}
}
