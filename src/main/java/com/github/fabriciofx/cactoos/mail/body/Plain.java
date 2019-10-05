package com.github.fabriciofx.cactoos.mail.body;

import org.cactoos.Text;
import org.cactoos.text.TextOf;

public class Plain implements Body {

    private final Text content;

    public Plain(final String content){
        this.content = new TextOf(content);
    }

    @Override
    public String asString() throws Exception {
        return this.content.asString();
    }
}
