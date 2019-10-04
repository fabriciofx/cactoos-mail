package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Output;

public final class HeaderSubject extends HeaderEnvelope {
    public HeaderSubject(final Output output, final String subject) {
        super(output, "Subject", subject);
    }
}
