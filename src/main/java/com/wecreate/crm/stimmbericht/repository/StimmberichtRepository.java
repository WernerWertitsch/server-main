package com.wecreate.crm.stimmbericht.repository;

import com.wecreate.crm.person.model.Person;
import com.wecreate.crm.stimmbericht.model.Stimmbericht;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "stimmberichts", path = "stimmberichts")
public interface StimmberichtRepository extends MongoRepository<Stimmbericht, String> {


    @RestResource(path="/fuzzy")
    public Page<Stimmbericht>
    findStimmberichtsByAnmerkungenContainingIgnoreCaseOrZahlungsartContainingIgnoreCase(
            @Param(value = "anmerkungen") String anmerkung,
            @Param(value = "zahlungsart") String zahlungsart,
            Pageable pageable);


}
