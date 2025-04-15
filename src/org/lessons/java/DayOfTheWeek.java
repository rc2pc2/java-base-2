package org.lessons.java;

public class DayOfTheWeek {
    public static void main(String[] args) {
        
        int day = 0; //
        String dayName;

        // if ( day == 1) {
        //     dayName = "Lunedi'";
        // } else if (day == 2){
        //     dayName = "Martedi'";
        // } ...

        switch (day){
            case 1: // else if (day == 1)
                dayName = "Lunedi";
                break;
            case 2:  // else if (day == 2)
                dayName = "Martedi";
                break;
            case 3:  // else if (day == 3)
                dayName = "Mercoledi";
                break;
            case 4:
                dayName = "Giovedi";
                break;
            case 5:
                dayName = "Venerdi";
                break;
            case 6:
                dayName = "Sabato";
                break;
            case 7:
                dayName = "Domenica";
                break;
            default:
                dayName = "Non trovato"; 
        }

        System.out.println(dayName);


    }
}
