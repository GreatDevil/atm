package ru.sbrf.example.atm.server;

import lombok.Data;

@Data
public class Bank {
    private int id;
    private String Name;

    public String getBalance(long clientId,
                              long accountId,
                              long auth) {
        Account account;
        if (!authentication(auth)) {
            return "authentication error";
        }
        try {
            account = getAccount(clientId, accountId);
        } catch (Exception e) {
            return "the client is not found";
        }
        return account.getBalance.toString();
    }

    private boolean authentication(long auth) {
        return false;
    }

    private Account getAccount(long clientId, long accountId) throws Exception{
        //account = repository.getAccount(clientId, long accountId);
        return null;
    }
}
