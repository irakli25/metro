/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escalator;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
/**
 *
 * @author irakli
 */
public class Escalator {
    
    private static int counter;
    private static boolean exist;
    public Escalator(int k)
            
    {
       switch(k){
           case 0 : {this.counter=k; this.exist=false;}
           case 2 : {this.counter=k; this.exist=true;}
           case 3 : {this.counter=k; this.exist=true;}
          
       }
    
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public static int getCounter() {
        return counter;
    }

    public boolean isExist() {
        return exist;
    }
    
    
    public void ShowEscalator()
    {
    
    if(counter==2)
        System.out.print(" # # ");
    if(counter==3)
        System.out.print(" # # # ");
    if(counter==0)
        System.out.print(" * There is no escalator * ");
    }
    
    
    
}
