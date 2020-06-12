import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class YCSLONDON {
  
  public static List<String> card_names = new ArrayList<String>();
  public static float counter = 0;
  
  //this is the number you change if you want to test more hands
  public static final float NUMBER_OF_TRAILS = 10;
  
	public static void main(String[] args) {
    generateNames();
		// Change value for amount of simulations 
		for(int v=1; v <=NUMBER_OF_TRAILS; v++) {
      if(generateHand(5,40)) counter++;
		}
    float chance = counter/NUMBER_OF_TRAILS;
    
    System.out.println("-------------------------");
    System.out.println("overall percentage of succesful hands:");
    System.out.println(chance);
	}
  
  public static void generateNames() {
    //should definitely without a doubt be using a map here but i'm way too lazy for that so heres a bad idea to make the output nicer
    card_names.add("if you see this printed I fucked up, this is another reason you should use a map"); // <- this value is 0 therefore shouldnt be 0
    card_names.add("Circle");
    card_names.add("Gazelle");
    card_names.add("Cynet");
    card_names.add("Cynet");
    card_names.add("Cynet");
    card_names.add("Debug");
    card_names.add("Foxy");
    card_names.add("Foxy");
    card_names.add("Foxy");
    card_names.add("Spinny");
    card_names.add("Spinny");
    card_names.add("Spinny");
    card_names.add("Etele");
    card_names.add("Weilder");
    card_names.add("Tracker");
    card_names.add("Jackalope");
    card_names.add("Jackalope");
    card_names.add("Snake");
    card_names.add("Snake");
    card_names.add("Ash");
    card_names.add("Ash");
    card_names.add("Reborn");
    card_names.add("Will");
    card_names.add("Will");
    card_names.add("Will");
    card_names.add("Superpoly");
    card_names.add("Superpoly");
    card_names.add("Superpoly");
    card_names.add("Sanctum");
    card_names.add("Sanctum");
    card_names.add("Sanctum");
    card_names.add("Rage");
    card_names.add("Roar");
    card_names.add("Nibiru");
    card_names.add("Nibiru");
    card_names.add("Nibiru");
    card_names.add("Sytche");
    card_names.add("JackJag");
    card_names.add("Falco");
    card_names.add("Sanctuary"); // <- 40th card - 40 card main deck total
  }
    
	
	public static boolean generateHand(int hand_size, int deck_size){
    //generate deck
    List<Integer> deck = new ArrayList<Integer>();
    for(int i = 0; i < deck_size; i++){
      deck.add(i+1);
    }
    
    //"shuffle the deck"
    Collections.shuffle(deck);
    
    //generate the sample hand
    List<Integer> hand = new ArrayList<Integer>();
    System.out.println("-------------------------");
    System.out.println("-printing the sample hand");
    for(int i = 0; i<hand_size; i++){
      hand.add(deck.get(i));
      //if you don't want to see the card names remove the card_names.get and just get the card number in the deck
      System.out.println(card_names.get(deck.get(i)));
    }
    System.out.println("");
    return whenInDoubtBruteForce(hand);
  }
  
  public static boolean whenInDoubtBruteForce(List<Integer> hand){
    //note if you don't want to see the card name replace
    //{System.out.println("true, combo = "+card_names.get(card)); return true;}
    //with
    //{System.out.println("true, combo = "+card); return true;}
    //and replace
    //{System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
    //with
    //{System.out.println("true, combo = "+card+"-"+card2); return true;}
    for(int card : hand){
      if(card == 1) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 2) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 3) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 4) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 5) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 6) {System.out.println("true, combo = "+card_names.get(card)); return true;}
      else if(card == 7){
        for(int card2 : hand){
          if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
        }
      }
      else if(card == 8){
          for(int card2 : hand){
            if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          }
        }
      else if(card == 9){
          for(int card2 : hand){
            if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          }
        }
      else if(card == 10){
          for(int card2 : hand){
            if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          }
        }
      else if(card == 11){
          for(int card2 : hand){
            if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          }
        }
      else if(card == 12){
          for(int card2 : hand){
            if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
          }
        }      
      else if(card == 13){
            for(int card2 : hand){
                if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
                else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              }
            }
      else if(card == 14){
          for(int card2 : hand){
              if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      else if(card == 15){
          for(int card2 : hand){
              if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      else if(card == 16){
          for(int card2 : hand){
              if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      else if(card == 17){
          for(int card2 : hand){
              if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      else if(card == 18){
          for(int card2 : hand){
              if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      else if(card == 19){
          for(int card2 : hand){
              if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 20) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
              else if(card2 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
            }
          }
      
//    else if(card == 17){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//    else if(card == 18){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//    else if(card == 37){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 15) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 19) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//    else if(card == 12){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//    else if(card == 13){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//    else if(card == 14){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//        }
//      }
//      
//    else if(card == 19){
//        for(int card2 : hand){
//          if(card2 == 6) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 7) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 8) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 9) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 10) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 11) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 12) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 13) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 14) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 16) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 17) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 18) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 32) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 33) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//          else if(card2 == 37) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)); return true;}
//
//        }
//    }
//    else if(card == 9){
//        for(int card2 : hand){
//          if(card2 == 12) {
//    		for(int card3 : hand){
//                if(card3 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 22) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 23) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//    		}
//          }
//        }
//        		}
//    else if(card == 10){
//        for(int card2 : hand){
//          if(card2 == 12) {
//    		for(int card3 : hand){
//                if(card3 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 22) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 23) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//    		}
//          }
//        }
//        		}
//    else if(card == 11){
//        for(int card2 : hand){
//          if(card2 == 12) {
//    		for(int card3 : hand){
//                if(card3 == 21) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 22) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//                else if(card3 == 23) {System.out.println("true, combo = "+card_names.get(card)+"-"+card_names.get(card2)+"-"+card_names.get(card3)); return true;}
//    		}
//          }
//        }
//        		}
      
    		}
	 System.out.println("false, couldn't find a combo");
    return false;
    	}
	}
