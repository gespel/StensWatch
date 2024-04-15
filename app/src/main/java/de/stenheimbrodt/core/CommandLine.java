package de.stenheimbrodt.core;

import java.util.Arrays;

public class CommandLine {
    public CommandLine() {

    }

    void interpret(String input) {
        String[] split = input.split(" ");
        String basecmd = split[0];
        String[] result = Arrays.copyOfRange(split, 1, split.length);

    }
}
