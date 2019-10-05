package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.header.HeaderFrom;
import com.github.fabriciofx.cactoos.mail.header.HeaderSubject;
import com.github.fabriciofx.cactoos.mail.header.HeaderTo;
import org.cactoos.Text;
import org.cactoos.text.Joined;
import org.cactoos.text.TextOf;

public final class MessagePlain implements Message {
    private final Text headers;
    private final Text body;

    public MessagePlain(
        final String from,
        final String to,
        final String subject,
        final String content
    ) {
        this.headers = new HeaderSubject(
            new HeaderTo(
                new HeaderFrom(from),
                to
            ),
            subject
        );
        this.body = new TextOf(content);
    }

    @Override
    public Text headers() throws Exception {
        return this.headers;
    }

    @Override
    public Text body() throws Exception {
        return this.body;
    }

    @Override
    public String asString() throws Exception {
        return new Joined(
            new TextOf("\r\n"),
            this.headers,
            this.body
        ).asString();
    }
}
