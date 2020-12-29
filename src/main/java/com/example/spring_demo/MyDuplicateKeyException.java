package com.example.spring_demo;

import org.springframework.dao.DuplicateKeyException;

public class MyDuplicateKeyException extends DuplicateKeyException {

    public MyDuplicateKeyException(String msg) {
        super(msg);
    }

    public MyDuplicateKeyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
