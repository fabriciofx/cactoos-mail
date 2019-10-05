package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Text;

public final class HeaderTo extends HeaderEnvelope {
    public HeaderTo(final Text header, final String email) {
        super(header, "To", email);
    }
}
