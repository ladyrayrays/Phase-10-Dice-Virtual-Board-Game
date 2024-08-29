/*
Brianna Cochran
CS 202
To represent a Dice 1-4 with 2 wilds
 */
package pkgfinal.project;

import java.util.Random;
public class Die1 {
    
    private Random r;
    private int sides;
    //There a 4 dice likes this has 1-4 on it and 2 wilds
    
    public Die1(){
        /*
        color of dice
        
        First Dice
        Has 2 wilds a red and orange
        1 - blue
        2- green
        3- orange
        4 - green
        
        
        Second Dice
        1- red
        2- blue
        3- green
        4- orange
        w - blue
        w- orange
        
        
        
        third dice
        1- orange
        2- red
        3- red
        4 - blue
        w - green
        w - blue
        
        
        fourth dice
        1- green
        2- orange
        3- blue
        4- red
        w- red
        w- green
        
        */
        r = new Random();
        sides = 6;
    
       }
    
    public Die1(int sides){
        r = new Random();
        this.sides = sides;
    }
    
    public int roll(){
        
       int number = r.nextInt(6) + 1;
       
        return number;
    }
}
