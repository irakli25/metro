/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train;
import java.util.*;
import java.lang.Thread;
/**
 *
 * @author irakli
 */
public class Train {
    private static Thread TH;
    private int number;
    private Carriage carriage;
    Map<Integer, Integer> train;
    private int passengers=0;

    public int getPassengers() {
        return passengers;
    }
    
    
    public Train()
    {
        this.TH=new Thread();
        number=(int)Math.floor(Math.random()*100);
        train=new HashMap<>();
        for(int i=1; i<5; i++){
            carriage=new Carriage();
            train.put(i,carriage.get_number());
            passengers+=carriage.PeopleGenerator();
            //System.out.print(carriage.PeopleGenerator()+"\t");
        }
    }
    
    
    
    public static void clearScreen() throws InterruptedException {  
        
    System.out.print("\t\t\t\t\t\t\t\t\t\t");  
      
   } 
    
   /* void TrainCreator()
    {
        for(int i=1; i<5; i++){
            carriage=new Carriage();
            train.put(i,carriage.get_number());
        }
    }*/
    
    public void ShowTrain()
    {
        System.out.println("Train N:: "+this.number+"\t\t ####");
        for(int i=1; i<5; i++)
          System.out.print("Carriage "+i+" N:: "+train.get(i)+" ");
    
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCarriage(Carriage carriage) {
        this.carriage = carriage;
    }

    public void setTrain(Map<Integer, Integer> train) {
        this.train = train;
    }

    public int getNumber() {
        return number;
    }

    public Carriage getCarriage() {
        return carriage;
    }

    public Map<Integer, Integer> getTrain() {
        return train;
    }
    
/*   public static void main(String[] args) throws InterruptedException
    {
    //while(true){
        Train t= new Train();
        
       // clearScreen();
        
        //System.out.print(t.carriage.PeopleGenerator());
       
        
        
        //t.TH.sleep(500);
    //}
    
    }*/
    
   
}
