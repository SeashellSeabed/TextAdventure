public class Battle {

    private Player player; // player, or ourHero in TextAdventure.java
    private Enemy enemy;  //enemy from the enemy class

    public Battle(Player player, Enemy enemy) {
        this.player = player; // the player from TextAdventure.java
        this.enemy = enemy; //the given enemy
    }

    private double calculateDamage(double attack, double defense) { //damage calculation, very simple
        double damage = attack - (defense * 0.5); //defense will make damage lower by a bit
        damage *= (0.9 + Math.random() * 0.2); // random variation (90–110%)
        return damage;
    }

    public boolean startFight() { //main battle loop
        double originalhealth = player.getHealth();
        boolean victory = false;
        System.out.println("Battle Start: " + player.getName() + " vs " + enemy.getName()); //announcing battle information
        System.out.println("-----------------------------------"); //little line to make things look good

        while (player.getHealth() > 0 && enemy.getHealth() > 0) { //while both are alive


            double playerDamage = calculateDamage(player.getDamage(), enemy.getDefense()); //have the player attack first, using the player damage and enemy defense as vectors
            double newEnemyHealth = enemy.getHealth() - playerDamage; //the new enemy health will be what results from the attack
            enemy.setHealth(newEnemyHealth); //set the enemy health to afformentioned new health

            System.out.println(player.getName() + " attacks " + enemy.getName() +" and deals " + playerDamage +" damage, leaving " + enemy.getName() + " with " + enemy.getHealth() + " health."); //information about what happened to the user

            if (enemy.getHealth() <= 0) { //if the enemy health drops to zero
                System.out.println(enemy.getName() + " has been defeated by " + player.getName() + "!"); //say the enemy has been defeated
                victory = true; //say that the player has emerged victorious 
                player.defeatMonster(); //increment the player's defeated monster count
                break; //exit the loop
            }

            
            double enemyDamage = calculateDamage(enemy.getDamage(), player.getDefense()); //damage vectors but this time the enemy attacks
            double newPlayerHealth = player.getHealth() - enemyDamage; //new player health after attack
            player.setHealth(newPlayerHealth); //set player health to new health

            System.out.println(enemy.getName() + " attacks " + player.getName() +" and deals " + enemyDamage + " damage, leaving " + player.getName() +" with " + player.getHealth() + " health."); //information about what happened to the user

            if (player.getHealth() <= 0) { //if the player health drops to zero
                System.out.println(player.getName() + " has been defeated!"); //tell the player that they have been defeated
                System.out.println("You now have" + player.getHealth() + " health left.");
                break; //exit the loop
            }

            System.out.println("-----------------------------------"); //seperation line for readability
        }

        System.out.println("Battle Over!"); //inform the end of a battle

        if(victory == true){
            player.setHealth(originalhealth); //set the player health back to the original health that the fight started out with.
        }
        return victory; //return victory so this can be used to dictate the win or loss of a fight for the player
    }
}