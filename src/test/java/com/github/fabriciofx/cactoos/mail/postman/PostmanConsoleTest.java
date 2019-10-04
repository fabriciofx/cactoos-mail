package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.message.MessageSimple;
import org.junit.Test;

public final class PostmanConsoleTest {
    @Test
    public void message() throws Exception {
        new PostmanConsole().send(
            new MessageSimple(
                "sender@simple.com",
                "receipt@simple.com",
                "Hello!",
                "Hello there!"
            )
        );
    }
}
