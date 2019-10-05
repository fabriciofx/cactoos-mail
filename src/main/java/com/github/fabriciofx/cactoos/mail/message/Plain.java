package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.body.Body;
import com.github.fabriciofx.cactoos.mail.header.From;
import com.github.fabriciofx.cactoos.mail.header.Header;
import com.github.fabriciofx.cactoos.mail.header.Subject;
import com.github.fabriciofx.cactoos.mail.header.To;
import org.cactoos.Text;
import org.cactoos.list.ListOf;
import org.cactoos.text.Joined;
import org.cactoos.text.TextOf;

import java.util.ArrayList;
import java.util.List;

public final class Plain implements Message {
    private final List<Header> headers;
    private final Body body;

    public Plain(
        final String from,
        final String to,
        final String subject,
        final String content
    ) {
        this.headers = new ArrayList<>(
            new ListOf<Header>(new To(to), new From(from), new Subject(subject))
        );
        this.body = new com.github.fabriciofx.cactoos.mail.body.Plain(content);
    }

    @Override
    public List<Header> headers() throws Exception {
        return this.headers;
    }

    @Override
    public Body body() throws Exception {
        return this.body;
    }

    @Override
    public String asString() throws Exception {
        return
        new Joined(
            new TextOf("\r\n"),
            new Joined(
                new TextOf(""),
                this.headers
            ),
            this.body
        ).asString();
    }
}
