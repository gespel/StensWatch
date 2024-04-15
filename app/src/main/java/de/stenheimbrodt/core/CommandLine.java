package de.stenheimbrodt.core;

import java.util.Arrays;

public class CommandLine {
    public CommandLine() {

    }

    public String interpret(String input) {
        String[] split = input.split(" ");
        String out = "";

        if(split.length >= 1) {
            String basecmd = split[0];
            if(split.length >= 2) {
                String[] result = Arrays.copyOfRange(split, 1, split.length-1);
            }


            if(basecmd.equalsIgnoreCase("info")) {
                out = "Made by Sten (Gespel) Heimbrodt";
            }
        }

        return out;
    }
}
