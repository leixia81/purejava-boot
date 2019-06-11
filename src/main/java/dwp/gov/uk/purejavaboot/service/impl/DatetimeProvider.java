package dwp.gov.uk.purejavaboot.service.impl;

import dwp.gov.uk.purejavaboot.service.Provider;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component(value = "dateTimeProvider")
public class DatetimeProvider implements Provider<LocalDateTime> {

    @Override
    public LocalDateTime provide() {
        return LocalDateTime.now();
    }
}
