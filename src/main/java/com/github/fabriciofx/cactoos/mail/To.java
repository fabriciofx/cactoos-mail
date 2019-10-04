package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Output;

public final class To extends Header {
    public To(final Output output, final String email) {
        super(output, "To", email);
    }
}
