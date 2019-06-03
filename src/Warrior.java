import java.util.Scanner;

public class Warrior extends Character {

    private String weaponType;
    private String shieldType;

    // Constructeur par défaut
    public Warrior () {
        super();
        super.setCharacterType(1);
    }

    // Constructeur avec petits paramètres
    public Warrior(String name, String picture, int health, int attack) {
        super(name, picture, health, attack);
        super.setCharacterType(1);
    }

    // Constructeur avec paramètres
    public Warrior(String name, String picture, int health, int attack, String weapon, String shield) {
        super(name, picture, health, attack);
        this.weaponType = String.valueOf(new Weapon(weapon));
        this.shieldType = shield;
        super.setCharacterType(1);
    }

    // Getter personnage
    public String getOffensiveTools()  {
        return weaponType;
    }

    public String getDefensiveTools()  {
        return shieldType;
    }

    // Setter personnage
    public void setOffensiveTools(String modWeaponType){
        this.weaponType = modWeaponType;
    }
    public void setDefensiveTools(String modShieldType){
        this.shieldType = modShieldType;
    }

    // Méthodes
    public void getUserInputInfo(){
        Scanner sc = new Scanner(System.in);
        super.getUserInputInfo();
        System.out.println("Quel est le niveau de vie de votre personnage entre 5 et 10 inclus ?");
        this.health = sc.nextInt();
        System.out.println("Quel est le niveau de force d'attaque de votre personnage entre 5 et 10 inclus ?");
        this.attack = sc.nextInt();
        sc.nextLine();
        System.out.println("Quel arme utilise votre personnage ?");
        this.weaponType = sc.nextLine();
        System.out.println("Quel bouclier utilise votre personnage ?");
        this.shieldType = sc.nextLine();
    }
}

