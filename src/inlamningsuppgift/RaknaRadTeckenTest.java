package inlamningsuppgift;


    import org.junit.jupiter.api.Test;


    import static org.junit.jupiter.api.Assertions.* ;

    public class RaknaRadTeckenTest {

        @Test
        public void testaEnkelRadUtanStop() {
            RaknaRadTecken stats = new RaknaRadTecken();
            stats.addLine("Hello World!");
            assertEquals(1, stats.getRowCount(), "Row count should be 1 for a single line.");
            assertEquals(12, stats.getCharCount(), "Char count should be 12 for 'Hello World!'.");
        }

        @Test
        public void testaMangaRaderUtanStop() {
            RaknaRadTecken stats = new RaknaRadTecken();
            stats.addLine("First line.");
            stats.addLine("Second line here.");
            stats.addLine("And another one.");
            assertEquals(3, stats.getRowCount(), "Row count should be 3 for three lines.");
            assertEquals(36, stats.getCharCount(), "Char count should be the sum of all characters.");
        }

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


