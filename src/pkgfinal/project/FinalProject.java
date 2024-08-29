/*
Brianna Cochran
CS 202
To represent a game of Phase 10 Dice
 */
package pkgfinal.project;


public class FinalProject {

    
    public static void main(String[] args) {
        Die1 Die1 = new Die1();
        StartPhase10 game = new StartPhase10();
        game.FirstRoll();
        game.ColorOfDice();
        game.FirstRollPrint();
        game.CheckForSet();
        
        
        /* 
        Have 10 dice classes or just 2 depends on wild dice, use example on moodle. 
            6 dice are 5-10
            each die are different colours on the sides - make class that figures out the colour of die
            4 dice are 1-4 but have different amounts of wilds "find out how to have  wilds on dice"
        score class
            first 5 phases at end amount over 220 extra 40
            after next 5 whoever finishes first gets extra 40
            add up total via numbers on dice
            1 - 2 sets of 3
            2 -  1 set of 3  & 1 run of 4
            3 - 1 set of 4 & 1 run of 4
            4 - 1 run of 7
            5 - 1 run of 8
            6 - 1 run of 9
            7 - 2 set of 4
            8 - 7 of all once color
            9 - 1 set of 5 & 1 set of 2
            10 - 1 set of 5 & 1 set of 3
        Need a way to keep track of what phase which person is on.
            always print first what phase they are on
        
        have a way to detect if they got a correct set or run
            each time they role ask if they want to keep or not
            once 3 roles are done, use if for sets and some runs
            need to catch if they at the end of multiple sets and only need one, ask to choose one or naturally take the highest for ideal points.
        need a class or function that allows the people to roll all dice 3 times and keep the ones they choose
        game class or function
            actually plays game
        */
    }
    
       
    
    
}
