package com.github.fabriciofx.cactoos.mail;

import org.cactoos.Output;

public interface Message extends Output {
    Output headers() throws Exception;
    Output body() throws Exception;
}
