import java.util.Scanner;


public class DongeonAndDragon {

    public static void main(String[] args) {

        System.out.println("  ___   ___  _  _  ___ ___ ___  _  _     _   _  _ ___    ___  ___    _   ___  ___  _  _ ___ \n"+
                " |   \\ / _ \\| \\| |/ __| __/ _ \\| \\| |   /_\\ | \\| |   \\  |   \\| _ \\  /_\\ / __|/ _ \\| \\| / __|\n"+
                " | |) | (_) | .` | (_ | _| (_) | .` |  / _ \\| .` | |) | | |) |   / / _ \\ (_ | (_) | .` \\__ \\\n"+
                " |___/ \\___/|_|\\_|\\___|___\\___/|_|\\_| /_/ \\_\\_|\\_|___/  |___/|_|_\\/_/ \\_\\___|\\___/|_|\\_|___/\n"+
                "                                                                                            \n"+
                "____________________________________________________________________________________________\n"+
                "\n");

        char yes = 'O';
        char no = 'N';
        char answerCreate;

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

        Character rachid = new Character ("Rachid", "rachid.png");
        System.out.println(rachid.getName());
    }
}

