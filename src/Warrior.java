public class Warrior extends Character {

    private String weaponType;
    private String shieldType;

    // Constructeur par défaut
    public Warrior () {
        super();
        super.setCharacterType(1);
    }

    // Constructeur avec petits paramètres
    public Warrior(String waName, String waPic, int waHealth, int waAttack) {
        super(waName, waPic, waHealth, waAttack);
        super.setCharacterType(1);


    }

    // Constructeur avec paramètres
    public Warrior(String waName, String waPic, int waHealth, int waAttack, String waWeapon, String waShield) {
        super(waName, waPic, waHealth, waAttack);
        this.weaponType = waWeapon;
        this.shieldType = waShield;
        super.setCharacterType(1);
    }

    // Getter personnage

    public String getName()  {
        return name;
    }
    public String getPic()  {
        return picture;
    }


    public String getWaW()  {
        return weaponType;
    }
    public String getWaS()  {
        return shieldType;
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

    public void setWeapon(String modWeaponType)
    {
        weaponType = modWeaponType;
    }
    public void setShield(String modShieldType)
    {
        shieldType = modShieldType;
    }
}

