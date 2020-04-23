package com.wecreate.crm.stimmbericht.customrest;

import com.wecreate.crm.person.model.Person;
import com.wecreate.crm.person.repository.PersonRepository;
import com.wecreate.crm.stimmbericht.model.Stimmbericht;
import com.wecreate.crm.stimmbericht.repository.StimmberichtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/stimmberichts/bulk")
public class StimmberichtBulk {

    Logger logger = Logger.getLogger(StimmberichtBulk.class.getName());

    @Autowired
    StimmberichtRepository stimmberichtRepository;

    @PostMapping
    public Iterable<Stimmbericht> postBulk(@RequestBody List<Stimmbericht> stimmberichts) {
        List<Stimmbericht> ret = new ArrayList<>();
        stimmberichts.forEach(s -> {
            try {
                ret.add(this.stimmberichtRepository.save(s));
            } catch (Exception e) {
                logger.warning("Could not import Stimmbericht:"+s);
            }
        });
        return ret;
    }


}
