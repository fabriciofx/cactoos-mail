package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.text.TextOf;

public final class Subject extends Basic {
    public Subject(final String email) {
        super(new TextOf("Subject"), new TextOf(email));
    }
}