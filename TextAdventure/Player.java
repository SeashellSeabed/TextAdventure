import java.util.*;

public class Player
{
  String name;
  int health;
  double gold;
  int monstersDefeated;
  double damage;
  String playerClass;

  public Player(String playerName, int startingHealth, double startingGold, double damage, String playerClass)
  {
    name = playerName;
    health = startingHealth;
    gold = startingGold;
    monstersDefeated = 0;
    
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health = newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(double newAmount)
  {
    gold = newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    monstersDefeated = monstersDefeated + 1;
  }
  public double getDamage()
  {
    return damage;
  }
  public void enemy(double enemyHealth, double enemyDamage, String enemyClass)
  {
  
  }
  public String setClass(String playerClass)
  {
    return playerClass;
  }
}