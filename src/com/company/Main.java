package com.company;
//      Кундорго enum тузунуз (Monday, Tuesday ...)
//      консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//      Жуманын кундорун кыргыз тилинде корсотунуз.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" Kun tandanyz : ");

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day.toUpperCase()) {
            case "DUISHOMBU" -> System.out.println(Days.DUISHOMBU+" kunu: "+Days.DUISHOMBU.daymethod());
            case "SHEISHEMBI" -> System.out.println(Days.SHEISHEMBI+" kunu: "+Days.SHEISHEMBI.daymethod());
            case "SHARSHEMBI" -> System.out.println(Days.SHARSHEMBI+" kunu: "+Days.SHARSHEMBI.daymethod());
            case "BEISHEMBI" -> System.out.println(Days.BEISHEMBI+" kunu: "+Days.BEISHEMBI.daymethod());
            case "JUMA" -> System.out.println(Days.JUMA+" kunu: "+Days.JUMA.daymethod());
            case "ISHEMBI" -> System.out.println(Days.ISHEMBI+" kunu: "+Days.ISHEMBI.daymethod());
            case "JEKSHEMBI" -> System.out.println(Days.JEKSHEMBI+" kunu: "+Days.JEKSHEMBI.daymethod());
            default -> System.out.println("Error");
        }
    }
}
