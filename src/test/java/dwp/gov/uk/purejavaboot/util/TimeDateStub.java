package dwp.gov.uk.purejavaboot.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDateStub {

    public static String timeToStringStub() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDateTime.now().format(formatter);
    }
}
