package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.postman.PostmanConsole;
import org.junit.Test;

public final class PostmanConsoleTest {
    @Test
    public void message() throws Exception {
        new PostmanConsole().send(
            new Message(
                "sender@simple.com",
                "receipt@simple.com",
                "Hello!",
                "Hello there!"
            )
        );
    }
}
