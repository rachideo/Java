import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;


/** Cette classe Game contient les principales méthodes du jeu */
public class Game extends RedKeepandDrogo {

    /** Déclaration des attribut */
    Character newCharacter;
    private char answerCreate;
    private char answerModify;
    private int whichModify;
    private int inputMenu;
    private String[] descCharacter = new String[3];
    private String[] descWarrior = {"guerrier", "Arme", "Bouclier"};
    private String[] descWizard = {"magicien", "Sort", "Philtre"};
    private Scanner sc = new Scanner(System.in);
    ArrayList<Character> listCharacter = new ArrayList<Character>();

    /** Constructeur par défaut */
    public Game() {}

    /** Méthode createChar qui demande quel type (Magicien ou Guerrier) de personnage l'utilisatuer veut créer */
    public void createChar() {
        do {
            System.out.println("\n Quel type de personnage voulez vous ? Une guerrier ? Ou un magicien ? G/M");
            answerCreate = sc.next().charAt(0);
            sc.nextLine();
            createPerso(answerCreate);
        }
        while (answerCreate!='G' && answerCreate!='M');
    }

    /** Méthode connection BDD affiche*/
    public void getHeroes2() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver O.K.");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exojavahero", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from hero");
            System.out.println("\n*****************************************************************************************************************************************************");
            for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                System.out.print("\t" + rs.getMetaData().getColumnName(i) + "\t\t|");
            }
            System.out.println("\n*****************************************************************************************************************************************************");
            while(rs.next()){
                System.out.print("\t" + rs.getInt("id") + "\t \t|");
                System.out.print("\t" + rs.getInt("type") + "\t \t \t|");
                System.out.print("\t" + rs.getString("name").substring(0,6) + "... \t|");
                System.out.print("\t" + rs.getString("picture").substring(0,6) + "... \t|");
                System.out.print("\t" + rs.getInt("lvl_health") + "\t\t\t\t|");
                System.out.print("\t" + rs.getInt("lvl_force") + "\t\t\t\t|");
                System.out.print("\t" + rs.getString("offensive_tool").substring(0,6) + "... \t\t\t|");
                System.out.print("\t" + rs.getString("defensive_tool").substring(0,6) + "... \t\t\t|");
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.println("\n");
            rs.close();
            con.close();
        } catch (Exception e) { System.out.println(e); }
    }
        

    /** Méthode createPerso qui va créer le personnage
     * @param whichCreate correspond à la réponse de l'utilisateur
     * */
    public void createPerso(char whichCreate) {
        if (whichCreate=='G') {
            newCharacter = new Warrior();
            newCharacter.getUserInputInfo();
            listCharacter.add(newCharacter);
            descCharacter = descWarrior.clone();
        } else if (whichCreate=='M'){
            newCharacter = new Wizard();
            newCharacter.getUserInputInfo();
            listCharacter.add(newCharacter);
            descCharacter = descWizard.clone();
        } else {
            System.out.println("\n Je n'ai pas compris :s");
        }

        System.out.println(newCharacter);
    }

    /** Méthode getHeroes qui va afficher la liste des objets personnage crées */
    public void getHeroes() {
        for (int i=0; i<listCharacter.size(); i++) {
            System.out.println("Personnage n°"+(i+1)+" : \n"+listCharacter.get(i));
            System.out.println("\n");
        }
    }

    /** Méthode getHero qui va afficher un objets personnage crée en particulier */
    public void getHero() {
        System.out.println("\n Quel est le numéro du personnage que vous voulez afficher ?");
        int numberHero = sc.nextInt();
        sc.nextLine();
        System.out.println("Personnage n°"+numberHero+" : \n"+listCharacter.get(numberHero - 1));
        System.out.println("\n");

    }

    /** Méthode modifyChar qui va permettre de modifier les caractéristiques des objets personnage crées */
    public void modifyChar() {
        do {
            System.out.println("\n Voulez vous changer des caractéristiques de votre personnage ? O/N");
            answerModify = sc.next().charAt(0);
            sc.nextLine();
            if (answerModify == 'O') {
                System.out.println("\n Que voulez vous changer ?"+
                    "1 : Nom;  "+"2 : Image;  "+"3 : Niveau de vie;  "+"4 : Force d'attaque;  "+"5 : Arme;  "+"6 : Bouclier;  ");
                whichModify = sc.nextInt();
                sc.nextLine();
                switch(whichModify) {
                    case 1:
                        String setNewName = saisie("\n Entrez le nouveau nom : ");
                        newCharacter.setName(setNewName);
                        break;
                    case 2:
                        String setNewPic = saisie("\n Entrez la nouvelle image : ");
                        newCharacter.setPic(setNewPic);
                        break;
                    case 3:
                        int setNewHealth = Integer.parseInt(saisie("\n Entrez le nouveau niveau de vie : "));
                        newCharacter.setHealth(setNewHealth);
                        break;
                    case 4:
                        int setNewAttack = Integer.parseInt(saisie("\n Entrez la nouvelle force d'attaque : "));
                        newCharacter.setAttack(setNewAttack);
                        break;
                    case 5:
                        String setNewOffensive = saisie("\n Entrez le/la nouveau/elle "+descCharacter[1].toLowerCase()+" :");
                        newCharacter.setOffensiveTools(setNewOffensive);
                        break;
                    case 6:
                        String setNewDefensive = saisie("\n Entrez le nouveau "+descCharacter[2].toLowerCase()+" :");
                        newCharacter.setDefensiveTools(setNewDefensive);
                        break;
                    default:
                        System.out.println("\n Je n'ai pas compris :s");
                }
                System.out.println(newCharacter);
            } else if (answerModify == 'N') {
                System.out.println("\n Tant pis pour vous :-(");
            } else {
                System.out.println("\n Je n'ai pas compris :s");
            }
        }
        while (answerModify != 'O');
    }

    /** Méthode saisie() qui permet la simplification des saisies utilisateur
     * @param lib correspond au libéllé de la question posée à l'utilisateur
     * @return retourne la réponse de l'utilisateur
     */
    private String saisie(String lib) {
        System.out.println(lib);
        String texte = sc.nextLine();
        return texte;
    }

    /** Méthode menu() qui consiste à être un menu de choix */
    public void menu() {
        System.out.println("\n"+
                "                                 ************   MENU   *************\n" +
                "                             +----------------------------------------+\n" +
                "                             |                                        |\n" +
                "                             |  1 * CRÉER UN NOUVEAU PERSONNAGE       |\n" +
                "                             |                                        |\n" +
                "                             |  2 * MODIFIER LE DERNIER PERSONNAGE    |\n" +
                "                             |                                        |\n" +
                "                             |  3 * AFFICHER LISTE DES PERSONNAGES    |\n" +
                "                             |                                        |\n" +
                "                             |  4 * AFFICHER INFO PERSONNAGE          |\n" +
                "                             |                                        |\n" +
                "                             |  5 * QUITTER                           |\n" +
                "                             |                                        |\n" +
                "                             +----------------------------------------+\n"+
                "\n");


        do {
            int inputMenu = sc.nextInt();
            sc.nextLine();
            if (inputMenu == 1) {
                createChar();
                menu();
            } else if (inputMenu == 2) {
                modifyChar();
                menu();
            } else if (inputMenu == 3) {
                getHeroes2();
                menu();
            } else if (inputMenu == 4) {
                getHero();
                menu();
            } else if (inputMenu == 5) {
                System.exit(0);
            } else {
                System.out.println("Mauvaise réponse ! Réssayez !");
            }
        } while (inputMenu!=1 && inputMenu!=2 && inputMenu!=3 && inputMenu!=4 && inputMenu!=5);
    }

}
