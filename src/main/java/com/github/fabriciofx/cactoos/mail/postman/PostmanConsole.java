package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.Postman;

public final class PostmanConsole implements Postman {
    @Override
    public void send(final Message message) throws Exception {
        System.out.println(message.asString());
    }
}
