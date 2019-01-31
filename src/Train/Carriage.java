/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Train;
import PeopleGenerator.PeopleGenerator;



/**
 *
 * @author irakli
 */
public class Carriage implements PeopleGenerator {
    private int number;
    private int passengers;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() { 
        return passengers;
    }
    
    public Carriage()
    {
       
        this.number=(int)Math.floor(Math.random()*10000);
    }
    
   
    int get_number()
    {
        return number;
    }
    
    
    @Override
    public int PeopleGenerator()
    {
    
    
    this.passengers=(int)Math.floor(Math.random()*100);
    return passengers;
    }

   
    
}