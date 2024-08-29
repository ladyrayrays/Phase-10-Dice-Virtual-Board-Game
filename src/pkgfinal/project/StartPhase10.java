/*
Brianna Cochran
CS 202
The actual game of phase 10
 */
package pkgfinal.project;

//probably will split a bunch of this stuff into other classes

import java.util.Scanner;

public class StartPhase10 {
    Scanner in = new Scanner(System.in);
    Die1 Die1 = new Die1();
    Die2 Die2 = new Die2();
    
    private int Dice1;
    private int Dice2;
    private int Dice3;
    private int Dice4;
    private int Dice5;
    private int Dice6;
    private int Dice7;
    private int Dice8;
    private int Dice9;
    private int Dice10;
    private String color1;
    private String color2;
    private String color3;
    private String color4;
    private String color5;
    private String color6;
    private String color7;
    private String color8;
    private String color9;
    private String color10;
    private int StartPhase;
    private String Phase;
    private int Set;
    private int DiceNumberScore1;
    private int DiceNumberScore2;
    private int DiceNumberScore3;
    private int DiceNumberScore4;
    private int DiceNumberScore5;
    private int DiceNumberScore6;
    private int DiceNumberScore7;
    private int DiceNumberScore8;
    private int DiceNumberScore9;
    private int DiceNumberScore10;
    private int count;
    private int wild;
    private int ScorePhase1;
    
    public StartPhase10(){
        StartPhase = 1;
        Set = 0;
        
    }
    
    public String Phases(){   
        if(StartPhase == 1){
            Phase = "You need 2 Sets of 3";
        }
        else if(StartPhase == 2){
            Phase = "You need 1 set of 3 and 1 run of 4";
        }
        else if(StartPhase == 3){
            Phase = "You need 1 run of 4 and 1 set of 4";
        }
        else if(StartPhase == 4){
            Phase = "You need 1 run of 7";
        }
        else if(StartPhase == 5){
            Phase = "You need 1 run of 8";
        }
        else if(StartPhase == 6){
            Phase = "You need 1 run of 9";
        }
        else if(StartPhase == 7){
            Phase = "You need 2 sets of 4";
        }
        else if(StartPhase == 8){
            Phase = "You need 7 of all 1 color";
        }
        else if(StartPhase == 9){
            Phase = "You need 1 set of 5 and 1 set of 2";
        }
        else if(StartPhase == 10){
            Phase = "You need 1 set of 5 and 1 set of 3";
        }
        else{
            Phase = "Your finished";
        }
        return Phase;
    }
    public void WhatDiceKeep(){
        System.out.println("How many dice do you want to change?");
        int awnser = in.nextInt();
        System.out.println("Choose the Dice you want to change one at a time by entering the Dice number 1-10");
        while(awnser > 0){
            System.out.println("Pick a Dice");
            int awnser2 = in.nextInt();
            if(awnser2 == 1){
                Dice1 = Die1.roll();
                awnser--;
            }
            else if(awnser2 == 2){
                Dice2 = Die1.roll();
                awnser--;
            }
            else if(awnser2 == 3){
                Dice3 = Die1.roll();
                awnser--;
            }
            else if(awnser2 == 4){
                Dice4 = Die1.roll();
                awnser--;
            }
            else if(awnser2 == 5){
                Dice5 = Die2.roll();
                awnser--;
            }
            else if(awnser2 == 6){
                Dice6 = Die2.roll();
                awnser--;
            }
            else if(awnser2 == 7){
                Dice7 = Die2.roll();
                awnser--;
            }
            else if(awnser2 == 8){
                Dice8 = Die2.roll();
                awnser--;
            }
            else if(awnser2 == 9){
                Dice9 = Die2.roll();
                awnser--;
            }
            else if(awnser2 == 10){
                Dice10 = Die2.roll();
                awnser--;
            }
            else{
                System.out.println("Error, Renter dice number");
            }
            
            
        }
    }
    
    public void KeepScore(){
        if(StartPhase == 1){
            if(DiceNumberScore1 <= 3){
                ScorePhase1 = ScorePhase1 + 1*3;
            }
            if(DiceNumberScore2 <= 3){
                ScorePhase1 = ScorePhase1 + 2*3;
            }
            if(DiceNumberScore3 <= 3){
                ScorePhase1 = ScorePhase1 + 3*3;
            }
            if(DiceNumberScore4 <= 3){
                ScorePhase1 = ScorePhase1 + 4*3;
            }
            if(DiceNumberScore5 <= 3){
                if(wild-DiceNumberScore5 >= 3){
                    ScorePhase1 = ScorePhase1 + 5*3;
                }
            }
            if(DiceNumberScore6 <= 3){
                if(wild-DiceNumberScore6 >= 3){
                    ScorePhase1 = ScorePhase1 + 6*3;
                }
            }
             
        }
    }
    
    public void FirstRoll(){
       Dice1 = Die1.roll();
       Dice2 = Die1.roll();
       Dice3 = Die1.roll();
       Dice4 = Die1.roll();
       //wild dice are wild if roll is 5 or 6
       Dice5 = Die2.roll();
       Dice6 = Die2.roll();
       Dice7 = Die2.roll();
       Dice8 = Die2.roll();
       Dice9 = Die2.roll();
       Dice10 = Die2.roll();
    }
    
    public void FirstRollPrint(){
        if(Dice1 == 5 || Dice1 == 6){
            System.out.println("Dice 1 - Wild" + "||" + color1);
        }
        else{
            System.out.println("Dice 1 - " + Dice1 + "||" + color1);
        }
        if(Dice2 == 5 || Dice2 == 6){
            System.out.println("Dice 2 - Wild" + "||" + color2);
        }
        else{
            System.out.println("Dice 2 - " +Dice2 + "||" + color2);
        }
        if(Dice3 == 5 || Dice3 == 6){
            System.out.println("Dice 3 - Wild" + "||" + color3);
        }
        else{
            System.out.println("Dice 3 - " + Dice3 + "||" + color3);
        }
        if(Dice4 == 5 || Dice4 == 6){
            System.out.println("Dice 4 - Wild" + "||" + color4);
        }
        else{
            System.out.println("Dice 4 - " + Dice4 + "||" + color4);
        }
        System.out.println("Dice 5 - " + Dice5 + "||" + color5);
        System.out.println("Dice 6 - " + Dice6 + "||" + color6);
        System.out.println("Dice 7 - " + Dice7 + "||" + color7);
        System.out.println("Dice 8 - " + Dice8 + "||" + color8);
        System.out.println("Dice 9 - " + Dice9 + "||" + color9);
        System.out.println("Dice 10 - " + Dice10 + "||" + color10);
        
        
      
        
        
    }
    //need more checks
    //DiceNumberScore1 tells me what number the dice was that matched
    //sets keep track at how many matching dice there is
    //
    public int CheckForSet(){
        //if 3 or more wild present can't count towards score
        if(Dice1 == 1){
            DiceNumberScore1++;
        }
        else if(Dice1 == 2){
            DiceNumberScore2++;
        }
        else if(Dice1 == 3){
            DiceNumberScore3++;
        }
        else if(Dice1 == 4){
            DiceNumberScore4++;
        }
        else if(Dice1 == 5){
            DiceNumberScore5++;
            wild++;
        }
        else if(Dice1 == 6){
            DiceNumberScore6++;
            wild++;
        }
        
        
        if(Dice2 == 1){
            DiceNumberScore1++;
        }
        else if(Dice2 == 2){
            DiceNumberScore2++;
        }
        else if(Dice2 == 3){
            DiceNumberScore3++;
        }
        else if(Dice2 == 4){
            DiceNumberScore4++;
        }
        else if(Dice2 == 5){
            DiceNumberScore5++;
            wild++;
        }
        else if(Dice2 == 6){
            DiceNumberScore6++;
            wild++;
        }
        
        
        if(Dice3 == 1){
            DiceNumberScore1++;
        }
        else if(Dice3 == 2){
            DiceNumberScore2++;
        }
        else if(Dice3 == 3){
            DiceNumberScore3++;
        }
        else if(Dice3 == 4){
            DiceNumberScore4++;
        }
        else if(Dice3 == 5){
            DiceNumberScore5++;
            wild++;
        }
        else if(Dice3 == 6){
            DiceNumberScore6++;
            wild++;
        }
        
        
        if(Dice4 == 1){
            DiceNumberScore1++;
        }
        else if(Dice4 == 2){
            DiceNumberScore2++;
        }
        else if(Dice4 == 3){
            DiceNumberScore3++;
        }
        else if(Dice4 == 4){
            DiceNumberScore4++;
        }
        else if(Dice4 == 5){
            DiceNumberScore5++;
            wild++;
        }
        else if(Dice4 == 6){
            DiceNumberScore6++;
            wild++;
        }
        
        
        if(Dice5 == 5){
            DiceNumberScore5++;
        }
        else if(Dice5 == 6){
            DiceNumberScore6++;
        }
        else if(Dice5 == 7){
            DiceNumberScore7++;
        }
        else if(Dice5 == 8){
            DiceNumberScore8++;
        }
        else if(Dice5 == 9){
            DiceNumberScore9++;
        }
        else if(Dice5 == 10){
            DiceNumberScore10++;
        }
        
        if(Dice6 == 5){
            DiceNumberScore5++;
        }
        else if(Dice6 == 6){
            DiceNumberScore6++;
        }
        else if(Dice6 == 7){
            DiceNumberScore7++;
        }
        else if(Dice6 == 8){
            DiceNumberScore8++;
        }
        else if(Dice6 == 9){
            DiceNumberScore9++;
        }
        else if(Dice6 == 10){
            DiceNumberScore10++;
        }
       
        if(Dice7 == 5){
            DiceNumberScore5++;
        }
        else if(Dice7 == 6){
            DiceNumberScore6++;
        }
        else if(Dice7 == 7){
            DiceNumberScore7++;
        }
        else if(Dice7 == 8){
            DiceNumberScore8++;
        }
        else if(Dice7 == 9){
            DiceNumberScore9++;
        }
        else if(Dice7 == 10){
            DiceNumberScore10++;
        }
        
        if(Dice8 == 5){
            DiceNumberScore5++;
        }
        else if(Dice8 == 6){
            DiceNumberScore6++;
        }
        else if(Dice8 == 7){
            DiceNumberScore7++;
        }
        else if(Dice8 == 8){
            DiceNumberScore8++;
        }
        else if(Dice8 == 9){
            DiceNumberScore9++;
        }
        else if(Dice8 == 10){
            DiceNumberScore10++;
        }
        
        if(Dice9 == 5){
            DiceNumberScore5++;
        }
        else if(Dice9 == 6){
            DiceNumberScore6++;
        }
        else if(Dice9 == 7){
            DiceNumberScore7++;
        }
        else if(Dice9 == 8){
            DiceNumberScore8++;
        }
        else if(Dice9 == 9){
            DiceNumberScore9++;
        }
        else if(Dice9 == 10){
            DiceNumberScore10++;
        }
        
        if(Dice10 == 5){
            DiceNumberScore5++;
        }
        else if(Dice10 == 6){
            DiceNumberScore6++;
        }
        else if(Dice10 == 7){
            DiceNumberScore7++;
        }
        else if(Dice10 == 8){
            DiceNumberScore8++;
        }
        else if(Dice10 == 9){
            DiceNumberScore9++;
        }
        else if(Dice10 == 10){
            DiceNumberScore10++;
        }
        return wild;
    }
    //each die are different colors
    public void ColorOfDice(){
        if(Dice1 == 1){
            color1 = "blue";
        }
        else if(Dice1 == 2){
            color1 = "green";
        }
        else if(Dice1 == 3){
            color1 =  "orange";
        }
        else if(Dice1 == 4){
            color1 = "green";        
        }
        else if(Dice1 == 5){
            color1 = "red";
        }
        else if(Dice1 == 6){
            color1 = "orange";
        }
        else{
            color1 = "Error";
        }
        
        if(Dice2 == 1){
            color2 = "red";
        }
        else if(Dice2 == 2){
            color2 = "blue";
        }
        else if(Dice2 == 3){
            color2 = "green";
        }
        else if(Dice2 == 4){
            color2 = "orange";
        }
        else if(Dice2 == 5){
            color2 = "blue";
        }
        else if(Dice2 == 6){
            color2 = "orange";
        }
        else{
            color2 = "Error";
        }
        
        if(Dice3 == 1){
            color3 = "orange";
        }
        else if(Dice3 == 2){
            color3 = "red";
        }
        else if(Dice3 == 3){
            color3 = "red";
        }
        else if(Dice3 == 4){
            color3 = "blue";
        }
        else if(Dice3 == 5){
            color3 = "green";
        }
        else if(Dice3 == 6){
            color3 = "blue";
        }
        else{
            color3 = "Error";
        }
        
        if(Dice4 == 1){
            color4 = "green";
        }
        else if(Dice4 == 2){
            color4 = "orange";
        }
        else if(Dice4 == 3){
            color4 = "blue";
        }
        else if(Dice4 == 4){
            color4 = "red";
        }
        else if(Dice4 == 5){
            color4 = "red";
        }
        else if(Dice4 == 6){
            color4 = "green";
        }
        else{
            color5 = "Error";
        }
        
        if(Dice5 == 5){
            color5 = "red";
        }
        else if(Dice5 == 6){
            color5 = "orange";
        }
        else if(Dice5 == 7){
            color5 = "blue";
        }
        else if(Dice5 == 8){
            color5 = "green";
        }
        else if(Dice5 == 9){
            color5 = "orange";
        }
        else if(Dice5 == 10){
            color5 = "green";
        }
        else{
            color5 = "Error";
        }
        
        if(Dice6 == 5){
            color6 = "green";
        }
        else if(Dice6 == 6){
            color6 = "red";
        }
        else if(Dice6 == 7){
            color6 = "green";
        }
        else if(Dice6 == 8){
            color6 = "orange";
        }
        else if(Dice6 == 9){
            color6 = "blue";
        }
        else if(Dice6 == 10){
            color6 = "red";
        }
        else{
            color6 = "error";
        }
        
        if(Dice7 == 5){
            color7 = "orange";
        }
        else if(Dice7 == 6){
            color7 = "blue";
        }
        else if(Dice7 == 7){
            color7 = "red";
        }
        else if(Dice7 == 8){
            color7 = "blue";
        }
        else if(Dice7 == 9){
            color7 = "green";
        }
        else if(Dice7 == 10){
            color7 = "orange";
        }
        else{
            color7 = "error";
        }
        
        if(Dice8 == 5){
            color8 = "red";
        }
        else if(Dice8 == 6){
            color8 = "green";
        }
        else if(Dice8 == 7){
            color8 = "orange";
        }
        else if(Dice8 == 8){
            color8 = "blue";
        }
        else if(Dice8 == 9){
            color8 = "red";
        }
        else if(Dice8 == 10){
            color8 = "blue";
        }
        else{
            color8 = "error"; 
        }
        
        if(Dice9 == 5){
            color9 = "blue";
        }
        else if(Dice9 == 6){
            color9 = "blue";
        }
        else if(Dice9 == 7){
            color9 = "red";
        }
        else if(Dice9 == 8){
            color9 = "orange";
        }
        else if(Dice9 == 9){
            color9 = "red";
        }
        else if(Dice9 == 10){
            color9 = "green";
        }
        else{
            color9 = "Error";
        }
        
        if(Dice10 == 5){
            color10 = "blue";
        }
        else if(Dice10 == 6){
            color10 = "orange";
        }
        else if(Dice10 == 7){
            color10 = "green";
        }
        else if(Dice10 == 8){
            color10 = "red";
        }
        else if(Dice10 == 9){
            color10 = "green";
        }
        else if(Dice10 == 10){
            color10 = "orange";
        }
        else{
            color10 = "Error";
        }
    }
}
