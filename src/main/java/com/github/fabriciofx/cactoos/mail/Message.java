package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Text;

public interface Message extends Text {
    Text headers() throws Exception;
    Text body() throws Exception;
}
