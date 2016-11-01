/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readFile;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author user
 */
public class readFile {
    
    private final String sciezka;
     
    public readFile(String plik_sciezka){
    sciezka = plik_sciezka;
    }
    
    public String[] OtworzPlik() throws IOException {
         
        FileReader fr = new FileReader(sciezka);
        BufferedReader czytajTekst = new BufferedReader(fr);
         
        int liczbaWierszy = CzytajLinie( );;
        String[] tekstDane = new String[liczbaWierszy];
         
        int i;
         
        for(i=0; i < liczbaWierszy; i++){
            tekstDane[i] = czytajTekst.readLine();
        }
         
        czytajTekst.close();
        return tekstDane;
         
    }
    int CzytajLinie() throws IOException {
         
        FileReader plik_do_czytania = new FileReader(sciezka);
        BufferedReader bf = new BufferedReader(plik_do_czytania);
         
        String linie;
        int liczbaLinii = 0;
        while((linie = bf.readLine()) != null){
            liczbaLinii++;
        }
        bf.close();
         
        return liczbaLinii;
    }
}
