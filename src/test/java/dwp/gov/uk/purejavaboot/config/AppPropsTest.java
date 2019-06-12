package dwp.gov.uk.purejavaboot.config;

import dwp.gov.uk.purejavaboot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class, AppProps.class})
public class AppPropsTest {


    @Autowired
    private AppProps appProps;


    @Test
    public void shouldLoadConfigurationFromYml() {
        assertEquals("mock_test_from", appProps.getFrom());
        assertEquals("mock_test_to", appProps.getTo());
    }

    @Test
    public void shouldLoadCustomConfigurationFromYml() {
        Custom custom = appProps.getCustom();
        assertEquals("c1_mock_val", custom.getC1());
        assertEquals("c2_mock_val", custom.getC2());
    }
}
