package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;


public interface ISymptomsCount {
    /**
     *
     * @param symptomsList List to order
     * @return symptomsMap : a sorted map of symptoms from the list
     */
    TreeMap <String, Integer> count(ArrayList <String> symptomsList);
}
