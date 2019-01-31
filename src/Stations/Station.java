/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stations;
import Time.MyTimer;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import Escalator.Escalator;
import Train.Train;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
//import Functions;
/**
 *
 * @author irakli
 */
public class Station extends Functions {
    
    private String Name;
    private static MyTimer  timer;
    private Calendar Time;
    private Escalator escalator;
    private Train train;
    private static int secondsl=70;
    private static int secondsr=64;
    private static int passengers= (int)Math.floor(Math.random()*100);
    
    public Station(String Name, int k) 
    {
        
        this.Name=Name;
        timer=new MyTimer();
        escalator=new Escalator(k);
       
        
        
       
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static void setTimer(MyTimer timer) {
        Station.timer = timer;
    }

    public void setTime(Calendar Time) {
        this.Time = Time;
    }

    public void setEscalator(Escalator escalator) {
        this.escalator = escalator;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public static void setSecondsl(int secondsl) {
        Station.secondsl = secondsl;
    }

    public static void setSecondsr(int secondsr) {
        Station.secondsr = secondsr;
    }

    public static void setPassengers(int passengers) {
        Station.passengers = passengers;
    }

    public String getName() {
        return Name;
    }

    public static MyTimer getTimer() {
        return timer;
    }

    public Calendar getTime() {
        return Time;
    }

    public Escalator getEscalator() {
        return escalator;
    }

    public Train getTrain() {
        return train;
    }

    public static int getSecondsl() {
        return secondsl;
    }

    public static int getSecondsr() {
        return secondsr;
    }

    public static int getPassengers() {
        return passengers;
    }
    
    public static void sec() throws InterruptedException
    {secondsl-=1;
        if(secondsl==0){
            
            secondsl=70;
        }
        
        secondsr-=1;
        if(secondsr==0){
            
            secondsr=70;
        }
    }
    
    @Override
    public void Showtime() throws InterruptedException
    {
        Time=Calendar.getInstance();
        Date currentTime = Time.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.print("\t\t\t\t\t\t\t\t\t\t Time : "+ sdf.format(currentTime));
        
        
    }
    @Override
    public void printStation() throws InterruptedException, IOException
    { sec();
    System.out.print(" Name : "+Name);
    Showtime();   System.out.print("\n");
    System.out.print("___________           ______________            _________________        _______________          _______________");
    System.out.print("\n");
    System.out.print("\n\n");
    System.out.print("Right platform " ); System.out.print("\t\t\t\t\t\t\t\t\t\t Time : ");
    if(secondsr<20){
        if(this.passengers>20)
           this.passengers-=(int)Math.floor(Math.random()*20);
        else{this.passengers=20;}
            if(secondsr<10){
               System.out.print("00"+"\n");
            if(secondsr==9)
              train=new Train();
            train.ShowTrain();
            if(secondsr==4)
            passengers+=train.getPassengers();
            
        }
    else
        System.out.print("0"+(secondsr-10)+"\n");}
    
  /* else { 
        if(secondsr<10)
            System.out.print("00"+"\n");*/
    else
        System.out.print(secondsr-10);  System.out.print("\n");
          
        System.out.print("\n\n");
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    System.out.print("Left platform " ); System.out.print("\t\t\t\t\t\t\t\t\t\t Time : ");
    if(secondsl<20){
        if(this.passengers>20)
           this.passengers-=(int)Math.floor(Math.random()*20);
        else{this.passengers=20;}
        if(secondsl<10){
            System.out.print("00"+"\n");
            if(secondsl==9)
              train=new Train();
            train.ShowTrain();
            if(secondsl==4)
            passengers+=train.getPassengers();
            
        }
        else
        System.out.print("0"+(secondsl-10)+"\n");}
    
   /* else { 
        if(secondsl<10)
            System.out.print("00"+"\n");*/
    else
        System.out.print(secondsl-10);  System.out.print("\n");
    
    System.out.print("\n\n");
    
    ////////////////////////////////////////////////////////////////////////////
    
    System.out.print("___________           ______________            _________________        _______________          _______________");
    
    
    System.out.print("\n\n");
    System.out.print("Escalator : ");
    escalator.ShowEscalator();
    
    System.out.print("\n");
     System.out.print("___________           ______________            _________________        _______________          _______________");
    
      System.out.print("\n");
       System.out.print("Number of passengers at the station : \t");
        System.out.print(passengers);
         System.out.print("\n");
     System.out.print("___________           ______________            _________________        _______________          _______________");
    System.out.print("\n\n");
    }
   
    
    
    
    
    
    ////--------------------------------------------------------------------------------------------------------
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////// Folder
    
    
    
     @Override
    public void printStationFolder() 
            
    {   
        File output = new File("Stations/"+this.Name+".txt");
        try{sec();
            FileWriter fw = new FileWriter(output);
            BufferedWriter bw = new BufferedWriter(fw);
             
    bw.write(" სახელი : "+Name);
    //Showtime();
    Time=Calendar.getInstance();
        Date currentTime = Time.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        bw.write("\t\t\t\t\t\t\t\t\t\t Time : "+ sdf.format(currentTime));
       
    //////////////////////////////////////////////////////////////////////
    
    
    
    bw.newLine();
    bw.write("___________           ______________            _________________        _______________          _______________");
    bw.newLine();
    bw.newLine();
    bw.write("Right platform " ); bw.write("\t\t\t\t\t\t\t\t\t\t Time : ");
    if(secondsr<20){
        if(this.passengers!=0)
        this.passengers-=(int)Math.floor(Math.random()*20);
        if(secondsr<10){
            bw.write("00");
            bw.newLine();
            if(secondsr==9)
            train=new Train();
            train.ShowTrain();
            if(secondsr==4)
            passengers+=train.getPassengers();
            
        }
    else
        bw.write("0"+(secondsr-10));
    }
    
  /* else { 
        if(secondsr<10)
            System.out.print("00"+"\n");*/
    else
        bw.write(""+(secondsr-10));  
    
          
        bw.newLine();
        bw.newLine();
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    
    bw.write("Left platform " ); bw.write("\t\t\t\t\t\t\t\t\t\t Time : ");
    if(secondsl<20){
        if(this.passengers!=0)
        this.passengers-=5;
        if(secondsl<10){
            bw.write("00");
              bw.newLine();
            if(secondsl==9)
            train=new Train();
            train.ShowTrain();
            if(secondsl==4)
            passengers+=train.getPassengers();
            
        }
        else{
        bw.write("0"+(secondsl-10));
          bw.newLine();}
    }
         
   /* else { 
        if(secondsl<10)
            System.out.print("00"+"\n");*/
    else
        bw.write(""+(secondsl-10));
    bw.newLine();
    
      bw.newLine();
       bw.newLine();
    
    ////////////////////////////////////////////////////////////////////////////
    
   bw.write("___________           ______________            _________________        _______________          _______________");
    
    
      bw.newLine();
        bw.newLine();
    bw.write("Escalator : ");
    //escalator.ShowEscalator();
    
     if(escalator.getCounter()==2)
        bw.write(" # # ");
       else if(escalator.getCounter()==3)
        bw.write(" # # # ");
            else if(escalator.getCounter()==0)
               bw.write("  * There is no escalator *  ");
    
    ///////////////////////////////////////////
    
    
    
    
    
    
    
    
      bw.newLine();
     bw.write("___________           ______________            _________________        _______________          _______________");
    
        bw.newLine();
       bw.write("Number of passengers at the station : \t");
        bw.write(""+passengers);
           bw.newLine();
     bw.write("___________           ______________            _________________        _______________          _______________");
      bw.newLine();
        bw.newLine();
    bw.close();
    fw.close();
    }
    
        
        
        catch (IOException e) {
            System.out.println(e.getMessage());
    }
    
     catch (InterruptedException e) {
            System.out.println(e.getMessage());
    }
}
}
