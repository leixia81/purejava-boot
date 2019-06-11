package dwp.gov.uk.purejavaboot.service;

public interface Converter<I, O> {
    O convertTo(I from);
}
