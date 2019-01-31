/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Stations.*;
import java.util.Scanner;
import Time.MyTimer;
import Escalator.*;
/**
 *
 * @author Irakli
 */
public class Main extends MyTimer {
    
    
     public static void main (String[] args) {
         try{
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the station number (1_Varketili, 2_Samgori, 3_Rustaveli, 4_Station square 1), 5_Save File  6_Out ... \n");
        //while (true) {
            int input = scan.nextInt();
         while(true){   
            if (input==1) {
                
                Station station = new Station("Varketili", 2);
                while(true){
                clearScreen();
                station.printStation();
                Sleep();
               if(station.getPassengers()>250)
                   station.setEscalator(new Escalator(3));
               else
                   station.setEscalator(new Escalator(2));
                }
        }
            
            
            
            else if (input==2) {
                
                Station station = new Station("Samgori", 0);
                while(true){
                clearScreen();
                station.printStation();
                Sleep();
               
                }
        }
            
            
            else if (input==3) {
                
                Station station = new Station("Rustaveli", 2);
                while(true){
                clearScreen();
                station.printStation();
                Sleep();
               if(station.getPassengers()>250)
                   station.setEscalator(new Escalator(3));
               else
                   station.setEscalator(new Escalator(2));
                }
        }
            

            
            
            else if (input==4) {
                
                Station station = new Station("Station square 1", 2);
                while(true){
                clearScreen();
                station.printStation();
                Sleep();
               if(station.getPassengers()>250)
                   station.setEscalator(new Escalator(3));
               else
                   station.setEscalator(new Escalator(2));
                }
        }
            
         //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////// Folder
             else if(input==5)
                 {
                    System.out.println("Enter the station number (1_Varketili, 2_Samgori, 3_Rustaveli, 4_Station square 1),  6_გასვლა ... \n");
                          
           
           
        /////////////////////////////////////////////////////////////////////   
           
         while(true){  // while For Folder 
             input = scan.nextInt();
            if (input==1) {
                
                Station station = new Station("Varketili", 2);
               station.printStationFolder();
               System.out.print("Information stored in file Varketili");
               //input=6;
        }
            
            
            
            else if (input==2) {
                
                Station station = new Station("Samgori", 0);
               station.printStationFolder();
               System.out.print("Information stored in file Samgori");
        }
            
            
            else if (input==3) {
                
                Station station = new Station("Rustaveli", 2);
               station.printStationFolder();
               System.out.print("Information stored in file Rustaveli");
        }
            

            
            
            else if (input==4) {
                
                Station station = new Station("Station square 1", 2);
               station.printStationFolder();
               System.out.print("Information stored in file Station square 1");
        }
            
             else if(input==6)
            {
            System.out.println("You're back to print on the screen");
             System.out.println("Enter the station number (1_Varketili, 2_Samgori, 3_Rustaveli, 4_Station square 1), 5_Save File  6_Out ... \n");
        
            break;
            }
            
            else System.out.println("Station not found, try again");
            
           
            
            
            
            
         }
                   }
            
            
             
             
             
             /////////////////////////////////////////////////////////////////////////////////////////////////////////
             ///////////////////////////////////////
             ////////////////////////////////////////////////////
             //////////////////////////////////////////////////////////////////
             
             
             
             
            
            else if(input==6)
            {
            
            System.out.println(" მეტროპოლიტენი წარმატებულ დღეს გისურვებთ ");
            break;
            }
            
            else System.out.println("შეყვანილი ნომრით სადგური არ არსებობს ცადეთ თავიდან");
            
            input = scan.nextInt();
         }
            
    
         }
         catch(Exception ex)
         {
             System.out.print("error");
         }
        
     }
}
