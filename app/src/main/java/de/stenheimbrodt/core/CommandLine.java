package de.stenheimbrodt.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

public class CommandLine {
    StensWatchOS sw;
    public CommandLine() {
        sw = new StensWatchOS();
    }

    public String interpret(String input) throws IOException {
        String[] split = input.split(" ");
        StringBuilder out = new StringBuilder();

        if(split.length >= 1) {
            String basecmd = split[0];
            if(split.length >= 2) {
                String[] result = Arrays.copyOfRange(split, 1, split.length-1);
            }


            if(basecmd.equalsIgnoreCase("info")) {
                out.append("Made by Sten (Gespel) Heimbrodt");
            }
            else if(basecmd.equalsIgnoreCase("lina")) {
                out.append("Ich liebe dich Lina!");
            }
            else if(basecmd.equalsIgnoreCase("ls")) {
                Set<String> filenames = this.sw.listFilesUsingJavaIO(".");
                if(!filenames.isEmpty()) {
                    for(String fileName : this.sw.listFilesUsingJavaIO(".")) {
                        out.append(fileName).append(" ");
                    }
                }
            }
            else if(basecmd.equalsIgnoreCase("createfile")) {
                this.sw.writeFile();
            }
        }

        return out.toString();
    }
}
