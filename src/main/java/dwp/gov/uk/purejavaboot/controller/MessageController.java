package dwp.gov.uk.purejavaboot.controller;


import dwp.gov.uk.purejavaboot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    @Qualifier(value = "defaultMessageService")
    private MessageService messageService;


    @GetMapping(value = "/api/ping")
    public @ResponseBody String ping() {
        return this.messageService.echoMessage();
    }
}
