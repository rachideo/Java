import java.util.Scanner;

public class Game extends RedKeepandDrogo {

        Character newCharacter;
        private char answerCreate;
        private char answerModify;
        private int whichModify;
        private String[] descCharacter = new String[3];
        private String[] descWarrior = {"guerrier", "Arme", "Bouclier"};
        private String[] descWizard = {"magicien", "Sort", "Philtre"};

        private Scanner sc = new Scanner(System.in);

        public Game() {
        }

        public void createChar() {
            do {
                System.out.println("Voulez vous créer un personnage ? O/N");
                answerCreate = sc.next().charAt(0);
                sc.nextLine();
                if (answerCreate == 'O') {
                    System.out.println("Très bien, veuillez répondre aux prochaines questions.\n");
                } else if (answerCreate == 'N') {
                    System.out.println("Tant pis pour vous :-(");
                } else {
                    System.out.println("Je n'ai pas compris :s");
                }
            }
            while (answerCreate != 'O');

            do {
                System.out.println("Quel type de personnage voulez vous ? Une guerrier ? Ou un magicien ? G/M");
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
                descCharacter = descWarrior.clone();
            } else if (whichCreate=='M'){
                newCharacter = new Wizard();
                newCharacter.getUserInputInfo();
                descCharacter = descWizard.clone();
            } else {
                System.out.println("Je n'ai pas compris :s\n");
            }

            printChar();
        }


        public void modifyChar() {
            do {
                System.out.println("Voulez vous changer des caractéristiques de votre personnage ? O/N");
                answerModify = sc.next().charAt(0);
                sc.nextLine();
                if (answerModify == 'O') {
                    System.out.println("Que voulez vous changer ?\n"+
                        "1 : Nom;  "+"2 : Image;  "+"3 : Niveau de vie;  "+"4 : Force d'attaque;  "+"5 : Arme;  "+"6 : Bouclier;  ");
                    whichModify = sc.nextInt();
                    sc.nextLine();
                    switch(whichModify) {
                        case 1:
                            String setNewName = saisie("Entrez le nouveau nom : ");
                            newCharacter.setName(setNewName);
                            break;
                        case 2:
                            String setNewPic = saisie("Entrez la nouvelle image : ");
                            newCharacter.setPic(setNewPic);
                            break;
                        case 3:
                            int setNewHealth = Integer.parseInt(saisie("Entrez le nouveau niveau de vie : "));
                            newCharacter.setHealth(setNewHealth);
                            break;
                        case 4:
                            int setNewAttack = Integer.parseInt(saisie("Entrez la nouvelle force d'attaque : "));
                            newCharacter.setAttack(setNewAttack);
                            break;
                        case 5:
                            String setNewOffensive = saisie("Entrez le/la nouveau/elle "+descCharacter[1].toLowerCase()+" :");
                            newCharacter.setOffensiveTools(setNewOffensive);
                            break;
                        case 6:
                            String setNewDefensive = saisie("Entrez le nouveau "+descCharacter[2].toLowerCase()+" :");
                            newCharacter.setDefensiveTools(setNewDefensive);
                            break;
                        default:
                            System.out.println("Je n'ai pas compris :s");
                    }
                    printChar();
                } else if (answerModify == 'N') {
                    System.out.println("Tant pis pour vous :-(");
                } else {
                    System.out.println("Je n'ai pas compris :s");
                }
            }
            while (answerModify != 'O');
        }


        private String saisie(String lib) {
            System.out.println(lib);
            String texte = sc.nextLine();
            return texte;
        }

        private void printChar() {
            System.out.println("Résumé de votre personnage de type "+descCharacter[0]+" :");
            System.out.println( "  Nom : " + newCharacter.getName()+"\n"+
                    "  Image : " + newCharacter.getPic()+"\n"+
                    "  Niveau de vie : "+ newCharacter.getHealth()+"\n"+
                    "  Force d'attaque : "+ newCharacter.getAttack()+"\n"+
                    "  "+descCharacter[1]+" : "+ newCharacter.getOffensiveTools()+"\n"+
                    "  "+descCharacter[2]+" : "+ newCharacter.getDefensiveTools()+"\n");
        }

}
