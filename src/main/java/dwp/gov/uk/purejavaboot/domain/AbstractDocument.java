package dwp.gov.uk.purejavaboot.domain;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;

public class AbstractDocument {

    @Id
    private BigInteger documentId;

    public void setId(BigInteger id) {
        this.documentId = id;
    }

    public BigInteger getId() {
        return documentId;
    }
}
