public class Warrior {

    private int characterType = 1;
    private int health;
    private int attack;
    private String weaponType;
    private String shieldType;

    // Constructeur avec paramètres
    public Warrior(int waHealth, int waAttack, String waWeapon, String waShield) {
        health = waHealth;
        attack = waAttack;
        weaponType = waWeapon;
        shieldType = waShield;
    }
}
