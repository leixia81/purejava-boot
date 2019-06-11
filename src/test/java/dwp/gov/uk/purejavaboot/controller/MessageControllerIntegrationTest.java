package dwp.gov.uk.purejavaboot.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageControllerIntegrationTest {

    @LocalServerPort
    private int localPort;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnGreetMessage() {
        String url = String.format("http://localhost:%d/api/ping", localPort);
        Assert.assertEquals("hello", this.testRestTemplate.getForObject(url, String.class));
    }
}
