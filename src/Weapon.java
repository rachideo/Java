public class Weapon extends Warrior {
    // Attributs
    private String nameWeapon;

    // Constructeurs
    Weapon () {}

    Weapon (String pNameWeapon) {
        this.nameWeapon = pNameWeapon;
    }

    // Méthodes
    public String getWeaponName()  {
        return nameWeapon;
    }
}
