package dwp.gov.uk.purejavaboot.service.impl;

import dwp.gov.uk.purejavaboot.service.Converter;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component(value = "string2HashConverter")
public class StringToHashConverter implements Converter<String, String> {

    @Override
    public String convertTo(String from) {
        Base64.Encoder encoder = Base64.getEncoder();
        return from.isEmpty() ? encoder.encodeToString("EOF".getBytes()) : encoder.encodeToString(from.getBytes());
    }
}
