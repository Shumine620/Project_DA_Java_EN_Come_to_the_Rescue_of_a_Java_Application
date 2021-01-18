package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomsWriter {
    public void writeFile(TreeMap < String, Integer > resultsMap, String resultFilePath);
}
