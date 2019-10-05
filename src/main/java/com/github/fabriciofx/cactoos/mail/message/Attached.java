package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.body.Body;
import com.github.fabriciofx.cactoos.mail.header.Header;
import org.cactoos.Input;

import java.util.List;

public final class Attached implements Message {
    private final Message origin;
    private final Input input;

    public Attached(final Message message, final Input input) {
        this.origin = message;
        this.input = input;
    }

    @Override
    public List<Header> headers() throws Exception {
        return this.origin.headers();
    }

    @Override
    public Body body() throws Exception {
        return origin.body();
    }

    @Override
    public String asString() throws Exception {
        return null;
    }
}
