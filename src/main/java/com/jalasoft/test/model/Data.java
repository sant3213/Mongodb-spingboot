package com.jalasoft.test.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

/**
 * <h1>Data</h1>
 *
 * @autor Santiago Cárdenas
 * @version 1.0
 * @since 12/2020
 */
@Getter
@Setter
@ToString

@Document(collection = "person")
public class Data {
    @Id
    private int id;
    private String name;
    private String email;
}
