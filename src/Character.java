public class Character {

    protected String name;
    protected String picture;
    protected int characterType;
    protected int health;
    protected int attack;


    // Constructeur par défaut
    public Character () {}

    // Constructeur avec paramètres
    public Character (String inputName, String inputPicture, int inputHealth, int inputAttack) {
        name = inputName;
        picture = inputPicture;
        health = inputHealth;
        attack = inputAttack;
    }

    // Getter
    public String getName()  {
        return name;
    }
    public String getPic()  {
        return picture;
    }
    public int getAttack() {
        return attack;
    }
    public int getHealth() {
        return health;
    }
    public int getCharacterType() {
        return characterType;
    }

    // Setter
    public void setName(String modName)
    {
        name = modName;
    }
    public void setPic(String modPic)
    {
        picture = modPic;
    }
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }

}
