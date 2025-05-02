package Project;

import java.util.HashMap;
import java.util.Map;

public class Translation {
    //Translation class

    // Codon to Amino Acid map
    private static final Map<String, String> codonTable = new HashMap<>();

    static {
        codonTable.put("AUG", "M"); // Cadon table that maps cadons based on their 3 letter sequences to their corresponding amino acids 
        codonTable.put("UUU", "F");
        codonTable.put("UUC", "F");
        codonTable.put("UUA", "L");
        codonTable.put("UUG", "L");
        codonTable.put("UCU", "S");
        codonTable.put("UCC", "S");
        codonTable.put("UCA", "S");
        codonTable.put("UCG", "S");
        codonTable.put("UAU", "Y");
        codonTable.put("UAC", "Y");
        codonTable.put("UGU", "C");
        codonTable.put("UGC", "C");
        codonTable.put("UGG", "W");
        codonTable.put("UAA", "STOP");
        codonTable.put("UAG", "STOP");
        codonTable.put("UGA", "STOP");
    }

    // Translates mRNA to Protein
    // Time Complexity: O(n), where n is length of mRNA
    public static String translateRNAtoProtein(String mRNASequence) {
        StringBuilder proteinSequence = new StringBuilder(); //To store the given protein  for analyze
        for (int i = 0; i < mRNASequence.length() - 2; i += 3) {  //given length is to ensure while going through the sequence size it does not go out of bounds of the given length of the given sequence 
            String codon = mRNASequence.substring(i, i + 3); //Collects the data and from the given cadon table above instructs a type string which represents another kind of amino acid
            String aminoAcid = codonTable.getOrDefault(codon, ""); //If cadon isnt found then an empty string will be provided 
            if ("STOP".equals(aminoAcid)) {
                break; //Stops the loop when translations end to avoid infinite looping
            }
            proteinSequence.append(aminoAcid); //append method to ensure the code goes on 
        } return proteinSequence.toString();
    }
}