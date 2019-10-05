package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.text.TextOf;

public final class To extends Basic {
    public To(final String email) {
        super(new TextOf("To"), new TextOf(email));
    }
}
