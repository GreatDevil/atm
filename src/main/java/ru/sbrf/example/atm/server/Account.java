package ru.sbrf.example.atm.server;

import lombok.Data;

@Data
public class Account {
    private int id;
    private long balance;
    private Currency currency;
    private Client client;
}
