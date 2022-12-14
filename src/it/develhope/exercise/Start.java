package it.develhope.exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Start {

    public static void main(String[] args) {

        /*
        Ho creato una data di oggi attraverso LocalDate
         */
        LocalDate now = LocalDate.now();

        /*
        Ho creato le variabili che mi dicessero quando e
        la fine del mese e la fine dell'anno
         */
        LocalDate endMonth = now.withDayOfMonth(now.lengthOfMonth());
        LocalDate endYear = now.withDayOfYear(now.lengthOfYear());

        /*
        Ho creato le variabili in cui calcolo la differenza tra
        la data di oggi e la fine del mese e dell'anno
         */
        long dayBetweenMonth = ChronoUnit.DAYS.between(now, endMonth);
        long dayBetweenYear = ChronoUnit.DAYS.between(now, endYear);

        /*
        Ho stampato i risultati
         */
        System.out.println(dayBetweenMonth);
        System.out.println(dayBetweenYear);
    }
}
