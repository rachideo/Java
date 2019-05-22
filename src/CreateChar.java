import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CreateChar extends DongeonAndDragon {

    private static char yes = 'O';
    private static char no = 'N';
    private static char warrior = 'G';
    private static char wizard = 'M';
    private static char answerCreate;
    private static String typeChar;



    public static void createchar() throws InterruptedException {

        do {
            System.out.println("Voulez vous créer un personnage ? O/N");
            Scanner askCreate = new Scanner(System.in);
            answerCreate = askCreate.next().charAt(0);
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
            Scanner askCreate = new Scanner(System.in);
            answerCreate = askCreate.next().charAt(0);
            if (answerCreate==warrior) {
                //récupère le waName
                System.out.println("Quel prénom voulez vous donner à votre personnage ?");
                Scanner askCharName = new Scanner(System.in);
                String waName = askCharName.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel est le nom de votre image ?");
                Scanner askCharPic = new Scanner(System.in);
                String waPic = askCharPic.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel est le niveau de vie de votre personnage entre 5 et 10 inclus ?");
                Scanner askLvlHealth = new Scanner(System.in);
                int waHealth = askLvlHealth.nextInt();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel est le niveau de force d'attaque de votre personnage entre 5 et 10 inclus ?");
                Scanner askLvlAtt = new Scanner(System.in);
                int waAttack = askLvlAtt.nextInt();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel arme utilise votre personnage ?");
                Scanner askCharWeapon = new Scanner(System.in);
                String waWeapon = askCharWeapon.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel bouclier utilise votre personnage ?");
                Scanner askCharShield = new Scanner(System.in);
                String waShield = askCharShield.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                Warrior rachid = new Warrior (waName, waPic, waHealth, waAttack, waWeapon, waShield);
                System.out.println("\n");
                System.out.println("Résumé de votre personnage de type guerrier :");
                System.out.println("Nom : " +rachid.getName()+"\n"+
                                   "Image : " +rachid.getPic()+"\n"+
                                   "Niveau de vie : "+rachid.getWaH()+"\n"+
                                   "Force d'attaque : "+rachid.getWaA()+"\n"+
                                   "Arme : "+rachid.getWaW()+"\n"+
                                   "Bouclier : "+rachid.getWaS()+"\n");
            } else if (answerCreate==wizard){
                System.out.println("Quel prénom voulez vous donner à votre personnage ?");
                Scanner askCharName = new Scanner(System.in);
                String newName = askCharName.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                System.out.println("Quel est le nom de votre image ?");
                Scanner askCharPic = new Scanner(System.in);
                String newPic = askCharPic.nextLine();
                TimeUnit.MILLISECONDS.sleep(150);

                Character rachid = new Wizard (newName, newPic);
                System.out.println("\n");
                System.out.println("Votre personnage a été crée, il s'appelle :");
                System.out.println(rachid.getName());
            } else {
                System.out.println("Je n'ai pas compris :s\n");
            }
        }
        while (answerCreate!=warrior && answerCreate!=wizard);


    }
}
