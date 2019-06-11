package dwp.gov.uk.purejavaboot.service.impl;


import dwp.gov.uk.purejavaboot.service.Converter;
import dwp.gov.uk.purejavaboot.service.MessageService;
import dwp.gov.uk.purejavaboot.service.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service(value = "defaultMessageService")
public class MessageServiceImpl implements MessageService {

    private Provider provider;
    private Converter converter;

    @Autowired
    public MessageServiceImpl(@Qualifier("dateTimeProvider") Provider provider,
                              @Qualifier("string2HashConverter") Converter converter) {
        this.provider = provider;
        this.converter = converter;
    }

    @Override
    public String echoMessage() {
        LocalDateTime ldt = (LocalDateTime) provider.provide();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dts = ldt.format(formatter);
        queryApi(dts);
        return String.format("hello %s", dts);
    }

    private String queryApi(String input) {
        return (String) converter.convertTo(input);
    }
}
