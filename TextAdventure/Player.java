import java.util.*;

public class Player
{
  String name;
  double health;
  double gold;
  int monstersDefeated;
  double damage;
  double defense;
  String playerClass;

  public Player(String playerName, double startingHealth, double startingGold, double playerDamage, double playerDefense, String currentPlayerClass)
  {
    name = playerName;
    health = startingHealth;
    gold = startingGold;
    monstersDefeated = 0;
    damage = playerDamage;
    defense = playerDefense;
    playerClass = currentPlayerClass;
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public double getHealth()
  {
    return health;
  }

  public void setHealth(double newHealth)
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
  public void setDamage(double newDamage)
  {
    damage = newDamage;
  }
 
  public String getpClass()
  {
    return playerClass;
  }
  public void setClass(String newClass)
  {
    playerClass = newClass;
  }
  public double getDefense()
  {
    return defense;
  }
  public void setDefense(double newDefense)
  {
    defense = newDefense;
  }
  
}