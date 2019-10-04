package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.Postman;
import org.cactoos.io.InputOf;
import org.cactoos.io.Stdout;
import org.cactoos.io.TeeInput;
import org.cactoos.io.TeeOutput;
import org.cactoos.scalar.LengthOf;

public final class PostmanConsole implements Postman {
    @Override
    public void send(final Message message) throws Exception {
        new LengthOf(
            new TeeInput(
                new InputOf("bla"),
                new TeeOutput(
                    message,
                    new Stdout()
                )
            )
        ).intValue();
    }
}
