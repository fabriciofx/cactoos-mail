package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Output;

public final class From extends Header {
    public From(final Output output, final String email) {
        super(output, "From", email);
    }
}
