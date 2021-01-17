package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SymptomsCount implements ISymptomsCount {

    private ArrayList <String> symptomsList;

    @Override
    public Map <String, Integer> count(ArrayList <String> symptomsList) {
        HashMap <String, Integer> symptomsMap = new HashMap <>();

        //Set <String> keySet = symptomsMap.keySet( );
        //ArrayList <String> symptomsList = new ArrayList <>(keySet);

        Integer count = null;
        try {
            for (String i : symptomsList) {
                count = symptomsMap.get(i);
                if (count==null)
                    count = 0;
                symptomsMap.put(i, count + 1);
                /*Now iterate the HashMap to display the word with number of time occurrence  */
            }
            for (Map.Entry <String, Integer> entryKeyValue : symptomsMap.entrySet( )) {
                System.out.println("Symptom : " + entryKeyValue.getKey( ) + ", Occurrence : "
                        + entryKeyValue.getValue( ) + " times");
            }

            System.out.println(symptomsMap);
        } catch ( Exception e ) {
            System.out.println("Something went wrong during the count.");
        }
        return symptomsMap;
    }

    @Override
    public void setSymptomsList(ArrayList <String> symptomsList) {

    }

}





