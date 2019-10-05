package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.message.Message;

public final class Console implements Postman {
    @Override
    public void send(final Message message) throws Exception {
        System.out.println(message.asString());
    }
}
