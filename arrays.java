//import Random class
import java.util.Random;

class Main {
  public static void main(String[] args) {
    //declare an array of adjectives
    String[] adjectiveArray;
    

    //allocate memory for 10 adjectives
    adjectiveArray = new String[10];
    
    //initialize first element of the adjective array
    adjectiveArray[0] = "ugly";

    //initialize second element of the adjective array
    adjectiveArray[1] = "scary";
    adjectiveArray[2] = "ghastly";
    adjectiveArray[3] = "hairy";
    adjectiveArray[4] = "terrifying";
    adjectiveArray[5] = "goofy";
    adjectiveArray[6] = "smelly";
    adjectiveArray[7] = "beautiful";
    adjectiveArray[8] = "thick";
    adjectiveArray[9] = "rad";   

    //create instance of the random class
    Random myRandom = new Random();
    
    
    //generate random integers between 0 and 999
    int randomNumber_int = myRandom.nextInt(1000);
    

    //declare and initialize an array of places
    String[] placeArray = {"Atrium Building", "Stingers", "Mathematics Building", "Library", "Haunted Howell", "Parking Deck", "Student Center", "Central Parking", "Columns", "Q 202"};


    //declare and initialize an array of plural nouns
    String[] pluralNounArray = {"boys", "girls", "ghosts", "ghouls", "witches", "monsters", "skeletons", "mummies", "wolves", "demons"};


    //declare and initialize an array of colors
    String[] colorArray = {"red", "blue", "purple", "orange", "yellow", "pink", "green", "black", "brown", "white"};

    //declare and initialize an array of food items
    String[] foodArray = {"apples", "brussel sprouts", "pumpkin pie", "apple pie", "strawberry jello", "cranberry stuffing", "smoked turkey", "a chicken thigh", "a pumpkin spice latte", "macaroni and cheese"};


    //declare and initialize an array of verbs
    String[] verbArray = {"eat", "attack", "awaken", "cackle", "run", "scream", "cry", "fly", "ride", "arise"};

    //print silly story
    System.out.print("Halloween has its origins in a(n) " + getRandomValue(adjectiveArray));
    System.out.print(" celebrated " + randomNumber_int + " years ago.  The phrase \'Trick or Treat\' started in " + getRandomValue(placeArray));
    System.out.print(" where children dressed up as " + getRandomValue(adjectiveArray));
    System.out.print(" " + getRandomValue(pluralNounArray) + ", ");
    System.out.print(getRandomValue(colorArray) + " " + getRandomValue(pluralNounArray));
    System.out.print(", or even " + getRandomValue(adjectiveArray));
    System.out.print(" " + getRandomValue(pluralNounArray));
    System.out.print(" and would go door to door asking for " + getRandomValue(foodArray));
    System.out.print(" and " + getRandomValue(adjectiveArray));


  }

  //method
  public static String getRandomValue(String[] workingArray) {
    //gets the length of the array
    int length = workingArray.length;
    //gets a random position of the array
    int randomPosition = (int)(Math.random() * length);
    //returns the value in the position for the specified array
    return workingArray[randomPosition];
  }
}
