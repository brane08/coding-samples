package com.github.brane08.dsa.sort;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Loader {

    static Queue<List<Integer>> load(String fileName) {
        try {
            List<List<Integer>> list = new ArrayList<>();
            URL fileUrl = Loader.class.getResource(fileName);
            List<String> lines = Files.readAllLines(Paths.get(fileUrl.toURI()));
            for (String line : lines) {
                list.add(new ArrayList<>(Arrays.stream(line.split(",")).map(Integer::parseInt).toList()));
            }
            return new ArrayDeque<>(list);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
