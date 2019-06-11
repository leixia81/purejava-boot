package dwp.gov.uk.purejavaboot.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@RunWith(JUnit4.class)
public class StringToHashConverterTest {

    private StringToHashConverter stringToHashConverter;

    @Before
    public void setup() {
        stringToHashConverter = new StringToHashConverter();
    }

    @Test
    public void shouldReturnEOFCode() {
        String input = "";
        String expected = "RU9G";
        String actual = stringToHashConverter.convertTo(input);
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnCodeForStringProvided() {
        String input = "TEST";
        String expected = "VEVTVA==";
        String actual = stringToHashConverter.convertTo(input);
        assertThat(actual, is(expected));
    }
}