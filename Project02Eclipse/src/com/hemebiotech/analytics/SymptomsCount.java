package com.hemebiotech.analytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SymptomsCount implements ISymptomReader {
    private String SymptomsCount;

    @Override

    public ArrayList<String> getSymptoms(String filepath) {
       // ArrayList <String> symptomsList = new ArrayList <String>( );
        HashMap <String, Integer> symptomsMap = new HashMap <>( );

        Set <String> keySet =symptomsMap.keySet();
        ArrayList<String> symptomsList = new ArrayList <>( keySet );
        try {
            for (String i : symptomsList) {
                Integer count = symptomsMap.get(i);
                if (count==null)
                    count = 0;

                symptomsMap.put(i, count + 1);
                /*Now iterate the HashMap to display the word with number of time occurrence  */

                for (Map.Entry <String, Integer> entryKeyValue : symptomsMap.entrySet( )) {
                    System.out.println("Symptom : " + entryKeyValue.getKey( ) + ", Occurrence : "
                            + entryKeyValue.getValue( ) + " times");
                }
            }

            }catch(Exception e){
                System.out.println("Something went wrong.");
            }
            return symptomsList;
        }

    }







