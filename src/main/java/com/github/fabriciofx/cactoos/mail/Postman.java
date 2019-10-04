package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Output;

public interface Postman {
    void send(Output output) throws Exception;
}
