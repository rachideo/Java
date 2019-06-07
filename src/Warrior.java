import java.util.Scanner;

/** Cette classe Warrior définit les personnages Character de type Warrior */
public class Warrior extends Character {

    /** Déclaration des attributs */
    private String weaponType;
    private String shieldType;

    /** Constructeur par défaut */
    public Warrior () {
        super();
        super.setCharacterType(1);
    }

    /** Constructeur avec petits paramètres
     * @param name correspond au nom du personnage
     * @param picture correspond au nom de l'image du personngae
     * @param health correspond au niveau de santé du personnage
     * @param attack correspond au niveau d'atteque du personnage
     */
    public Warrior(String name, String picture, int health, int attack) {
        super(name, picture, health, attack);
        super.setCharacterType(1);
    }

    /** Constructeur avec paramètres
     * @param weapon correspond à l'arme du personnage
     * @param shield correspond au bouclier du personnage
     */
    public Warrior(String name, String picture, int health, int attack, String weapon, String shield) {
        super(name, picture, health, attack);
        this.weaponType = String.valueOf(new Weapon(weapon));
        this.shieldType = shield;
        super.setCharacterType(1);
    }

    /** Méthodes Getter getOffensiveTools
     * @return l'attribut weaponType correspondant à l'arme du personnage
     */
    public String getOffensiveTools()  {
        return weaponType;
    }

    /** Méthodes Getter getOffensiveTools
     * @return l'attribut shieldType correspondant au bouclier du personnage
     */
    public String getDefensiveTools()  {
        return shieldType;
    }

    /** Méthodes Setter personnage
     * @param modWeaponType correspond à l'attribut à modifier
     */
    public void setOffensiveTools(String modWeaponType){
        this.weaponType = modWeaponType;
    }
    /** Méthodes Setter personnage
     * @param modShieldType correspond à l'attribut à modifier
     */
    public void setDefensiveTools(String modShieldType){
        this.shieldType = modShieldType;
    }

    /** Méthodes getUserInputInfo() qui lance un questionnaire spécifique aux objets Warrior */
    public void getUserInputInfo(){
        Scanner sc = new Scanner(System.in);
        super.getUserInputInfo();
        System.out.println("\n - Quel est le niveau de vie de votre personnage entre 5 et 10 inclus ?");
        this.health = sc.nextInt();
        System.out.println("\n - Quel est le niveau de force d'attaque de votre personnage entre 5 et 10 inclus ?");
        this.attack = sc.nextInt();
        sc.nextLine();
        System.out.println("\n - Quel arme utilise votre personnage ?");
        this.weaponType = sc.nextLine();
        System.out.println("\n - Quel bouclier utilise votre personnage ?");
        this.shieldType = sc.nextLine();
    }

    /** Méthode toString qui permet d'afficher la description d'un objet de type Warrior
     * @return retourne un texte avec les attributs de l'objet
     */
    public String toString() {
        return  "\n Résumé de votre personnage guerrier : \n"+
                "  Nom : " +this.name+"\n"+
                "  Image : " +this.picture+"\n"+
                "  Niveau de vie : "+this.health+"\n"+
                "  Force d'attaque : "+this.attack+"\n"+
                "  Arme : "+this.weaponType+"\n"+
                "  Bouclier : "+this.shieldType+"\n";
    }

}

