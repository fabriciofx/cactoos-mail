package com.github.fabriciofx.cactoos.mail.header;

import org.cactoos.Text;
import org.cactoos.text.FormattedText;

/**
 * A basic Header, receiving a Text
 */
public abstract class Basic implements Header {

    private final Text name;
    private final Text value;

    public Basic(
        final Text name, final Text value
        ) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String asString() throws Exception {
        return new FormattedText(
            "%s: %s\r\n",
            this.name,
            this.value
        ).asString();
    }
}
