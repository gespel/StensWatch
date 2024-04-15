package de.stenheimbrodt.core;

import java.util.Arrays;

public class CommandLine {
    public CommandLine() {

    }

    public String interpret(String input) {
        String[] split = input.split(" ");
        String basecmd = split[0];
        String[] result = Arrays.copyOfRange(split, 1, split.length);
        String out = "";

        if(basecmd.equalsIgnoreCase("info")) {
            out = "Made by Sten (Gespel) Heimbrodt";
        }

        return out;
    }
}
