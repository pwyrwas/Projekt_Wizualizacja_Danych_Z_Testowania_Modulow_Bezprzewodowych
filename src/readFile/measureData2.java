/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readFile;


/**
 *
 * @author user
 *//**
 *
 * @author user
 */
public class measureData2 {
    private String testID;
    private String nameTest;
    private int numberOfRepeat;
    private int initialSizePack;
    private int stepIncreasePack;
    private int numberRepeatSingleIteration;
    
    //Tablice ,Rozmiar,Czas,Status,NR-Kroku
    private String statusTable[];
    private String timeTable[];
    private String sizeTable[];
    private String numberOfStepTable[];
    private Float dataTableForChart[][];
    private Float ttime[];
    private Float tsize[];
    private Float tnr[];

    
    public measureData2(String id, String nt, int nor, int isp, int sip, int nrsi, String st[], String tt[], String sizt[], String nost[]){
        testID= id;
        nameTest= nt;
        numberOfRepeat = nor;
        initialSizePack = isp;
        stepIncreasePack = sip;
        numberRepeatSingleIteration = nrsi;
        statusTable = st;
        timeTable = tt;
        sizeTable = sizt;
        numberOfStepTable = nost;
        
        
    }
    public String getTestID() { return testID; }
    public String getTestName() { return nameTest; }
    public int getnumberOfRepeat() { return numberOfRepeat; }
    public int getInitialSizePack() { return initialSizePack; }
    public int getStepIncreasePack() { return stepIncreasePack; }
    public int getNuberRepeatSingleIteration() { return numberRepeatSingleIteration; }
    public Float[][] getdataTableForChart(){ return dataTableForChart; }
    public String[] getStatusTable(){ return statusTable;}
    public String[] getTimeTable(){ return timeTable;}
    public String[] getSizeTable(){ return sizeTable;}
    public String[] getNumberOfStepTable(){ return numberOfStepTable;}
    

}
