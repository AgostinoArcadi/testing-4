import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OperazioniDateTest {

    private final OperazioniDate testing = new OperazioniDate();
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void anno() {
        Integer result = testing.anno(date);
        assertEquals(2023, result, "Il risultato dovrebbe essere 2023");
    }

    @Test
    void anno_date_null() {
        Integer result = testing.anno(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }

    @Test
    void mese() {
        String result = testing.mese(date);
        assertEquals("MARCH", result, "Il risultato dovrebbe essere MARCH");
    }

    @Test
    void mese_date_null() {
        String result = testing.mese(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }

    @Test
    void giorno() {
        Integer result = testing.giorno(date);
        assertEquals(1, result, "Il risultato dovrebbe essere 1");
    }

    @Test
    void giorno_date_null() {
        Integer result = testing.giorno(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }

    @Test
    void giorno_della_settimana() {
        String result = testing.giornoDellaSettimana(date);
        assertEquals("WEDNESDAY", result, "Il risultato dovrebbe essere 2023");
    }

    @Test
    void giorno_della_settimana_null() {
        String result = testing.giornoDellaSettimana(null);
        assertNull(result, "Il risultato dovrebbe essere null");
    }
}