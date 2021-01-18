package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public interface ISymptomsCount {
    TreeMap <String, Integer> count(ArrayList <String> symptomsList);
}
