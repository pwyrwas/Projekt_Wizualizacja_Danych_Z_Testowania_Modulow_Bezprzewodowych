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
public class measureData {
    private String testID;
    private String nameTest;
    private int numberOfRepeat;
    private int sizePack;
    private int distance;
    private String statusTable[];
    private int numberOKPack;
    private int numberERRPack;
    private int numberPack;
    
    public measureData(String id, String n,String st[], int nr, int s, int d){
        testID= id;
        nameTest= n;
        sizePack= s;
        distance = d;
        numberOfRepeat = nr;
        statusTable = st;
        numberPack = statusTable.length;
        
        int tempNr1 = 0; 
        for(int i= 0 ; i < statusTable.length;i++)
            {
                if(statusTable[i].equalsIgnoreCase("OK")) 
                {
                     tempNr1 = tempNr1 + 1;
                }
              
            }
        numberOKPack = tempNr1;
        int tempNr2 = 0;       
            for(int i= 0 ; i < statusTable.length;i++)
                {
                  if(statusTable[i].equalsIgnoreCase("ERR")) 
                  {
                       tempNr2 = tempNr2 + 1;
                  }
                }
        numberERRPack = tempNr2;
        
    }
    
    public String getStatus() { return testID; }
    public String getTestID() { return testID; }
    public String getTestName() { return nameTest; }
    public int getPackSize() { return sizePack; }
    public int getPackNumber() { return numberPack; }
    public int getDistance() { return distance; }
    public int getnumberOfRepeat() { return numberOfRepeat; }
    public int getNumberOKPack(){ return numberOKPack; }
    public int getNumberErrPack(){ return numberERRPack; }
}
