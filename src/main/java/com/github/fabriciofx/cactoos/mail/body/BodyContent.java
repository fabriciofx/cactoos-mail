
package com.github.fabriciofx.cactoos.mail.body;

import com.github.fabriciofx.cactoos.mail.Body;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.cactoos.Input;
import org.cactoos.Output;
import org.cactoos.io.OutputTo;
import org.cactoos.io.TeeInput;
import org.cactoos.scalar.LengthOf;

public final class BodyContent implements Body {
    private final Input input;

    public BodyContent(final Input input) {
        this.input = input;
    }

    @Override
    public OutputStream stream() throws Exception {
        final Output output = new OutputTo(new ByteArrayOutputStream());
        new LengthOf(
            new TeeInput(
                this.input,
                output
            )
        ).intValue();
        return output.stream();
    }
}
