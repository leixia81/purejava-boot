package dwp.gov.uk.purejavaboot.service.impl;

import dwp.gov.uk.purejavaboot.service.Provider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;

import java.time.LocalDateTime;
import java.time.Month;

@RunWith(JUnit4.class)
public class DatetimeProviderTest {

    private Provider datetimeProvider;

    @Before
    public void setup() {
        datetimeProvider = new DatetimeProvider();
    }

    @Test
    public void shouldProvideLocalDateTime() {
        Assert.assertNotNull(datetimeProvider.provide());
    }
}
