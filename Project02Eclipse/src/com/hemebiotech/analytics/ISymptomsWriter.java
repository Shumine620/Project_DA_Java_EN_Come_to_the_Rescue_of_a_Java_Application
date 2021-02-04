package com.hemebiotech.analytics;

import java.util.TreeMap;

public interface ISymptomsWriter {
    /**
     * @param resultsMap     File to write the collection of sorted symptoms
     * @param resultFilePath Path location for the file resultsMap
     */
    void writeFile(TreeMap <String, Integer> resultsMap, String resultFilePath);
}
