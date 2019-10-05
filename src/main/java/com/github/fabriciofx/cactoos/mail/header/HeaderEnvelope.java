package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Text;
import org.cactoos.text.FormattedText;

public abstract class HeaderEnvelope implements Text {
    private final Text origin;
    private final String name;
    private final String value;

    public HeaderEnvelope(
        final Text header,
        final String name,
        final String value
    ) {
        this.origin = header;
        this.name = name;
        this.value = value;
    }

    @Override
    public String asString() throws Exception {
        return new FormattedText(
            "%s%s: %s\r\n",
            this.origin.asString(),
            this.name,
            this.value
        ).asString();
    }
}
