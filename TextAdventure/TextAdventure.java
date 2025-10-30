import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 900, 800);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("ocean.jpg");

    // Change ourHero's name
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this
    System.out.println("Falling. Drifting. It feels like the hands of death grip onto your shoulders, dragging you further and further down to the one and only truth of this world; death. \nThe deceptive comfort of the embrace of fate is interrupted with the overwhelming of water gushing into your nasal cavity. \n Your eyes jolt open despite the discomfort of the sensation caused by water running on your eyes, negligable as you rush up and pinch your nose shut. \n You're falling deeper and deeper into a body of water, the bottom so out of sight that the water around you gradients from blue to black. You can't see anything, not one lifeform or distinguishable structure, even with your impaired vision.\nYou haven't fallen far. You can still see light above you... or is it below you? To the side? You don't remember how you fell in, but more importantly, which direction you fell in from. \nYou're broken from your thoughts as water floods your slightly agape mouth, flowing down your throat as a cruel reminder of how much time you have left. \nThere is only two options for you. Do you gain the vigor to fight towards the light, or do you let death claim it's prize?\n >[fight] in order to swim\n >[give up] to float down to your demise.\n");
    input = inScanner.nextLine();
    // ADD CODE HERE
    while(input != "fight" || input != "give up") {
    if(input .equalsIgnoreCase("fight"))
    {
      enterZone1();
    }else if(input.equalsIgnoreCase("give up")){
      System.out.println("You go limp. You wanted it this way, and you shal have it. Water floods through your mouth and nose, leaving an excruciating burning sensation in your lungs as you involuntarily gasp for air. \nIt's faster then you expected. Maybe your death if you continued... would've been far, far more brutal.\nYou have died.\n");
      gameEnd();
      return;
    }else{
      
      System.out.println("Invalid choice. Please type 'fight' or 'give up' : ");
      input = inScanner.nextLine();
      }
      
    }
  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE
    System.out.println("A sudden, almost unexplainable strength festers within you. You reach out to grasp at the water, thrusting it backwards all while kicking your legs as hard as you physically can.\nAll in the sake of making it towards that light. You can feel your arms wailing in pain and your legs cramping up, but nothing your body tells you overpowers your will to live. \nYou break through the light, almost getting blinded by the hot rays of the sun. Your eyes take a moment to adjust, but you see that you're in a large body of water. Looking around, you see one landmass that you're confident you'll be able to swim to. \n >[swim] to swim to the island \n>[stay] to see if anything will pick you up.");

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}