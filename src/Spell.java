public class Spell {
    // Attributs
    private String nameSpell;

    // Constructeur
    Spell() {}

    Spell (String pNameSpell) {
        this.nameSpell = pNameSpell;
    }

    // Méthodes
    public String getSpellName()  {
        return nameSpell;
    }
}
