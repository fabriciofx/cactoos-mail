package com.github.fabriciofx.cactoos.mail;

public interface Postman {
    void send(Message message) throws Exception;
}
