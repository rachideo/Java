public class Wizard extends Character{


    private String spellType;
    private String philtreType;

    // Constructeur par défaut
    public Wizard () {
        super.setCharacterType(2);
    }

    // Constructeur avec petits paramètres
    public Wizard(String wiName, String wiPic, int wiHealth, int wiAttack) {
        super.setCharacterType(2);
    }

    // Constructeur avec paramètres
    public Wizard(String wiName, String wiPic, int wiHealth, int wiAttack, String wiSpell, String wiPhiltre) {
        super(wiName, wiPic, wiHealth, wiAttack);
        this.spellType = wiSpell;
        this.philtreType = wiPhiltre;
        super.setCharacterType(2);
    }

    // Getter personnage

    public String getName()  {
        return name;
    }
    public String getPic()  {
        return picture;
    }

    public String getWiS()  {
        return spellType;
    }
    public String getWiP()  {
        return philtreType;
    }

    // Setter personnage
    public void setName(String modName)
    {
        name = modName;
    }
    public void setPic(String modPic)
    {
        picture = modPic;
    }

    public void setSpell(String modSpellType)
    {
        spellType = modSpellType;
    }
    public void setPhiltre(String modPhiltreType)
    {
        philtreType = modPhiltreType;
    }

}

