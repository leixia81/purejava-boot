package dwp.gov.uk.purejavaboot.service.impl;


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

    @Autowired
    public MessageServiceImpl(@Qualifier("dateTimeProvider") Provider provider) {
        this.provider = provider;
    }

    @Override
    public String echoMessage() {
        LocalDateTime ldt = (LocalDateTime) provider.provide();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dts = ldt.format(formatter);
        return String.format("hello %s", dts);
    }
}
