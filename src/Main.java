import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OperazioniDate operazioni = new OperazioniDate();

        System.out.println("Anno: " + operazioni.anno(date));
        System.out.println("Mese: " + operazioni.mese(date));
        System.out.println("Giorno: " + operazioni.giorno(date));
        System.out.println("Giorno della settimana: " + operazioni.giornoDellaSettimana(date));

    }

}
