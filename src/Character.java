import java.util.Scanner;

/** Cette classe Character définit le type de personnage que l'on utilise dans le jeu */
public class Character {

    /** Déclaration des attributs */
    protected String name;
    protected String picture;
    protected int health;
    protected int attack;
    protected int characterType;


    /** Constructeur par défaut */
    public Character () {}

    /** Constructeur avec paramètres
     * @param inputName correspond au nom du personnage
     * @param inputPicture correspond au nom de l'image du personngae
     * @param inputHealth correspond au niveau de santé du personnage
     * @param inputAttack correspond au niveau d'atteque du personnage
     */
    public Character (String inputName, String inputPicture, int inputHealth, int inputAttack) {
        name = inputName;
        picture = inputPicture;
        health = inputHealth;
        attack = inputAttack;
    }

    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public String getName() {
        return name;
    }
    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public String getPic() {
        return picture;
    }
    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public int getAttack() {
        return attack;
    }    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public int getHealth() {
        return health;
    }
    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public int getCharacterType() {
        return characterType;
    }
    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public String getOffensiveTools() {
        return "Je n'ai pas de moyen d'attaquer";
    }
    /** Méthodes Getter
     * @return retourne l'attribut demandé
     */
    public String getDefensiveTools() {
        return "Je n'ai pas de moyen de défense";
    }

    /** Méthodes Setter
     * @param modName correspond à l'attibut à modifier
     */
    public void setName(String modName) {
        name = modName;
    }
    /** Méthodes Setter
     * @param modPic correspond à l'attibut à modifier
     */
    public void setPic(String modPic) {
        picture = modPic;
    }
    /** Méthodes Setter
     * @param health correspond à l'attibut à modifier
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /** Méthodes Setter
     * @param attack correspond à l'attibut à modifier
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
    /** Méthodes Setter, reste vide car il sera modifier dans une classe fille
     * @param a correspond à l'attibut à modifier
     */
    public void setOffensiveTools(String a) {}
    /** Méthodes Setter, reste vide car il sera modifier dans une classe fille
     * @param b correspond à l'attibut à modifier
     */
    public void setDefensiveTools(String b) {
    }
    /** Méthodes Setter
     * @param characterType correspond à l'attibut à modifier
     */
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }

    /** Méthode getUserInputInfo() qui permet de lancer un questionnaire */
    public void getUserInputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n - Quel prénom voulez vous donner à votre personnage ?");
        this.name = sc.nextLine();
        System.out.println("\n - Quel est le nom de votre image ?");
        this.picture = sc.nextLine();
    }

    /** Méthode toString()
     * @return reste vide car il sera modifier dans une classe fille
     */
    public String toString()
    {
        return "";
    }

}
