package inlamningsuppgift;
public class RaknaRadTecken {
    private int rowCount;
    private int charCount;

    public RaknaRadTecken() {
        this.rowCount = 0;
        this.charCount = 0;
    }

    public void addLine(String line) {
        if (!line.equalsIgnoreCase("stop")) {
            rowCount++;
            charCount += line.length();
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
