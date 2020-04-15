package com.wecreate.crm.address.repository;

import com.wecreate.crm.address.model.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends MongoRepository<Address, String> {

    @RestResource(path="/fuzzy")
    public Page<Address>
    findAddressByAddressline1ContainingIgnoreCaseOrAddressline2ContainingIgnoreCaseOrCityContainingIgnoreCaseOrCountryContainingIgnoreCase(
            @Param(value = "line1") String addressline1,
            @Param(value = "line2") String addressline2,
            @Param(value = "city") String city,
            @Param(value = "country") String country,
            Pageable pageable);

}
