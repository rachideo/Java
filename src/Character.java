public class Character {

    private String name;
    private String picture;

    // Constructeur avec paramètres
    public Character (String inputName, String inputPicture) {
        System.out.println("Création d'un nouveau personnage.");
        name = inputName;
        System.out.println(name);
        picture = inputPicture;
        System.out.println(picture);
        System.out.println("\n");
    }

    // Un getter du nom du personnage
    public String getName()  {
        return name;
    }

    //Un getter de l'image du personnage
    public String getPic()  {
        return picture;
    }
}
