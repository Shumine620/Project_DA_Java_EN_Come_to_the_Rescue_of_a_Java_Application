package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public interface ISymptomsCount {
    Map <String, Integer> count(ArrayList <String> symptomsList );

    void setSymptomsList(ArrayList <String> symptomsList);
}
