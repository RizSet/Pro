package com.company;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "Text.txt")
class TextContainer {
    String s = "DiTaKo";

    @Saver
    public void save(String path) throws IOException {
        FileWriter w = new FileWriter(path);
        w.write(s);
        w.close();
        System.out.println(":)");

    }
}
