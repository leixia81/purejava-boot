package dwp.gov.uk.purejavaboot.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageControllerContextLoadTest {

    @Autowired
    private MessageController messageController;

    @Test
    public void shouldContextLoadOkWithAllDependencies() {
        Assert.assertNotNull(messageController);
    }
}
