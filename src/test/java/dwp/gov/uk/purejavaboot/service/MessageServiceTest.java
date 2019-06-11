package dwp.gov.uk.purejavaboot.service;

import dwp.gov.uk.purejavaboot.service.impl.MessageServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setup() {
        messageService = new MessageServiceImpl();
    }

    @Test
    public void shouldReturnGreetingMessage() {
        String expected = "hello";
        String actual = messageService.echoMessage();
        assertEquals(expected, actual);
    }
}
