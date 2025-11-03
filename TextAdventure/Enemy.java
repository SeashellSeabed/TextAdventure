public class Enemy {

String name;
double health;
double damage;
double defense;
String Class;
    public Enemy(String enemyName, double enemyHealth, double enemyDamage, double enemyDefense, String enemyClass){

        name = enemyName;
        health = enemyHealth;
        damage = enemyDamage;
        defense = enemyDefense;
        Class = enemyClass;
    }

    public String getName() {
        return name;
    }
    public double getHealth() {
        return health;
    }
    public void setHealth(double newHealth) {
        health = newHealth;
    }
    public double getDamage() {
        return damage;
    }
    public void setDamage(double newDamage) {
        damage = newDamage;
    }
    public double getDefense() {
        return defense;
    } public void setDefense(double newDefense) {
        defense = newDefense;
    }
    public String getEnemyClass() {
        return Class;
    }
    
}
