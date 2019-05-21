public class Wizard {

    private int characterType = 2;
    private int health;
    private int attack;
    private String spellType;
    private String philtreType;

    // Constructeur avec paramètres
    public Wizard(int wiHealth, int wiAttack, String wiSpell, String wiPhiltre) {
        health = wiHealth;
        attack = wiAttack;
        spellType = wiSpell;
        philtreType = wiPhiltre;
    }
}
