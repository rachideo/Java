public class Warrior extends Character {

    private int characterType = 1;
    private int health;
    private int attack;
    private String weaponType;
    private String shieldType;

    // Constructeur par défaut
    public Warrior () {
        super();
        this.characterType = 1;
    }

    // Constructeur avec petits paramètres
    public Warrior(String waName, String waPic) {
        super(waName, waPic);

    }

    // Constructeur avec paramètres
    public Warrior(String waName, String waPic, int waHealth, int waAttack, String waWeapon, String waShield) {
        super(waName, waPic);
        this.health = waHealth;
        this.attack = waAttack;
        this.weaponType = waWeapon;
        this.shieldType = waShield;
    }

    // Un getter du nom du personnage
    public String getName()  {
        return name;
    }
    public void setName(String modName)
    {
        name = modName;
    }

    //Un getter de l'image du personnage
    public String getPic()  {
        return picture;
    }
}

