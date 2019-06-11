package dwp.gov.uk.purejavaboot.service.impl;


import dwp.gov.uk.purejavaboot.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String echoMessage() {
        return "hello";
    }
}
