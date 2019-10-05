package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.Message;
import org.cactoos.Input;
import org.cactoos.Text;

public final class MessageAttached implements Message {
    private final Message origin;
    private final Input input;

    public MessageAttached(final Message message, final Input input) {
        this.origin = message;
        this.input = input;
    }

    @Override
    public Text headers() throws Exception {
        this.origin.headers()
    }

    @Override
    public Text body() throws Exception {
        return null;
    }

    @Override
    public String asString() throws Exception {
        return null;
    }
}
