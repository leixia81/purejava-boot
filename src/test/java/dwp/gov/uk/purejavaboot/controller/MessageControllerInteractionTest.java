package dwp.gov.uk.purejavaboot.controller;


import dwp.gov.uk.purejavaboot.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(MessageController.class)
public class MessageControllerInteractionTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    @Qualifier(value = "defaultMessageService")
    private MessageService messageService;

    @Test
    public void shouldMessageServiceEchoInvokedOnce() throws Exception {
        when(messageService.echoMessage()).thenReturn("mocked_message");
        this.mockMvc.perform(get("/api/ping"));
        verify(messageService, times(1)).echoMessage();
    }
}
