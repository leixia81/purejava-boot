package dwp.gov.uk.purejavaboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(applicationContext);
    }
}
