package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.body.BodyContent;
import com.github.fabriciofx.cactoos.mail.header.HeaderFrom;
import com.github.fabriciofx.cactoos.mail.header.HeaderSubject;
import com.github.fabriciofx.cactoos.mail.header.HeaderTo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.cactoos.Output;
import org.cactoos.io.InputOf;
import org.cactoos.io.OutputTo;
import org.cactoos.io.TeeOutput;

public final class MessageSimple implements Message {
    private final Output headers;
    private final Output body;

    public MessageSimple(
        final String from,
        final String to,
        final String subject,
        final String content
    ) {
        this.headers = new HeaderSubject(
            new HeaderTo(
                new HeaderFrom(
                    new OutputTo(new ByteArrayOutputStream()),
                    from
                ),
                to
            ),
            subject
        );
        this.body = new BodyContent(
            new InputOf(content)
        );
    }

    @Override
    public OutputStream stream() throws Exception {
        return new TeeOutput(
            this.headers,
            this.body
        ).stream();
    }

    @Override
    public Output headers() throws Exception {
        return this.headers;
    }

    @Override
    public Output body() throws Exception {
        return this.body;
    }
}
