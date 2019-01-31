/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stations;

import java.io.IOException;

/**
 *
 * @author irakli
 */
public abstract class Functions {
    abstract public  void Showtime() throws InterruptedException;
    abstract public void printStation()throws InterruptedException, IOException;
    public static void clearScreen()  {  
        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
      
   } 
    
    abstract public void printStationFolder();
   
}
