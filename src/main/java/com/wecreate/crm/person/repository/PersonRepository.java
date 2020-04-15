package com.wecreate.crm.person.repository;

import com.wecreate.crm.person.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

    @RestResource(path="/fuzzy")
    public Page<Person>
    findPeopleByFirstnameContainingIgnoreCaseOrLastnameContainingIgnoreCase(
            @Param(value = "n1") String firstname,
            @Param(value = "n2") String lastName,
            Pageable pageable);

}
