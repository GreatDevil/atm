package ru.sbrf.example.atm.client;

public interface Access<T> {
    boolean verify(T t);
}
