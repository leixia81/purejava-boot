package dwp.gov.uk.purejavaboot.service;

import dwp.gov.uk.purejavaboot.service.impl.DatetimeProvider;
import dwp.gov.uk.purejavaboot.service.impl.MessageServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {

    private MessageService messageService;

    private DatetimeProvider datetimeProvider;

    @Before
    public void setup() {
        datetimeProvider = mock(DatetimeProvider.class);
        messageService = new MessageServiceImpl(datetimeProvider);
    }

    @Test
    public void shouldReturnGreetingMessage() {
        when(datetimeProvider.provide()).thenReturn(LocalDateTime.of(2019, 1, 1, 10, 10, 10));
        String expected = "hello 2019-01-01";
        String actual = messageService.echoMessage();
        assertEquals(expected, actual);
    }
}
