package com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;

/**public class SymptomsWriter implements ISymptomReader {

@Override
public ArrayList <String> getSymptoms(String filepath) {

        try {
            FileWriter writer = new FileWriter("result-out.txt");//Creation du fichier
            writer.write("Symptoms Counts");//Ecrit sur le fichier ----- Chercher le count

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}*/