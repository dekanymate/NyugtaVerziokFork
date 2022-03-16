package nyugtaprojektek;

import java.util.ArrayList;


public class Nyugta3 {

    public static void main(String[] args) {
        String csillagok = "********************";
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);
        
        final String HUF = "Ft";
        int[] tetelLista = {350,90,1320};
        for (int i = 0; i < tetelLista.length; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel ",(i+1),tetelLista[i], HUF);
        }

        String duplaVonal = "====================";
        System.out.println(duplaVonal);
        int osszesen = 0;
        for (int i = 0; i < tetelLista.length; i++) {
            osszesen = tetelLista[i] + osszesen;
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";

        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        
        System.out.println(csillagok);    
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }

}
