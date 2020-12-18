package com.jalasoft.test.controller;

import com.jalasoft.test.model.Data;
import com.jalasoft.test.repository.DataRepository;
import com.jalasoft.test.repository.PersonRepository;
import com.jalasoft.test.services.PersonService;
import com.jalasoft.test.utils.ResponseConstants;
import com.jalasoft.test.utils.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>Controller</h1>
 * <P>
 *     Receive the request and call
 * </P>
 * @autor Santiago Cárdenas
 * @version 1.0
 * @since 12/2020
 */
@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @Autowired
    private PersonService personService;

    /**
     * This method calls dataRepository to get the data
     * @return returns a response object with the data
     */
    @RequestMapping("/")
    @CrossOrigin(origins="http://localhost:4200")
    public ResponseObject getData(){
        Data data;
        data = dataRepository.getData();
        return new ResponseObject(data, ResponseConstants.SUCCESS_STATUS, "200");
    }

    @PostMapping("/save")
    public ResponseObject savePerson(@RequestBody Data person){
        personService.savePerson(person);
        return new ResponseObject(person, ResponseConstants.SUCCESS_STATUS, "200");
    }

}
