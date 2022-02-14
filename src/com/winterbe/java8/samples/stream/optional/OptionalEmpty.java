package com.winterbe.java8.samples.stream.optional;
import java.util.Optional;

public class OptionalEmpty {
    public static void main(String[] args) {

        Optional<String> empty=Optional.empty();
        System.out.println("isPresent: "+empty.isPresent());
        System.out.println("isEmpty: "+empty.isEmpty());

    }
}
