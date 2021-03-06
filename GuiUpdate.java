/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastmileauto;

import java.util.Random;

public class GuiUpdate implements Runnable {
    private int sleepTime;
    private static Random generator = new Random();
    private ControlUI cui;
    private DataStore ds;

    public GuiUpdate(DataStore ds, ControlUI cui){
        this.cui = cui;
        this.ds = ds;
        sleepTime = generator.nextInt(20000);
    }
@Override
public void run (){
   
    try {
        cui.appendStatus("GuiUpdate startar och kommer att köra i "
        + sleepTime + " millisekunder." );
        
        int i = 1;    
        while(i <= 20){
            Thread.sleep(sleepTime /20);
            if(ds.updateUIflag == true)
            {
            cui.appendStatus ("Jag är tråd GuiUpdate! För " 
            + i + ":te gången.");
            i++;      
            }
                       }
            }
    
    catch (InterruptedException exception) {
        }
    
        cui.appendStatus("GuiUpdate är nu klar!");
    }

}
