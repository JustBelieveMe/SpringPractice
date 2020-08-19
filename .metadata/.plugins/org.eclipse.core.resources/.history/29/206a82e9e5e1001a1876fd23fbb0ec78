package spring01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/ctx_ut.xml" })
public class ContextLoadTest {
	
	private HelloWorld Helloworld;
	private SeeYou seeyou;
	private Goodbye goodbye;
	
	@Autowired //Dependency Injection to ApplicationContext to get a instance Object back
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		Helloworld = (HelloWorld) context.getBean("dataSource");
		seeyou = (SeeYou) context.getBean("seeyou");
		goodbye = (Goodbye) context.getBean("goodbye");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void loadContextTest() {	
		System.out.println("HelloWorld: " + Helloworld.getMessage());
		System.out.println("Seeyou: " + seeyou.getMessage());
		System.out.println("Goodbye: " + goodbye.getMessage());
	}
}
