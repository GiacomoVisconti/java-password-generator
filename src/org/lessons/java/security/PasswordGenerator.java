package org.lessons.java.security;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class PasswordGenerator {


    public static void main(String[] args) {
        // - Salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
        // - Generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -

        // Esempio:
        // Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011

        Scanner input = new Scanner(System.in);

        //Input Nome
        System.out.println("Inserisci il tuo nome:");
        String nome = input.nextLine();


        //Input cognome    
        System.out.println("Inserisci il tuo cognome:");
        String cognome = input.nextLine();
        


        //Input Colore preferito
        System.out.println("Qual è il tuo colore preferito?");
        String colore = input.nextLine();


        //Input Data di nascita
        System.out.println("Inserisci il tuo giorno di Nascita:");
        int day = input.nextInt();
        String d = String.format("%02d", day );


         System.out.println("Inserisci il tuo mese di Nascita:");
        int month = input.nextInt();
        String m = String.format("%02d", month );

        System.out.println("Inserisci il tuo anno di Nascita con questo formato 'yyyy': ");
        int year = input.nextInt();
        

        String data = d + "/" + m + "/" + year;


        System.out.println("Tu ti chiami: " + nome + " " + cognome);
        System.out.println("il tuo colore preferito è: " + colore.toLowerCase());
        System.out.println("Sei nato il : " + data);

        int dateResult = day + month + year;
        String password = nome + "-" + cognome + "-" + colore.toLowerCase() + "-" + dateResult;

        System.out.println("Quindi la tua password sarà: " + password);
    
    }
}
