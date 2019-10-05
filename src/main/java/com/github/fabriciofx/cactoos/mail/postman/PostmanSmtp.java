package com.github.fabriciofx.cactoos.mail.postman;

import com.github.fabriciofx.cactoos.mail.Message;
import com.github.fabriciofx.cactoos.mail.Postman;
import java.io.OutputStream;
import java.net.Socket;
import org.cactoos.io.BytesOf;

public final class PostmanSmtp implements Postman {
    private final String host;
    private final int port;

    public PostmanSmtp(final String host, final int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void send(final Message message) throws Exception {
        try(Socket socket = new Socket(this.host, this.port)) {
            final OutputStream output = socket.getOutputStream();
            output.write();
            output.write(new BytesOf(message).asBytes());
            output.flush();
        }
    }
}
