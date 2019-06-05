import java.util.Scanner;

public class Wizard extends Character{

    private String spellType;
    private String philtreType;

    // Constructeur par défaut
    public Wizard () {
        super();
        super.setCharacterType(2);
    }

    // Constructeur avec petits paramètres
    public Wizard(String name, String picture, int health, int attack) {
        super(name, picture, health, attack);
        super.setCharacterType(2);
    }

    // Constructeur avec paramètres
    public Wizard(String name, String picture, int health, int attack, String spell, String philtre) {
        super(name, picture, health, attack);
        this.spellType = String.valueOf(new Spell(spell));
        this.philtreType = philtre;
        super.setCharacterType(2);
    }

    // Getter personnage
    public String getOffensiveTools()  {
        return spellType;
    }

    public String getDefensiveTools()  {
        return philtreType;
    }

    // Setter personnage
    public void setOffensiveTools(String modSpellType) {
        this.spellType = modSpellType;
    }
    public void setDefensiveTools(String modPhiltreType) {
        this.philtreType = modPhiltreType;
    }

    // Méthodes
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

    public String toString() {
        return  "\n Résumé de votre personnage magicien : \n"+
                "  Nom : " +this.name+"\n"+
                "  Image : " +this.picture+"\n"+
                "  Niveau de vie : "+this.health+"\n"+
                "  Force d'attaque : "+this.attack+"\n"+
                "  Arme : "+this.spellType+"\n"+
                "  Bouclier : "+this.philtreType+"\n";
    }
}

