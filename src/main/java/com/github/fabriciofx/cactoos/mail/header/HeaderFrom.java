package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.text.TextOf;

public final class HeaderFrom extends HeaderEnvelope {
    public HeaderFrom(final String email) {
        super(new TextOf(""), "From", email);
    }
}
