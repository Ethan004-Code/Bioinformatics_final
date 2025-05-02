package Project;

public class Transcription {
//Transcribtion method from DNA to mRNA
    public static String transcribing(String dnaSequence) {
        return dnaSequence.replace("T", "U"); //According to project proposal time complexity O(n)
    }
}