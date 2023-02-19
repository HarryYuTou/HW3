package edu.nyu.cs;

import static org.mockito.ArgumentMatchers.eq;

import java.util.Scanner;

/**
 * A variation of the game of Blackjack.  
 * Complete this program according to the instructions in the README.md file as well as within the given comments below.
 */
public class Blackjack {

  /**
   * The main function is automatically called first in a Java program.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {
    System.out.println("Welcome to Balckjack!");
    int card1 = (int)(Math.random()*11)+2;
    int card2 = (int)(Math.random()*11)+2;
    int usertotal=card1+card2;
    String usercards=Integer.toString(card1)+ " " +Integer.toString(card2);
    String usercards1=usercards;
    int dealercard1 = (int)(Math.random()*11)+2;
    int dealercard2 = (int)(Math.random()*11)+2;
    String dealercards = Integer.toString(dealercard1) + " " + Integer.toString(dealercard2); 
    String dealercards1=dealercards;
    int dealertotal = dealercard1+dealercard2;
    Scanner scn;
    Boolean keepgoing=true;
    Boolean keepgoing1=true;
    if (usertotal <= 21) {
      System.out.println("Your cards are: " + card1 + " and " + card2);
      while(keepgoing){
        scn = new Scanner (System.in);
        System.out.println("Would you like to hit or stand?");
        String userinput = scn.nextLine();
        if (userinput.equals("hit")){
          int card_add = (int)(Math.random()*11)+2;
          usercards1 = usercards1 + " " + Integer.toString(card_add);
          System.out.println("Your cards are: " + usercards1);
          usertotal+=card_add;
          if (usertotal>21){
            System.out.println("You have bust!");
            System.out.println("Dealer wins!");
            break;
          }
          else {
            continue;
          }
        }
        else if (userinput.equals( "stand") || userinput.equals("stop") || userinput.equals("pass")) {
          keepgoing=false;
    
        }
        scn.close();
      }
      
      if (usertotal<=21){
        while(keepgoing1){
          int dealerchoice=(int)(Math.random()*2)+1;
          if (dealerchoice==1){
          System.out.println("The dealer hits.");
          int dealercardadded = (int)(Math.random()*11)+2;
          dealertotal+=dealercardadded;
          dealercards1 = dealercards1 + " " + Integer.toString(dealercardadded);
            if (dealertotal>21){
              System.out.println("Your cards are: " + usercards1);
              System.out.println("The dealer's cards are: "+ dealercards1);
              System.out.println("The dealer has bust!");
              System.out.println("You win!");
              break;
          }
            else{
              continue;

        }
      }
          else if (dealerchoice==2){
            System.out.println("The dealer stands.");
            keepgoing1=false;


      }

        

      }

        

      }
      if (usertotal <=21 && dealertotal <=21){
        if (usertotal > dealertotal){
          System.out.println("Your cards are: "+ usercards1);
          System.out.println("The dealer's cards are: "+ dealercards1);
          System.out.println("You win!");
        }
        else if (usertotal==dealertotal){
          System.out.println("Your cards are: "+ usercards1);
          System.out.println("The dealer's cards are: "+ dealercards1);
          System.out.println("Tie!");

        }
        else{
          System.out.println("Your cards are: "+ usercards1);
          System.out.println("The dealer's cards are: "+ dealercards1);
          System.out.println("Dealer wins!");
        }

      }
      

    }
    else{
      System.out.println("Your cards are: " + card1 + " and " + card2);
      System.out.println("You have bust!");
      System.out.println("Dealer wins!");
    }
  
  } // main

}
