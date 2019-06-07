import java.util.Scanner;

/** Cette classe Wizard définit les personnages Character de type Wizard */
public class Wizard extends Character{

    /** Déclaration des attributs */
    private String spellType;
    private String philtreType;

    /** Constructeur par défaut */
    public Wizard () {
        super();
        super.setCharacterType(2);
    }

    /** Constructeur avec petits paramètres
     * @param name correspond au nom du personnage
     * @param picture correspond au nom de l'image du personngae
     * @param health correspond au niveau de santé du personnage
     * @param attack correspond au niveau d'atteque du personnage
     */
    public Wizard(String name, String picture, int health, int attack) {
        super(name, picture, health, attack);
        super.setCharacterType(2);
    }

    /** Constructeur avec paramètres
     * @param spell correspond au sort du personnage
     * @param philtre correspond au philtre du personnage
     */
    public Wizard(String name, String picture, int health, int attack, String spell, String philtre) {
        super(name, picture, health, attack);
        this.spellType = String.valueOf(new Spell(spell));
        this.philtreType = philtre;
        super.setCharacterType(2);
    }

    /** Méthodes Getter getOffensiveTools
     * @return retourne l'attribut spellType correspondant au sort du personnage
     */
    public String getOffensiveTools()  {
        return spellType;
    }

    /** Méthodes Getter getDefensiveTools
     * @return retourne l'attribut philtreType correspondant au philtre du personnage
     */
    public String getDefensiveTools()  {
        return philtreType;
    }

    /** Méthodes Setter setOffensiveTools
     * @param modSpellType correspond au sort à modifier
     */
    public void setOffensiveTools(String modSpellType) {
        this.spellType = modSpellType;
    }

    /** Méthodes Setter setDefensiveTools
     * @param modPhiltreType correspond au philtre à modifier
     */
    public void setDefensiveTools(String modPhiltreType) {
        this.philtreType = modPhiltreType;
    }

    /** Méthodes getUserInputInfo() qui lance un questionnaire spécifique aux objets Wizard */
    public void getUserInputInfo(){
        Scanner sc = new Scanner(System.in);
        super.getUserInputInfo();
        System.out.println("\n - Quel est le niveau de vie de votre personnage entre 3 et 6 inclus ?");
        this.health = sc.nextInt();
        System.out.println("\n - Quel est le niveau de force d'attaque de votre personnage entre 8 et 15 inclus ?");
        this.attack = sc.nextInt();
        sc.nextLine();
        System.out.println("\n - Quel sort utilise votre personnage ?");
        this.spellType = sc.nextLine();
        System.out.println("\n - Quel philtre utilise votre personnage ?");
        this.philtreType = sc.nextLine();
    }

    /** Méthode toString qui permet d'afficher la description d'un objet de type Wizard
     * @return retourne un texte avec les attributs de l'objet
     */
    public String toString() {
        return  "\n Résumé de votre personnage magicien : \n"+
                "  Nom : " +this.name+"\n"+
                "  Image : " +this.picture+"\n"+
                "  Niveau de vie : "+this.health+"\n"+
                "  Force d'attaque : "+this.attack+"\n"+
                "  Sort : "+this.spellType+"\n"+
                "  Philtre : "+this.philtreType+"\n";
    }
}

