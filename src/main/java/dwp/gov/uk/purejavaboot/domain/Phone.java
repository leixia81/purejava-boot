package dwp.gov.uk.purejavaboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Data
@Document(value = "phone")
@TypeAlias(value = "phone")
public class Phone extends AbstractDocument {

    enum NumberType {
        MOBILE('M'),
        LANDLINE('L');

        private char code;

        NumberType(char code) {
            this.code = code;
        }

        public char getCode() {
            return code;
        }
    }

    @DBRef
    Citizen citizen;
    @Field(value = "number")
    private String number;
    @Field(value = "type")
    private NumberType numberType;

}
