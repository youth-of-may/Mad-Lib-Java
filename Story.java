import java.util.*;
import static java.lang.System.out;
public class Story {
    private static ArrayList<String> stories;
    String name, faveFood, sodaDrink, chemicalElement;
    
    public Story() {
        stories = new ArrayList<>();
        name = "";
        faveFood = ""; 
        sodaDrink = "";
        chemicalElement = "" ;
    }
    public static void addStoryLine(String story) {
        /**
         * New story lines can be added using this method.
         */
        stories.add(story);
    }
    public void askForInput() {
        String answer = "Y";
        Scanner keyboard = new Scanner(System.in);
        String message = "";
        String[] prompts = {"What is your name?", "Name one of your favorite foods:", "A word you would use to describe a soda drink:", "Name of a chemical element:", "Would you like to play again? Type Y to make another story. Type any other character to exit."};
        String[] outs = {"Welcome back! More words please!", "Goodbye! Thanks for playing!"};
        boolean running = true;
        out.println("Welcome to Mad Lib Java!");
        out.println(prompts[0]);
        name = keyboard.nextLine();
        while (running) {
            
            out.println("Before we can complete the story, you'll need to give us some words.\n");
            out.println(prompts[1]);
            faveFood = keyboard.nextLine();
            out.println();
            out.println(prompts[2]);
            sodaDrink = keyboard.nextLine();
            out.println();
            out.println(prompts[3]);
            chemicalElement = keyboard.nextLine();
            out.println();
            
            
            out.println("Those are all the words we need to finish your story. Press enter to continue.");
            out.println();
            out.println("The Smelly Princess \nBy Bob\n");
            constructStory(name, faveFood, sodaDrink, chemicalElement);
            out.println("\n\nThe end.\n");
            out.println(prompts[4]);
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("Y"))
            running = true;
            else 
            running = false;
        }
    }
    private void constructStory(String n, String f, String s, String c) {
        /**
         * Constructing a random story from the available story lines.
         */
        String pickedStory = stories.get((int)(stories.size() * Math.random()));
        out.printf(pickedStory, f,s,c);

        
    }
}