package com.browserstack.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CSVReaderUtil {
    private static final String CSV_FILE_PATH = Paths.get(System.getProperty("user.dir"), "src", "data", "urlData.csv").toString();

    public static Map<String, String> readCSV() {
        Map<String, String> urlMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                urlMap.put(values[0], values[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urlMap;
    }
}
