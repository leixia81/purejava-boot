package dwp.gov.uk.purejavaboot.service;

import dwp.gov.uk.purejavaboot.service.impl.DatetimeProvider;
import dwp.gov.uk.purejavaboot.service.impl.MessageServiceImpl;
import dwp.gov.uk.purejavaboot.service.impl.StringToHashConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {

    private MessageService messageService;

    private DatetimeProvider datetimeProvider;

    private StringToHashConverter stringToHashConverter;

    @Before
    public void setup() {
        datetimeProvider = mock(DatetimeProvider.class);
        stringToHashConverter = mock(StringToHashConverter.class);
        messageService = new MessageServiceImpl(datetimeProvider, stringToHashConverter);
    }

    @Test
    public void shouldReturnGreetingMessage() {
        when(datetimeProvider.provide()).thenReturn(LocalDateTime.of(2019, 1, 1, 10, 10, 10));
        String expected = "hello 2019-01-01";
        String actual = messageService.echoMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEncodedGreetingMessage() {
        when(datetimeProvider.provide()).thenReturn(LocalDateTime.of(2019, 1, 1, 10, 10, 10));
        messageService.echoMessage();
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(stringToHashConverter, times(1)).convertTo(captor.capture());
    }
}
