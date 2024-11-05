package inlamningsuppgift;

//Denna klass används för att hålla koll på statistik om användarens inmatning:
// antalet rader och antalet tecken.

public class RaknaRadTecken {
    private int rowCount;
    private int charCount;
//// Konstruktor som initierar räkningarna till 0
    public RaknaRadTecken() {
        this.rowCount = 0;
        this.charCount = 0;
    }
//Metod som lägger till information om en ny rad.
//   Om raden INTE är "stop" ökar den rowCount och lägger till antalet tecken
    public void addLine(String line) {
        if (!line.equalsIgnoreCase("stop")) {
            rowCount++;
            charCount += line.length();
        }
    }
    // Returnerar antalet rader o tacken
    public int getRowCount() {
        return rowCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
