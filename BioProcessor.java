package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BioProcessor {

    public static void main(String[] args) {
        String fileName = "src/Project/DNA_Seq";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            



            while ((line = reader.readLine()) != null) { //To ensure the file is not empty
                count++; //It loops through to ensure that all the dna sequences in the file are accounted for 
                String dna = line.trim().toUpperCase();
                if (dna.length() < 3) continue;

                String mRNA = Transcription.transcribing(dna); //Transcribing 
                String protein = Translation.translateRNAtoProtein(mRNA);


                //Display output
                System.out.println("DNA: " + dna); //Display the dna 
                System.out.println("mRNA: " + mRNA); //Display RNA 
                System.out.println("Protein: " + protein); //Display the protein type
                System.out.println("-------------------"); //Line to separate the other sequences 
            }
            System.out.println("Processed " + count + " sequences.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}