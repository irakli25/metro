/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;
import java.io.IOException;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author irakli
 */
public class MyTimer {
    
    private static Thread TH;
    private static int sec60;
    private static int sec10;
    private Calendar Time;

   
    public MyTimer() 
    {
    Thread TH = new Thread();
    
    }
    
    public static void Sleep() throws InterruptedException
    {
        TH.sleep(1000);
    
    }
    
    public static void clearScreen()  {  
        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
      
   }  

    
}
