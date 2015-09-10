package ena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sn.adie.ena.ConcoursEna02Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConcoursEna02Application.class)
@WebAppConfiguration
public class ConcoursEna02ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
