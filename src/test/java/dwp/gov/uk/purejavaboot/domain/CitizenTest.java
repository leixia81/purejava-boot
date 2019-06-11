package dwp.gov.uk.purejavaboot.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@RunWith(JUnit4.class)
public class CitizenTest {

    private Set<ConstraintViolation<Object>> errors;
    private Validator validator;

    @Before
    public void setup() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void shouldReturnFalseWithThreeViolations() {
        Citizen underTest = new Citizen("NI123456P", "", "D", "", null);
        Assert.assertFalse(validate((underTest)));
        Assert.assertEquals(3, errors.size());
    }

    @Test
    public void shouldReturnTrueWithNoViolations() {
        Citizen underTest = new Citizen("NI123456P", "Mickey", "D", "Mouse", Citizen.Gender.MALE);
        Assert.assertTrue(validate(underTest));
        Assert.assertEquals(0, errors.size());
    }

    private boolean validate(Citizen toValidate) {
        errors = validator.validate(toValidate);
        return errors.isEmpty();
    }
}
