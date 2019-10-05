package com.github.fabriciofx.cactoos.mail.message;

import com.github.fabriciofx.cactoos.mail.body.Body;
import com.github.fabriciofx.cactoos.mail.header.Header;
import java.util.List;
import org.cactoos.Text;


public interface Message extends Text {
    List<Header> headers() throws Exception;
    Body body() throws Exception;
}
