package dwp.gov.uk.purejavaboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Document(collection = "citizen")
@TypeAlias(value = "citizen")
public class Citizen extends AbstractDocument {

    enum Gender {
        MALE('M'),
        FEMALE('F'),
        UNKNOWN('U');

        private char code;

        Gender(char code) {
            this.code = code;
        }

        public char getCode() {
            return code;
        }
    }

    @Field(value = "ni")
    private String nationalInsurance;
    @Field(value = "fn")
    @NotEmpty(message = "First name must not be empty")
    private String firstname;
    @Field(value = "mn")
    private String middlename;
    @Field(value = "ln")
    @NotEmpty(message = "Last name must not be empty")
    private String lastname;
    @Field(value = "sex")
    @NotNull(message = "Gender must not left blank.")
    private Gender gender;

}
