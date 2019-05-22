public class Character {

    protected String name;
    protected String picture;

    // Constructeur par défaut
    public Character () {}

    // Constructeur avec paramètres
    public Character (String inputName, String inputPicture) {
        name = inputName;
        picture = inputPicture;
    }

    // Getter personnage
    public String getName()  {
        return name;
    }
    public String getPic()  {
        return picture;
    }
    // Un setter du nom du personnage
    public void setName(String modName)
    {
        name = modName;
    }

}
