import java.util.Scanner;

public class Character {

    protected String name;
    protected String picture;
    protected int health;
    protected int attack;
    protected int characterType;


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
    public String getName() {
        return name;
    }
    public String getPic() {
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
    public String getOffensiveTools() {
        return "Je n'ai pas de moyen d'attaquer";
    }
    public String getDefensiveTools() {
        return "Je n'ai pas de moyen de défense";
    }
    // Setter
    public void setName(String modName) {
        name = modName;
    }
    public void setPic(String modPic) {
        picture = modPic;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setOffensiveTools(String a) {
    }

    public void setDefensiveTools(String b) {
    }
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }


    public void getUserInputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel prénom voulez vous donner à votre personnage ?");
        this.name = sc.nextLine();
        System.out.println("Quel est le nom de votre image ?");
        this.picture = sc.nextLine();
    }

}
