public class Wizard extends Character{

    private int characterType = 2;
    private int health;
    private int attack;
    private String spellType;
    private String philtreType;

    // Constructeur par défaut
    public Wizard () {
        this.characterType = 2;
    }

    // Constructeur avec petits paramètres
    public Wizard(String wiName, String wiPic) {
        super(wiName, wiPic);
    }

    // Constructeur avec paramètres
    public Wizard(String wiName, String wiPic, int wiHealth, int wiAttack, String wiSpell, String wiPhiltre) {
        super(wiName, wiPic);
        this.health = wiHealth;
        this.attack = wiAttack;
        this.spellType = wiSpell;
        this.philtreType = wiPhiltre;
    }

    // Un getter du nom du personnage
    public String getName()  {
        return name;
    }
    //Un getter de l'image du personnage
    public String getPic()  {
        return picture;
    }
    // Un setter du nom du personnage
    public void setName(String modName)
    {
        name = modName;
    }
    // Un setter de l'image du personnage
    public void setPic(String modPic)
    {
        picture = modPic;
    }

}

