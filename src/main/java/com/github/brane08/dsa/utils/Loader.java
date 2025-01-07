package com.github.brane08.dsa.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loader {

    public static List<List<Integer>> load(String fileName) {
        try {
            List<List<Integer>> list = new ArrayList<>();
            URL fileUrl = Loader.class.getResource(fileName);
            List<String> lines = Files.readAllLines(Paths.get(fileUrl.toURI()));
            for (String line : lines) {
                list.add(Arrays.stream(line.split(",")).map(Integer::parseInt).toList());
            }
            return list;
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
