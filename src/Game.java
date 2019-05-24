import java.util.Scanner;
import java.util.concurrent.TimeUnit;

    public class Game extends RedKeepandDrogo {

        private char yes = 'O';
        private char no = 'N';
        private char warrior = 'G';
        private char wizard = 'M';
        private char answerCreate;
        private char whichCreate;
        private char answerModify;
        private int whichModify;
        private int newCharType;

        private Scanner sc = new Scanner(System.in);

        public Game() {
        }

        public void createChar() throws InterruptedException {

            do {
                System.out.println("Voulez vous créer un personnage ? O/N");
                answerCreate = sc.next().charAt(0);
                sc.nextLine();
                if (answerCreate == yes) {
                    System.out.println("Très bien, veuillez répondre aux prochaines questions.\n");
                } else if (answerCreate == no) {
                    System.out.println("Tant pis pour vous :-(");
                } else {
                    System.out.println("Je n'ai pas compris :s");
                }
            }
            while (answerCreate != yes);

            do {
                System.out.println("Quel type de personnage voulez vous ? Une guerrier ? Ou un magicien ? G/M");
                answerCreate = sc.next().charAt(0);
                sc.nextLine();
                createPerso(answerCreate);
            }
            while (answerCreate!=warrior && answerCreate!=wizard);

        }



        public void modifyChar() throws InterruptedException {
        System.out.println(newCharType);

            do {
                System.out.println("Voulez vous changer des caractéristiques de votre personnage ? O/N");
                answerModify = sc.next().charAt(0);
                sc.nextLine();
                if (answerModify == yes) {

                    if (newCharType == 1) {
                        System.out.println("Que voulez vous changer ?\n" +
                                "1 : Nom;  " +
                                "2 : Image;  " +
                                "3 : Niveau de vie;  " +
                                "4 : Force d'attaque;  " +
                                "5 : Arme;  " +
                                "6 : Bouclier;  ");

                        whichModify = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.println("Que voulez vous changer ?\n" +
                                "1 : Nom" +
                                "2 : Image" +
                                "3 : Niveau de vie" +
                                "4 : Force d'attaque" +
                                "5 : Sort" +
                                "6 : Philtre");
                        whichModify = sc.nextInt();
                        sc.nextLine();

                    }

                } else if (answerModify == no) {
                    System.out.println("Tant pis pour vous :-(");
                } else {
                    System.out.println("Je n'ai pas compris :s");
                }
            }
            while (answerModify != yes);


        }

    public void createPerso(char whichCreate) throws InterruptedException
    {
        String charName = saisie("Quel prénom voulez vous donner à votre personnage ?");
        String charPic = saisie("Quel est le nom de votre image ?");

        if (whichCreate==warrior) {
            int waHealth = Integer.parseInt(saisie("Quel est le niveau de vie de votre personnage entre 5 et 10 inclus ?"));
            int waAttack = Integer.parseInt(saisie("Quel est le niveau de force d'attaque de votre personnage entre 5 et 10 inclus ?"));
            String waWeapon = saisie("Quel arme utilise votre personnage ?");
            String waShield = saisie("Quel bouclier utilise votre personnage ?");

            Warrior newcharacter = new Warrior (charName, charPic, waHealth, waAttack, waWeapon, waShield);

            System.out.println("\n Résumé de votre personnage de type guerrier :");
            System.out.println( "Nom : " +newcharacter.getName()+"\n"+
                    "Image : " +newcharacter.getPic()+"\n"+
                    "Niveau de vie : "+newcharacter.getHealth()+"\n"+
                    "Force d'attaque : "+newcharacter.getAttack()+"\n"+
                    "Arme : "+newcharacter.getWaW()+"\n"+
                    "Bouclier : "+newcharacter.getWaS()+"\n");
            newCharType = newcharacter.getCharacterType();

        } else if (whichCreate==wizard){
            int wiHealth = Integer.parseInt(saisie("Quel est le niveau de vie de votre personnage entre 3 et 16 inclus ?"));
            int wiAttack = Integer.parseInt(saisie("Quel est le niveau de force d'attaque de votre personnage entre 8 et 15 inclus ?"));
            String wiSpell = saisie("Quel sort utilise votre personnage ?");
            String wiPhiltre = saisie("Quel philtre utilise votre personnage ?");

            Wizard newcharacter = new Wizard (charName, charPic, wiHealth, wiAttack, wiSpell, wiPhiltre);

            System.out.println("\n Résumé de votre personnage de type magicien :");
            System.out.println( "Nom : " +newcharacter.getName()+"\n"+
                    "Image : " +newcharacter.getPic()+"\n"+
                    "Niveau de vie : "+newcharacter.getHealth()+"\n"+
                    "Force d'attaque : "+newcharacter.getAttack()+"\n"+
                    "Sort : "+newcharacter.getWiS()+"\n"+
                    "Philtre : "+newcharacter.getWiP()+"\n");
            newCharType = newcharacter.getCharacterType();

        } else {
            System.out.println("Je n'ai pas compris :s\n");
        }
    }


    private String saisie(String lib) throws InterruptedException
    {
        System.out.println(lib);
        String texte = sc.nextLine();
        return texte;
    }

}
