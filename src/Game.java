import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Game extends RedKeepandDrogo {

        Character test;
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

        public Game() {
        }

        public void createChar() {
            do {
                System.out.println("\n Quel type de personnage voulez vous ? Une guerrier ? Ou un magicien ? G/M");
                answerCreate = sc.next().charAt(0);
                sc.nextLine();
                createPerso(answerCreate);
            }
            while (answerCreate!='G' && answerCreate!='M');
        }

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

        public void printList() {
            for (int i=0; i<listCharacter.size(); i++) {
                System.out.println(listCharacter.get(i));
                System.out.println("\n");
            }
        }

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


        private String saisie(String lib) {
            System.out.println(lib);
            String texte = sc.nextLine();
            return texte;
        }

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
                    "                             |  4 * QUITTER                           |\n" +
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
                    printList();
                    menu();
                } else if (inputMenu == 4) {
                    System.exit(0);
                } else {
                    System.out.println("Mauvaise réponse ! Réssayez !");
                }
            } while (inputMenu!=1 && inputMenu!=2 && inputMenu!=3);
        }

}
