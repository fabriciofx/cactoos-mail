package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Text;

public final class HeaderSubject extends HeaderEnvelope {
    public HeaderSubject(final Text header, final String subject) {
        super(header, "Subject", subject);
    }
}
