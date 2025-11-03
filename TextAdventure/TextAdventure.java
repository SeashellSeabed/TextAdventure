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
  boolean blunderbuss = false;
  boolean apostle = false;
  boolean goneToCave = false;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 900, 800);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Player", 100, 0, 2, 0, "none");
  }

  public void play() //I won't be adding like, nearly as many comments here compared to the battle.java class because this is just a lot of the same thing over and over again, calling other classes and whatnot. I don't need reminders because of how frequently I need to run by this and adding all those comments would take too much time I could spend working. - SeashellSeabed (K)
  {
    String input;
    
    console.setImage("ocean.jpg");

    System.out.println("Input your name to begin the game.");
    input = inScanner.nextLine();
    ourHero.changeName(input);
    
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
      System.out.println("You go limp. You wanted it this way, and you shal have it. Water floods through your mouth and nose, leaving an excruciating burning sensation in your lungs as you involuntarily gasp for air. \nIt's faster then you expected. Maybe your death if you continued... would've been far, far more brutal.\nYou have died.\n");
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
    System.out.println("You float around for what seems like ages, long enough to the point where the sun, which had been practically beating down upon you whilst at it's zenith, had began to set beyond the watery horizon. \n Thankfully, you are fortunate enough to see a boat, and wave it over. It appears to notice you, as you hear the distant sounds of men heaving sails and the colossal ship  turning towards you. \n You are pulled aboard the ship, and given food and dry clothes. That is the last of your fortunates, as you glance upwards and see a Jolly Rodger flying on the mast. Pirates. \n Before you know it, cutlasses are pointed at your throat while the men on board heckle you with insults and threats to your life. However, they are all silenced as a huge man with a peg-leg comes walking, holding two weapons. One blunderbuss, and one cutlass. \n``I will not ask how you got to the point you are now, that is not important to me.`` THe man puts both weapons down on the ground, glaring at you. ``You will pick one, and you will become one of us. Or die.``\n >[cutlass] to pick the cutlass\n >[blunderbuss] to pick the blunderbuss\n [refuse] to refuse both.\n");
    input = inScanner.nextLine();
    while(input != "cutlass" || input != "blunderbuss" || input != "refuse") {
    if(input.equalsIgnoreCase("cutlass"))
    {
      cutlass = true;
      //unfinished
      return;
    }else if(input.equalsIgnoreCase("blunderbuss")){
      ourHero.setClass("blunderbuss");
      //unfinished
      return;
    }else if(input.equalsIgnoreCase("refuse")){
      System.out.println("You refuse both weapons. The pirate captain narrows his eyes at you, before signaling to his crew. \n Before you can react, a blade is plunged into your stomach, and everything goes black as you collapse onto the deck of the ship. \nYou have died.\n");
      gameEnd();
      return;
    }else{
      
      System.out.println("Invalid choice. Please type [cutlass], [blunderbuss], or [refuse] : ");
      input = inScanner.nextLine();
    }
    
  }
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
    }else if(input.equalsIgnoreCase("cave") && goneToCave == false){
        goneToCave = true;
        enterZoneCave();
        return;
      }else if(input.equalsIgnoreCase("cave") && goneToCave == true){
        System.out.println("The cave has collapsed behind you. You cannot go to the cave.\nThe [town] is the only thing left for you.");
        input = inScanner.nextLine();
      }
      
      System.out.println("Invalid choice. Please type [town] or [cave] : ");
      input = inScanner.nextLine();
    }

    
  }


  private void enterZoneTown()
  {
    console.setImage("town.jpg");
    String input;
    System.out.println("The path towards the smoke was well-used. It had track-marks from what was presumably carts and carriages, and footprints practically all over. Sure enough, after enough walking, a town comes into view. \nAs you begin to walk into the town, you're stopped by a border guard. He doesn't say anything to you, instead he roughly pats you down on your sides. After concluding that you are of no threat, he steps aside and signals for the town gate to open.\nThe interior was pleasent, definitely a higher-class neighborhood for the time. What would you like to do?\n [shop] go to the shop\n [tavern] go to the tavern\n [beg] beg for money on the streets\n");
    
    input = inScanner.nextLine();
    while(input != "shop" || input != "tavern" || input != "beg") {
    if(input.equalsIgnoreCase("shop"))
    {
      enterShop();
      return;
  }else if(input.equalsIgnoreCase("tavern")){
    enterTavern();
    return;
  }else if(input.equalsIgnoreCase("beg")){
      enterBegging();
      return;
  }else{
    
    System.out.println("Invalid choice. Please type [shop], [tavern], or [beg] : ");
    input = inScanner.nextLine();
    }
  }
}

  private void enterZoneCave()
  {
    console.setImage("caveInside.jpg");

    

    System.out.println("You venture into the cave, the darkness enveloping you as you make your way deeper and deeper. You begin to wonder if it was worth traveling to a place like this, but before you decide to turn back, there's a light ahead.\nThe lights continued deeper into the caves, you can't tell how long you've been in the system. Eventually, you're lead into this massive room with rocks that illuminate the place, even dimmly.\nInside the room was a single statue, a statue that... felt right to get closer to. It was beckoning you, whatever man was embodied into the art looked so, so friendly... but the 50 gold on the pedistal looked real friendly, too!\n [approach] to approach the statue\n [rob] to take the gold on the statue\n [Leave] to go back to the crossroads.\n");
    String input = inScanner.nextLine();
    while(input != "approach" || input != "rob" || input != "leave") {
    if(input.equalsIgnoreCase("approach")){
      
      enterStatueOffer();
      return;
    }else if(input.equalsIgnoreCase("rob")){
      System.out.println("You quickly snatch the gold from the pedistal, ignoring the statue completely Fortunately, nothing happens as you go out the way you came. You emerge from the cave a little richer.\n");
      ourHero.setGold(ourHero.getGold() + 50);
      enterZoneCrossroads();
      return;
  
     }else if(input.equalsIgnoreCase("leave")){
      System.out.println("You decide that whatever was in that cave wasn't worth your time, and head back to the crossroads, and to the town you saw earlier.\n");
      enterZoneTown();
      return;
  }else{
    
    System.out.println("Invalid choice. Please type [approach], [rob], or [leave] : ");
    input = inScanner.nextLine();
    }
  }
}



  private void enterTavern(){
    console.setImage("tavern.jpg");
    String input;
    System.out.println("You enter the tavern, the smell of ale and roasted meat filling your nostrils. The tavern is bustling with patrons, some engaged in lively conversations while others are focused on their drinks. The barkeep eyes you as you walk in, waiting to see if you'll order something. He doesn't look particularly friendly.. but not too unfriendly, either. He's just there to do his job. You respect that.\n What would you like to do?\n [order] to order a drink or food\n [talk] to talk to the patrons\n [leave] to leave the tavern\n");
    input = inScanner.nextLine();
    while(input != "order" || input != "talk" || input != "leave") {
    if(input.equalsIgnoreCase("order")){
      System.out.println("You approach the bar and order a drink. The barkeep serves you a mug of ale. When you offer to pay for it, he turns you down.\n 'Just put it on your tab. I get the feeling you'll come back here.'\n Strange, but you continue to look around the tavern.\n");
      enterTavern();
      return;
  }else if(input.equalsIgnoreCase("talk")){
    enterZonePatron();
    
    return;
  }else if(input.equalsIgnoreCase("leave")){
      System.out.println("You decide to leave the tavern and head back to the town square.\n");
      enterZoneTown();
      return;
  }else{
    
    System.out.println("Invalid choice. Please type [order], [talk], or [leave] : ");
    input = inScanner.nextLine();
  }
}
  }

  private void enterShop(){

  }

  private void enterBegging(){

  }

  private void enterStatueOffer(){
    System.out.println("You approach the statue, feeling a strange warmth as you get closer. But that turns into a damp jolt of cold down your spine as a long laugh erupts around the room the moment you make content.\n ``Oh, how so long! How so long i've waited for someone, someone like you! Someone who nobody would see missing... You will be my apostle, apostle I say! You'll do as I bid and act as I please! Give yourself up now, traveller! \n[resist] to resist the statue's power\n[accept] dawn the statue's will as your own.\n");
    {
      String input;
      input = inScanner.nextLine();
      while(input != "resist" || input != "accept") {
      if(input.equalsIgnoreCase("resist")){
        System.out.println("Your resistance proves worthless in the face of whatever was inside of that statue. The moment you falter even a little, your mind goes black. You wake up outside of the cave, feeling a new purpose. A new strength. You are now an apostle of the statue.\n");
        ourHero.setClass("Apostle");
        ourHero.setHealth(ourHero.getHealth() + 20);
        ourHero.setDamage(ourHero.getDamage() + 5);
        ourHero.setDefense(ourHero.getDefense() + 2);
        System.out.println("Your stats have increased! Health +20, Damage +5, Defense +2, New class: Apostle.\n");
        enterZoneCrossroads();
        return;
      }else if(input.equalsIgnoreCase("accept")){
        System.out.println("You feel a sudden surge of energy as you accept the statue's will. Your vision blurs, and when it clears, you find yourself outside the cave, a new sense of purpose burning within you. You are now an apostle of the statue.\n");
        ourHero.setClass("Apostle");
        ourHero.setHealth(ourHero.getHealth() + 20);
        ourHero.setDamage(ourHero.getDamage() + 5);
        ourHero.setDefense(ourHero.getDefense() + 2);
        enterZoneCrossroads();
        return;
    
  }else{
    
    System.out.println("Invalid choice. Please type [resist] or [accept] : ");
    input = inScanner.nextLine();
    }
  }
}
  }

  private void enterZonePatron(){
    System.out.println("You strike up a conversation with a few patrons. None of them are particularly interesting beyond the occasional tale-teller who says he's seen riches beyond comprehension or beasts the size of entire mountains, but you don't buy it.\nHowever, strangely enough, a man approaches you. He is old, but also real strong looking. He eyes you up and down before nodding.\n 'You. You're " + ourHero.getName() + ", right? Heh, you probably don't even know me after what happened to you. Last I heard, the ship you were on bound to the land of Javion had an intruder with nothing but a large scythe in hand. I thought nobody survived, but look at you...`` \n [question] to inquire about your origins\n [fight] in a fit of rage against this old man for lying to you.\n");
  }
  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}