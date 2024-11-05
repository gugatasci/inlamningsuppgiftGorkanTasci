package inlamningsuppgift;

import java.util.Scanner;

//Den här klassen hanterar användarens inmatning och använder
// RaknaRadText för att hålla koll på rader och tecken.

public class TextStop{
    private RaknaRadTecken stats;
    private Scanner scanner;

    // Konstruktor som initierar TextStatistics och Scanner
    public TextStop() {
        this.stats = new RaknaRadTecken();
        this.scanner = new Scanner(System.in);
    }
    // Metod för att börja läsa in text från användaren
    public void startReading() {
        System.out.println("Skriv text rad för rad (skriv 'stop' för att avsluta):");

        // En evig loop som fortsätter tills användaren skriver "stop"

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
                // Om raden är "stop" avbryts loopen
            }
            stats.addLine(line);
            // Annars läggs raden till statistiken
        }
        displayResults();
        // Visar resultatet efter loopen avslutats
    }
    // Metod för att skriva ut statistiken
    public void displayResults() {
        System.out.println("Antal rader: " + stats.getRowCount());
        System.out.println("Antal tecken: " + stats.getCharCount());
    }
    // Getter-metod för att hämta statistiken (användbar för tester)
    public RaknaRadTecken getStatistics() {
        return stats;
    }
    // Huvudprogram som startar programmet
    public static void main(String[] args) {
        TextStop reader = new TextStop();
        reader.startReading();
    }
}
