package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SymptomsWriter implements ISymptomsWriter {

    @Override
    public void write(Map <String, Integer> resultsOut){

            HashMap <String, Integer> symptomsMap = new HashMap <>();

            try {
                FileWriter writer = new FileWriter("results-out.txt");//Creation du fichier
                writer.write("Symptoms Counts:" + "\n" + resultsOut + "\n");//Ecrit sur le fichier -


                writer.close( );

                System.out.println("Successfully wrote to the file.");
            } catch ( IOException e ) {
                System.out.println("An error occurred during writing.");
                e.printStackTrace( );
            }
        }


}
