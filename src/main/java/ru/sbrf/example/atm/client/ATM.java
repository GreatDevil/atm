package ru.sbrf.example.atm.client;

import lombok.Data;
import ru.sbrf.example.atm.server.Bank;

@Data
public class ATM<T> {
    private User user;
    private Bank bank;
    private Card card;
    private void startSession(Access<Card> access) {
        access.verify(card);
    }
    private Info operation(Operation operation) {
        return operation.perform();
    }
}
