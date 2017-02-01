import java.util.Scanner;

class MadLib {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //First Question
    // we ask the user to type out a wanted word type
    System.out.print("Type a Noun: ");
    // next we create a scanner so we can capture their response and create a variable
    String noun1 = scanner.next();
    //Second Question
    System.out.print("Type a Place: ");
    String place1 = scanner.next();
    //Third Question
    System.out.print("Type a Place: ");
    String place2 = scanner.next();
    //Fourth Question
    System.out.print("Type a Noun: ");
    String noun2 = scanner.next();
    //Fifth Question
    System.out.print("Type a Verb: ");
    String verb1 = scanner.next();
    //Sixth Question
    System.out.print("Type a past tense Verb: ");
    String verb2 = scanner.next();
    //Seventh Question
    System.out.print("Type a Noun: ");
    String noun3 = scanner.next();
    //Eighth Question
    System.out.print("Type a past tense Verb: ");
    String verb3 = scanner.next();
    //Nineth Question
    System.out.print("Type a Noun: ");
    String noun4 = scanner.next();
    //Tenth Question
    System.out.print("Type a Noun: ");
    String noun5 = scanner.next();
    //Eleventh Question
    System.out.print("Type a Noun: ");
    String noun6 = scanner.next();
    //Twelth Question
    System.out.print("Type a past tense Verb: ");
    String verb4 = scanner.next();
    //Twelth Question
    System.out.print("Type a Name: ");
    String person = scanner.next();
    // here we print out the story with all of the variables placed in to it
    System.out.println("Our First Mad Lib Story");
    System.out.println("=======================");
    System.out.println("There was once a " + noun1 + " from " + place1 + " who was on their way to " + place2 + ".");
    System.out.println("When they got there, there was a " + noun2 + " that was " + verb1 + "ing ");
    System.out.println("When " + noun1 + " saw the " + noun2 + " they " + verb2 + " away. ");
    System.out.println("Doing this hurt " + noun1 + "\'s " + noun3 + " and they " + verb3 + ".");
    System.out.println("According to legend this meant that " + noun1 + " was the savior of " + noun4 + ".");
    System.out.println(person + " got super jelous of " + noun1 + " and shot him in the " + noun3 + ".");
    System.out.println("After this " + noun1 + " assumed the locus of all " + noun5 + ".");
    System.out.println("This gave them the ablility to undo the damage to his " + noun3 + ".");
    System.out.println("Aswell as the damage to the " + noun6 + " between " + noun1 + " and " + person + ".");
    System.out.println("Then they " + verb4 + ".");
  }
}
