package dwp.gov.uk.purejavaboot.repository;

import dwp.gov.uk.purejavaboot.domain.Citizen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends MongoRepository<Citizen, Long> {

}
