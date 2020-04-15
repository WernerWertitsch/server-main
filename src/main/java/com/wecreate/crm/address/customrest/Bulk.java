package com.wecreate.crm.address.customrest;

import com.wecreate.crm.address.model.Address;
import com.wecreate.crm.address.repository.AddressRepository;
import com.wecreate.crm.person.model.Person;
import com.wecreate.crm.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/addresses/bulk")
public class Bulk {

    Logger logger = Logger.getLogger(Bulk.class.getName());

    @Autowired
    AddressRepository addressRepository;

    @PostMapping
    public Iterable<Address> postBulk(@RequestBody List<Address> addresses) {
        List<Address> ret = new ArrayList<>();
        addresses.forEach(a -> {
            try {
                ret.add(this.addressRepository.save(a));
            } catch (Exception e) {
                logger.warning("Could not import address:"+a);
            }
        });
        return ret;
    }

}
