package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Output;

public final class Subject extends Header {
    public Subject(final Output output, final String subject) {
        super(output, "Subject", subject);
    }
}
