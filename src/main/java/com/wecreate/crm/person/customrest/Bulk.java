package com.wecreate.crm.person.customrest;

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
@RequestMapping("/people/bulk")
public class Bulk {

    Logger logger = Logger.getLogger(Bulk.class.getName());

    @Autowired
    PersonRepository personRepository;

    @PostMapping
    public Iterable<Person> postBulk(@RequestBody List<Person> people) {
        List<Person> ret = new ArrayList<>();
        people.forEach(p -> {
            try {
                ret.add(this.personRepository.save(p));
            } catch (Exception e) {
                logger.warning("Could not import person:"+p);
            }
        });
        return ret;
    }

}
