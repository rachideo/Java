public class Spell {
    /** Attributs */
    private String nameSpell;

    /** Constructeur */
    Spell() {}

    /** Constructeur avec paramètre
     * @param pNameSpell correspond au nom du sort
     */
    Spell (String pNameSpell) {
        this.nameSpell = pNameSpell;
    }

    /** Méthodes Getter getSpellName
     * @return retoune le nom du sort
     */
    public String getSpellName()  {
        return nameSpell;
    }
}
