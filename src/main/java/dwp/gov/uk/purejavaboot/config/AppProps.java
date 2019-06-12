package dwp.gov.uk.purejavaboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
@EnableConfigurationProperties
public class AppProps {

    private String from;
    private String to;
    private Custom custom;
}
