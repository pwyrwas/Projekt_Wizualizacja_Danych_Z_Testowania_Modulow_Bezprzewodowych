/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_pp;

/**
 *
 * @author user
 */
public class module {
    private String name;
    private String deviceId;
    private String mode;
    private String chanel;
    
        
    public module(String n, String id, String mod, String cha){
        name = n ;
        deviceId = id;
        mode = mod;
        chanel = cha;
    }
    
    public String getName() { return name; }
    public String getDeviceId() { return deviceId; }
    public String getChanel() { return chanel; }
    public String getMode() { return mode; }
    
}
