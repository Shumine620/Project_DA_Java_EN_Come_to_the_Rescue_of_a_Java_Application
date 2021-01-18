package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCount implements ISymptomsCount {
    @Override
    public TreeMap <String, Integer> count(ArrayList <String> symptomsList) {
        TreeMap <String, Integer> symptomsMap = new TreeMap <>( );

        Integer count;

        for (String symptom : symptomsList) {
            count = symptomsMap.get(symptom);
            if (count==null) {
                count = 0;
            }
            symptomsMap.put(symptom, count + 1);
            /*Now iterate the HashMap to display the word with number of time occurrence  */
        }
        for (Map.Entry <String, Integer> entryKeyValue : symptomsMap.entrySet( )) {
            System.out.println("Symptom : " + entryKeyValue.getKey( ) + ", Occurrence : "
                    + entryKeyValue.getValue( ) + " times" + "\n");
        }

        return symptomsMap;
    }

}






