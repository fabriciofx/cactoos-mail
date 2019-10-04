package com.github.fabriciofx.cactoos.mail;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.cactoos.Output;
import org.cactoos.io.InputOf;
import org.cactoos.io.OutputTo;

public final class Message implements Output {
    private final Output output;
    public Message(
        final String from,
        final String to,
        final String subject,
        final String content
    ) {
        this.output = new Content(
            new Subject(
                new To(
                    new From(
                        new OutputTo(new ByteArrayOutputStream()),
                        from
                    ),
                    to
                ),
                subject
            ),
            new InputOf(content)
        );
    }

    @Override
    public OutputStream stream() throws Exception {
        return this.output.stream();
    }
}
