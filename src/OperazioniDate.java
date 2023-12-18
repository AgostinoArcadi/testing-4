import java.time.OffsetDateTime;

public class OperazioniDate {
    public Integer anno(OffsetDateTime dateTime) {
        if(dateTime != null) {
            return dateTime.getYear();

        } else {
            return null;
        }
    }

    public String mese(OffsetDateTime dateTime) {
        if(dateTime != null) {
            return dateTime.getMonth().toString();

        } else {
            return null;
        }
    }

    public Integer giorno(OffsetDateTime dateTime) {
        if(dateTime != null) {
            return dateTime.getDayOfMonth();

        } else {
            return null;
        }
    }

    public String giornoDellaSettimana(OffsetDateTime dateTime) {
        if(dateTime != null) {
            return dateTime.getDayOfWeek().toString();

        } else {
            return null;
        }
    }
}
