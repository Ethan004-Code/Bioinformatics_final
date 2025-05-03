# Bioinformatics Final Project (CS 123A)
Ethan De Souza

## Overview
This project reads DNA sequences from a text file, transcribes them into mRNA, and then translates the mRNA into a protein sequence using Java.

## Code Structure
- `BioProcessor.java` – Main class that reads DNA sequences and runs transcription + translation and provides the output of gene sequence, transcribed mrna and translated protein
- `Transcription.java` – Contains a method to transcribe DNA to mRNA
- `Translation.java` – Maps mRNA codons to amino acids and translates mRNA to protein
- `DNA_Seq` – Text file containing DNA sequences (one per line) the bigproccessor helps iterates through the gene sequences in the java text file

### Requirements:
- Java 8 or higher
- VS Code (or any Java IDE)

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Ethan004-Code/Bioinformatics_final.git
   cd Bioinformatics_final
