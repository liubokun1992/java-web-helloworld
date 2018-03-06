package Service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IPersonService;

public class PersonServiceTest {
	
	private BeanFactory factory = null;
	
	@Before
	public void before() {
		factory = new ClassPathXmlApplicationContext("context.xml");
	}
	
	@Test
    public void testSpring() {
        IPersonService personService = (IPersonService) factory.getBean("personService");
        personService.processSave();
//      ²âÊÔ·½·¨¶þ   
//      ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
//      IPersonService personService2= (IPersonService)ctx.getBean("IPersonService");
//      personService2.processSave();
    }

}
