import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int enemyHealth = 30;
        int heroHealth = 100;
        int heroAttack;
        int enemyAttack;
        int heroPotions = 3;

        System.out.println("\n" +
                "                                                                                                                       \n" +
                "     #####    ##                                                   # ###                                               \n" +
                "  ######  /  #### /                                              /  /###                                               \n" +
                " /#   /  /   ####/                                              /  /  ###                                        #     \n" +
                "/    /  /    # #                                               /  ##   ###                                      ##     \n" +
                "    /  /     #                                                /  ###    ###                                     ##     \n" +
                "   ## ##     #      /##  ###  /###     /###       /###       ##   ##     ## ##   ####      /##       /###     ######## \n" +
                "   ## ##     #     / ###  ###/ #### / / ###  /   / #### /    ##   ##     ##  ##    ###  / / ###     / #### / ########  \n" +
                "   ## ########    /   ###  ##   ###/ /   ###/   ##  ###/     ##   ##     ##  ##     ###/ /   ###   ##  ###/     ##     \n" +
                "   ## ##     #   ##    ### ##       ##    ##   ####          ##   ##     ##  ##      ## ##    ### ####          ##     \n" +
                "   ## ##     ##  ########  ##       ##    ##     ###         ##   ##     ##  ##      ## ########    ###         ##     \n" +
                "   #  ##     ##  #######   ##       ##    ##       ###        ##  ## ### ##  ##      ## #######       ###       ##     \n" +
                "      /       ## ##        ##       ##    ##         ###       ## #   ####   ##      ## ##              ###     ##     \n" +
                "  /##/        ## ####    / ##       ##    ##    /###  ##        ###     /##  ##      /# ####    /  /###  ##     ##     \n" +
                " /  #####      ## ######/  ###       ######    / #### /          ######/ ##   ######/ ## ######/  / #### /      ##     \n" +
                "/     ##           #####    ###       ####        ###/             ###   ##    #####   ## #####      ###/        ##    \n" +
                "#                                                                        ##                                            \n" +
                " ##                                                                      /                                             \n" +
                "                                                                        /                                              \n" +
                "                                                                       /                                               \n");
        System.out.println("Hero, are you ready to start?");

        if (input.nextLine().equals("yes")) {
            System.out.println("What is your name?");
            name = input.nextLine();

            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nOkay %s, let's begin your adventure.\n\n", name);
            System.out.println("You are standing in an open field west of a white house, with a boarded front door.\n" +
                    "       ..--\"\"|\n" +
                    "       |     |\n" +
                    "       | .---'\n" +
                    " (\\-.--| |---------.\n" +
                    "/ \\) \\ | |          \\\n" +
                    "|:.  | | |   Sims    |\n" +
                    "|:.  | |o|           |\n" +
                    "|:.  | `\"`           |\n" +
                    "|:.  |_ __  __ _  __ /\n" +
                    "`\"\"\"\"`\"\"|=`|\"\"\"\"\"\"\"`\n" +
                    "        |=_|\n" +
                    "        |= |\n" +
                    "There is a small mailbox here.\n\n");
            input.nextLine();
            System.out.println("You approach the mailbox, but a shadow jumps out at you from behind a small bush!");
            /*
                First Encounter
             */
            System.out.println("You encounter a wild prairie dog, Poppy.\n");
            System.out.println(" (\\__/)  .~    ~. ))\n" +
                    " /O O  ./      .'\n" +
                    "{O__,   \\    {\n" +
                    "  / .  . )    \\\n" +
                    "  |-| '-' \\    }\n" +
                    " .(   _(   )_.'\n" +
                    "'---.~_ _ _&\n");

            input.nextLine();

            do {
                System.out.printf("Poppy's Stats:\t\t\t Your Stats:\n" +
                        "Health: %d\t\t\t\t Health: %d\n" +
                        "Attack: 1-10\t\t\t Attack: 15-25\n" +
                        "\t\t\t\t\t\t Potions Remaining: %d\n\n", enemyHealth, heroHealth, heroPotions);
                System.out.println("What would you like to do?\n" +
                        "1. Attack\n" +
                        "2. Drink potion\n" +
                        "3. Run?\n" +
                        "4. Hide?");
                int answer = Integer.parseInt(input.nextLine());
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                switch (answer) {
                    case 1:
                        heroAttack = (int) (Math.random() * 10) + 15;
                        enemyHealth -= heroAttack;
                        System.out.printf("\nYou did %d damage!\n\n", heroAttack);
                        break;
                    case 2:
                        if (heroPotions > 0) {
                            heroHealth += 20;
                            heroPotions--;
                            System.out.println("You have gained 20 HP\n\n");
                        } else {
                            System.out.println("No potions remaining, you lost a turn in your idiocy.\n");
                        }
                        break;
                    case 3:
                        System.out.println("Are you really going to run away from a prairie dog? You coward.\n\n");
                        break;
                    case 4:
                        System.out.println("You can't hide, you're in a field! Why would you think that's even an option?\n\n");
                        break;
                }
                if (enemyHealth > 0) {
                    enemyAttack = (int) (Math.random() * 10) + 1;
                    heroHealth -= enemyAttack;
                    System.out.printf("Poppy has attacked you that little bastard, he has done %d damage.\n\n", enemyAttack);
                }
            } while (enemyHealth > 0 && heroHealth > 0);

            if (enemyHealth <= 0) {
                System.out.println("");
            } else if (heroHealth <= 0) {
                System.out.println("Wow. You were defeated by a prairie dog, some hero you are.");
                gameOver();
            }

            System.out.println("After your vicious battle with the Poppy, you allow yourself some time to catch your breath, before continuing towards the mailbox.");


        } else {
            System.out.println("You wimp");
        }
    }

    public static void gameOver() {
        System.out.println("                                                                                                       \n" +
                "      # ###                                                 # ###                                      \n" +
                "    /  /###  /                                            /  /###                                      \n" +
                "   /  /  ###/                                            /  /  ###                                     \n" +
                "  /  ##   ##                                            /  ##   ###  ##                                \n" +
                " /  ###                                                /  ###    ### ##                                \n" +
                "##   ##            /###   ### /### /###     /##       ##   ##     ##  ##    ###      /##  ###  /###    \n" +
                "##   ##   ###     / ###  / ##/ ###/ /##  / / ###      ##   ##     ##   ##    ###    / ###  ###/ #### / \n" +
                "##   ##  /###  / /   ###/   ##  ###/ ###/ /   ###     ##   ##     ##   ##     ###  /   ###  ##   ###/  \n" +
                "##   ## /  ###/ ##    ##    ##   ##   ## ##    ###    ##   ##     ##   ##      ## ##    ### ##         \n" +
                "##   ##/    ##  ##    ##    ##   ##   ## ########     ##   ##     ##   ##      ## ########  ##         \n" +
                " ##  ##     #   ##    ##    ##   ##   ## #######       ##  ##     ##   ##      ## #######   ##         \n" +
                "  ## #      /   ##    ##    ##   ##   ## ##             ## #      /    ##      ## ##        ##         \n" +
                "   ###     /    ##    /#    ##   ##   ## ####    /       ###     /     ##      /  ####    / ##         \n" +
                "    ######/      ####/ ##   ###  ###  ### ######/         ######/       ######/    ######/  ###        \n" +
                "      ###         ###   ##   ###  ###  ### #####            ###          #####      #####    ###       \n" +
                "                                                                                                       \n" +
                "                                                                                                       \n" +
                "                                                                                                       \n" +
                "                                                                                                       ");

    }
}