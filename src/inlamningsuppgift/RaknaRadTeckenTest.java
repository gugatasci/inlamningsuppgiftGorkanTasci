package inlamningsuppgift;


    import org.junit.jupiter.api.Test;


    import static org.junit.jupiter.api.Assertions.* ;

    public class RaknaRadTeckenTest {

        //Lägger till en rad ("Hello World!") och kontrollerar att radantalet blir 1
        // och teckenantalet blir 12.
        @Test
        public void testaEnkelRadUtanStop() {
            RaknaRadTecken stats = new RaknaRadTecken();
            stats.addLine("Hello World!");
            assertEquals(1, stats.getRowCount(), "Row count should be 1 for a single line.");
            assertEquals(12, stats.getCharCount(), "Char count should be 12 for 'Hello World!'.");
        }
//Lägger till tre rader och kontrollerar att rowCount blir 3 och att charCount blir
// summan av alla tecken (36).
        @Test
        public void testaMangaRaderUtanStop() {
            RaknaRadTecken stats = new RaknaRadTecken();
            stats.addLine("First line.");
            stats.addLine("Second line here.");
            stats.addLine("And another one.");
            assertEquals(3, stats.getRowCount(), "Row count should be 3 for three lines.");
            assertEquals(36, stats.getCharCount(), "Char count should be the sum of all characters.");
        }
//Lägger till två rader och en tredje rad med ordet "stop". Kontrollera att raden med "stop" ignoreras,
// så radantalet blir 2 och teckenantalet blir 23.
        @Test
        public void testaEnkelRadMedStop() {
            RaknaRadTecken stats = new RaknaRadTecken();
            stats.addLine("First line.");
            stats.addLine("stop");
            stats.addLine("Second line.");
            assertEquals(2, stats.getRowCount(), "Row count should be 2, as 'stop' line should not count.");
            assertEquals(23, stats.getCharCount(), "Char count should exclude the 'stop' line.");
        }
    }

//Sammanfattningsvis:
//
//RaknaRadText är en enkel dataklass för att räkna rader och tecken.
//TextStop hanterar användarinteraktionen.
//JUnit-testfall bekräftar att RaknRadText fungerar korrekt.
