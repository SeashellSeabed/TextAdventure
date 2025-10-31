import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  boolean armor = false;
  boolean sword = false;
  boolean dagger = false;
  boolean servant = false;
  boolean cutlass = false;
  boolean mageApprentice = false;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 900, 800);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Player", 100, 0, 0.0, "none");
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
      enterZoneSwim();
      return;
    }else if(input.equalsIgnoreCase("give up")){
      System.out.println("You go limp. You wanted it this way, and you shall have it. Water floods through your mouth and nose, leaving an excruciating burning sensation in your lungs as you involuntarily gasp for air. \nIt's faster then you expected. Maybe your death if you continued would've been far, far more brutal.\nYou have died.\n");
      gameEnd();
      return;
    }else{
      
      System.out.println("Invalid choice. Please type 'fight' or 'give up' : ");
      input = inScanner.nextLine();
      }
      
    }
  }

  private void enterZoneSwim()
  {
    String input;
    console.setImage("island.jpg");
    // ADD CODE HERE
    System.out.println("A sudden, almost unexplainable strength festers within you. You reach out to grasp at the water, thrusting it backwards all while kicking your legs as hard as you physically can.\nAll in the sake of making it towards that light. You can feel your arms wailing in pain and your legs cramping up, but nothing your body tells you overpowers your will to live. \nYou break through the light, almost getting blinded by the hot rays of the sun. Your eyes take a moment to adjust, but you see that you're in a large body of water. Looking around, you see one landmass that you're confident you'll be able to swim to. \n >[swim] to swim to the island \n>[stay] to see if anything will pick you up.\n");
    input = inScanner.nextLine();
    while(input != "swim" || input != "stay") {
    if(input.equalsIgnoreCase("swim"))
    {
      enterZoneIsland();
      return;
  }else if(input.equalsIgnoreCase("stay")){
    enterZoneStay();
    return;
  }else{
    
    System.out.println("Invalid choice. Please type 'swim' or 'stay' : ");
    input = inScanner.nextLine();}
}
  }

  private void enterZoneIsland()
  {
    // change image
    console.setImage("wolf.jpg");

    String input;
    System.out.println("You begin your great swim towards the island. Compared to drawing out all of your might to survive the depths of the ocean, it was leasurely. \nYou reach the shore without any issue, glancing around the island. There is nothing of interest, not even a stick to help your exhausted body move along. And yet, you do. \n Beyond the beach was forest. Nothing but forest. You don't know how long you walk before finally coming across something just beyond a bush in front of you. A wolf. It doesn't see you.\n >[sneak] to try and sneak past the wolf\n >[attack] to try and attack the wolf. : \n");
    input = inScanner.nextLine();
    while(input != "sneak" || input != "attack") {
    if(input.equalsIgnoreCase("sneak")){
      enterZoneCrossroads();
      return;
    }else if(input.equalsIgnoreCase("attack")){
      System.out.println("You let out a bloodthirsty scream, jumping towards the wolf. However, you are severely weakened to even consider fighting, let alone fighting a wild wolf. \n You're turned into a play-toy for the wolf as it mauls you to death, ripping through your flesh with it's sharp teeth and claws. You lose all feeling in your body, and the last thing you can hear is your flesh being torn into and eaten by this wolf. \nYou have died.\n");
      gameEnd();
      return;
  }else{
    
    System.out.println("Invalid choice. Please type [sneak] or [attack]\n");
    input = inScanner.nextLine();
  }
}
}

  private void enterZoneStay()
  {
    console.setImage("pirate.jpg");

    String input;

    System.out.println("You've been floating for what felt like days, but the sun above you made it obvious that night hadn't even set yet.\nWhen you first emerged from the water, the sun was at it's zenith beating it's rays down upon you, but now, it has since grown closer and closer to the horizon, turning the sky a beautiful orange-white color\n. As you gaze upon the setting sun, a shillouette catches your eye. One of a ship, sails unfurled, growing larger second by second. After a couple minutes, the behemoth is upon you.\n...\nYou were taken below deck into the stomach of the monster and given clothes by some strange-looking men. Dirty, sure, but not torn up and soaked like whatever you had on before. As you emerge from the below-deck area, something makes your stomach drop; a jolly rodger flying above the ship. These men were pirates.\nDue to sheer councidence or them noticing the look of horror on your face, you're suddenly surrounded. Guns, Swords and hooks pointed in your direction. They were about to kill you, but one massive peg-legged man who stood about twice your height had everyone stand down with a simple command. \n'Cease.' His voice was deep and had it's own aura that made even the sweat on your brow stop in it's tracks. 'We give him a choice.' \nHe took out two items. One blunderbuss flintlock, and one cutlass.\n 'I am captain Brandley, captain of this ship. I hold two options for you. You either take one of these weapons and join us, or... you see what comes next.'\n[Cutlass] to take the Cutlass.\n[Blunderbuss] to take the Blunderbuss\n[Resist] to pick neither.");
  input = inScanner.nextLine();    
  }

  private void enterZoneCrossroads()
  {
    // change image
    console.setImage("cave.jpg");

    String input;
    System.out.println("You carefully sneak past the wolf, ensuring that it doesn't even think about looking at you. Before you even pass by it, you hear a howl. The wolf sprints towards that direction, letting you breathe much needed sigh of relief, continuing onwards. \nYou discover a path in the dense forest which suggests that this landmass isn't uninhabited. You don't even know how big it is.\nFollowing the path, you come across a crossroad. One way leads to somewhere that had smoke just above it, presumably a town. The other, much more decrepit path, leads to a cave.\n >[town] to go to the town\n >[cave] to go to the cave\n");
    input = inScanner.nextLine();
    while(input != "town" || input != "cave") {
    if(input.equalsIgnoreCase("town"))
    {
      enterZoneTown();
      return;
    }else if(input.equalsIgnoreCase("cave")){
      enterZoneCave();
      return;
    }else{
      
      System.out.println("Invalid choice. Please type [town] or [cave] : ");
      input = inScanner.nextLine();
    }

    
  }
}

  private void enterZoneTown()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZoneCave()
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