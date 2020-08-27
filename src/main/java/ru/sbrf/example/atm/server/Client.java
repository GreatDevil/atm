package ru.sbrf.example.atm.server;

import lombok.Data;

@Data
//@Entity
public class Client {
    private long id;
    private String firstName;
    private String lastName;
}
