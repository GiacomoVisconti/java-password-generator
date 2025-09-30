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


        //Input Nome
        System.out.println("Inserisci il tuo nome:");

        Scanner inputNome = new Scanner(System.in);

        String nome = inputNome.nextLine();


        //Input cognome    
        System.out.println("Inserisci il tuo cognome:");

        Scanner inputCognome = new Scanner(System.in);

        String cognome = capitalize(inputCognome.nextLine());
        


        //Input Colore preferito
        System.out.println("Qual è il tuo colore preferito?");

        Scanner inputColore = new Scanner(System.in);

        String colore = inputColore.nextLine();


        //Input Data di nascita
        System.out.println("Inserisci il tuo giorno di Nascita:");
        Scanner dayInput = new Scanner(System.in);
        int day = dayInput.nextInt();
        String d = String.format("%02d", day );


         System.out.println("Inserisci il tuo mese di Nascita:");
        Scanner monthInput = new Scanner(System.in);
        int month = monthInput.nextInt();
        String m = String.format("%02d", month );

        System.out.println("Inserisci il tuo anno di Nascita con questo formato 'yyyy': ");
        Scanner yearInput = new Scanner(System.in);
        int year = yearInput.nextInt();
        

        String data = d + "/" + m + "/" + year;


        System.out.println("Tu ti chiami: " + nome + " " + cognome);
        System.out.println("il tuo colore preferito è: " + colore);
        System.out.println("Sei nato il : " + data);

    }
}
