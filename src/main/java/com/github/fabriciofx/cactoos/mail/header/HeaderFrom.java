package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Output;

public final class HeaderFrom extends HeaderEnvelope {
    public HeaderFrom(final Output output, final String email) {
        super(output, "From", email);
    }
}
