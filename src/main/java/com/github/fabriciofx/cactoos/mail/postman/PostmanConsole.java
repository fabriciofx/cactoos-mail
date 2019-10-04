package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.Postman;
import java.io.ByteArrayOutputStream;
import org.cactoos.Output;

public final class PostmanConsole implements Postman {
    @Override
    public void send(final Output output) throws Exception {
        final ByteArrayOutputStream baos = (ByteArrayOutputStream) output.stream();
        System.out.println(baos.toString());
    }
}
