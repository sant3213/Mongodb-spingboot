package com.jalasoft.test.repository;

import com.jalasoft.test.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.http.HTTPException;

/**
 * <h1>Repository</h1>
 * <P>
 *     Retrieve an object from an API
 * </P>
 * @autor Santiago Cárdenas
 * @version 1.0
 * @since 12/2020
 */
@Repository
public class DataRepository  {

    /**
     * This method retrives the data from the API
     * @return returns the data got
     */

    @Autowired
    private RestTemplate restTemplate;

    public Data getData(){
        //RestTemplate restTemplate = new RestTemplate();
        Data data = new Data();
        try {
            data = restTemplate.getForObject("https://run.mocky.io/v3/5b8d1978-c0d4-4cce-819c-41b89456e7cc", Data.class);
        } catch (HTTPException e){
            System.out.println(e);
        }
        return data;
    }
}
