package inlamningsuppgift;

import java.util.Scanner;

public class TextStop{
    private RaknaRadTecken stats;
    private Scanner scanner;

    public TextStop() {
        this.stats = new RaknaRadTecken();
        this.scanner = new Scanner(System.in);
    }

    public void startReading() {
        System.out.println("Skriv text rad för rad (skriv 'stop' för att avsluta):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            stats.addLine(line);
        }
        displayResults();
    }

    public void displayResults() {
        System.out.println("Antal rader: " + stats.getRowCount());
        System.out.println("Antal tecken: " + stats.getCharCount());
    }

    public RaknaRadTecken getStatistics() {
        return stats;
    }

    public static void main(String[] args) {
        TextStop reader = new TextStop();
        reader.startReading();
    }
}
