/*
Brianna Cochran
CS 202
Simulate a dice 5-10
 */
package pkgfinal.project;
    import java.util.Random;

public class Die2 {
    private Random r;
    private int sides;
    
    public Die2(){
        r = new Random();
        sides = 6;
    }
    public Die2(int sides){
        r = new Random();
        this.sides = sides;
    }
    
    public int roll(){
       String Wild = "wild";
       int number = r.nextInt(6) + 1;
       number = number + 4;
       return number;
    }
    /*
    color of dice
    
    first die
    5- red
    6- orange
    7- blue
    8 - green
    9-orange
    10 -green
    
    
    Second die
    5-green
    6-red
    7-green
    8- orange
    9-blue
    10-red
    
    third die
    5-orange
    6- blue
    7-red
    8-blue
    9-green
    10-orange
    
    fourth die
    5- red
    6- green
    7- orange
    8-blue
    9-red
    10-blue
    
    fifth die
    5-blue
    6-blue
    7-red
    8-orange
    9-red
    10-green
    
    sixth die
    5-blue
    6-orange
    7-green
    8-red
    9-green
    10-orange
    
    */
}
