package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Output;

public final class HeaderTo extends HeaderEnvelope {
    public HeaderTo(final Output output, final String email) {
        super(output, "To", email);
    }
}
