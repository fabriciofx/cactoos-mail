
package com.github.fabriciofx.cactoos.mail;

import java.io.OutputStream;
import org.cactoos.Input;
import org.cactoos.Output;
import org.cactoos.io.TeeInput;
import org.cactoos.scalar.LengthOf;

public final class Content implements Output {
    private final Output output;
    private final Input input;

    public Content(final Output output, final Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public OutputStream stream() throws Exception {
        final OutputStream stream = this.output.stream();
        new LengthOf(
            new TeeInput(
                this.input,
                () -> stream
            )
        ).intValue();
        return stream;
    }
}
