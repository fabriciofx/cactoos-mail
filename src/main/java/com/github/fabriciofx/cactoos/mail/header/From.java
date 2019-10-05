package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Text;
import org.cactoos.text.TextOf;

public final class From extends Basic {
    public From(final String email) {
        super(new TextOf("From"), new TextOf(email));
    }
}
