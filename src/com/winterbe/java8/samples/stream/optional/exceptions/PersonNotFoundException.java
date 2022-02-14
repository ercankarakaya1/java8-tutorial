package com.winterbe.java8.samples.stream.optional.exceptions;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException() {
        super();
    }
}
