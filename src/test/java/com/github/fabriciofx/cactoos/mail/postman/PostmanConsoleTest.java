package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.message.Plain;
import org.junit.Test;

public final class PostmanConsoleTest {
    @Test
    public void message() throws Exception {
        new Console().send(
            new Plain(
                "sender@simple.com",
                "receipt@simple.com",
                "Hello!",
                "Hello there!"
            )
        );
    }
}
