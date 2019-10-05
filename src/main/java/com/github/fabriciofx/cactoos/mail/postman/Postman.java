package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.message.Message;

public interface Postman {
    void send(Message message) throws Exception;
}
