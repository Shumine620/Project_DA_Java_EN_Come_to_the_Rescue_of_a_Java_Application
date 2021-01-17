/**package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SymptomsWriter implements ISymptomsWriter {

    private String symptomsFile;

    @Override
    public void write(Map <String, Integer> resultsOut) {

    public SymptomsWriter(String symptomsFile) {
            this.symptomsFile = symptomsFile;
    }
             try {
                    FileWriter writer = new FileWriter("results-out.txt");//Creation du fichier
                    writer.write("Symptoms Counts");//Ecrit sur le fichier ----- Chercher le count
                    writer.close( );

                    System.out.println("Successfully wrote to the file.");
                } catch ( IOException e ) {
                    System.out.println("An error occurred during writing.");
                    e.printStackTrace( );
                }
            }
        }
*/

