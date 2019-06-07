public class Weapon extends Warrior {
    /** Attributs */
    private String nameWeapon;

    /** Constructeur */
    Weapon () {}

    /** Constructeur avec paramètres
     * @param pNameWeapon correspond au nom de l'arme
     */
    Weapon (String pNameWeapon) {
        this.nameWeapon = pNameWeapon;
    }

    /** Méthodes Getter
     * @return retourne le nom de l'arme
     */
    public String getWeaponName()  {
        return nameWeapon;
    }
}
