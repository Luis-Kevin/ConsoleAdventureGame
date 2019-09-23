import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int enemyHealth = 35;
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
                    "|:.  | | |           |\n" +
                    "|:.  | |o|    Sims   |\n" +
                    "|:.  | `\"`           |\n" +
                    "|:.  |_ __  __ _  __ /\n" +
                    "`\"\"\"\"`\"\"|=`|\"\"\"\"\"\"\"`\n" +
                    "        |=_|\n" +
                    "        |= |\n" +
                    "From a distance, you can see a small mailbox there.\n\n");
            input.nextLine();
            System.out.println("You begin to approach the mailbox, but a shadow jumps out at you from behind a small bush!");
            /*
                First Encounter
             */
            System.out.println("You encounter a wild prairie dog, Poppy.\n");
            System.out.println(" (\\__/)\n" +
                    " /O O  .\n" +
                    "{O__,   \\\n" +
                    "  / .  . )\n" +
                    "  |-| '-'\\\n" +
                    " .(   _(   ) _\n" +
                    "'---.~_ _ _/ /\n");

            input.nextLine();

            do {
                System.out.printf("Poppy's Stats:\t\t\t Your Stats:\n" +
                        "Health: %d\t\t\t\t Health: %d\n" +
                        "Attack: 1-10\t\t\t Attack: 15-25\n" +
                        "\t\t\t\t\t\t Potions Remaining: %d\n\n", enemyHealth, heroHealth, heroPotions);
                System.out.println("What would you like to do?\n" +
                        "1. Attack\n" +
                        "2. Drink potion\n" +
                        "3. Run?\n\n");
                int answer = Integer.parseInt(input.nextLine());
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                switch (answer) {
                    case 1:
                        heroAttack = (int) (Math.random() * 10) + 15;
                        enemyHealth -= heroAttack;
                        System.out.printf("\nYou did %d damage!\n\n", heroAttack);
                        break;
                    case 2:
                        if (heroPotions > 0) {
                            heroHealth += 40;
                            heroPotions--;
                            System.out.println("You have gained 40 HP\n\n");
                        } else {
                            System.out.println("No potions remaining, you lost a turn in your idiocy.\n");
                        }
                        break;
                    case 3:
                        System.out.println("Are you really going to run away from a prairie dog? You coward.\n\n");
                        break;
                }
                if (enemyHealth > 0) {
                    enemyAttack = (int) (Math.random() * 10) + 1;
                    heroHealth -= enemyAttack;
                    System.out.printf("Poppy has attacked you that little bastard, she has done %d damage.\n\n", enemyAttack);
                }
            } while (enemyHealth > 0 && heroHealth > 0);

            if (enemyHealth <= 0) {
                System.out.println("Congratulations! You have defeated the 1ft rodent that was Poppy.\n");
            } else if (heroHealth <= 0) {
                System.out.println("Wow. You were defeated by a prairie dog, some hero you are.\n");
                gameOver();
            }

            System.out.println("After your vicious battle, you allow yourself some time to catch your breath,\nregain " +
                    "your strength, and tend to the bloody wounds on your body. You pull out\na Hello Kitty band-aid " +
                    "from your bag to cover the tiny warrior marks on your cheek.\nYou continue towards the mailbox " +
                    "when suddenly another prairie dog reveals itself!\n");
            System.out.println(" (\\__/)\n" +
                    " /O O  .\n" +
                    "{O__,   \\\n" +
                    "  / .  . )\n" +
                    "  |-| '-'\\\n" +
                    " .(   _(   ) _\n" +
                    "'---.~_ _ _/ /\n");
            input.nextLine();
            enemyHealth = 35;
            do {
                System.out.printf("Petunia's Stats:\t\t\t Your Stats:\n" +
                        "Health: %d\t\t\t\t\t Health: %d\n" +
                        "Attack: 1-10\t\t\t\t Attack: 15-25\n" +
                        "\t\t\t\t\t\t\t Potions Remaining: %d\n\n", enemyHealth, heroHealth, heroPotions);
                System.out.println("What would you like to do?\n" +
                        "1. Attack\n" +
                        "2. Drink potion\n" +
                        "3. Run?\n\n");
                int answer = Integer.parseInt(input.nextLine());
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                switch (answer) {
                    case 1:
                        heroAttack = (int) (Math.random() * 10) + 15;
                        enemyHealth -= heroAttack;
                        System.out.printf("\nYou did %d damage!\n\n", heroAttack);
                        break;
                    case 2:
                        if (heroPotions > 0) {
                            heroHealth += 40;
                            heroPotions--;
                            System.out.println("You have gained 40 HP\n\n");
                        } else {
                            System.out.println("No potions remaining, you lost a turn in your idiocy.\n");
                        }
                        break;
                    case 3:
                        System.out.println("Are you really going to run away from a prairie dog? You coward.\n\n");
                        break;
                }
                if (enemyHealth > 0) {
                    enemyAttack = (int) (Math.random() * 10) + 1;
                    heroHealth -= enemyAttack;
                    System.out.printf("Petunia has attacked you that little bastard, she has done %d damage.\n\n", enemyAttack);
                }
            } while (enemyHealth > 0 && heroHealth > 0);

            if (enemyHealth <= 0) {
                System.out.println("Congratulations! You have defeated the 1ft rodent that was Petunia.\n");
            } else if (heroHealth <= 0) {
                System.out.println("Wow. You were defeated by a prairie dog, some hero you are.\n");
                gameOver();
            }

            System.out.println("Gasping for breath, you reach into your bag. You see your life flash before your eyes\n" +
                    "... you're out of band-aids. Thinking there must be some more in the house you begin\nto run." +
                    " You reach the doorstep when the door flies open! Standing in the doorway\nis the " +
                    "visibly enraged Ken Doll.\n");
            System.out.println(" /////////////\\\\\\\\\n" +
                    "(((((((((((((( \\\\\\\\\n" +
                    ")))  \\       /  (((\n" +
                    "((( (*)     (*) )))\n" +
                    ")))     <       (((\n" +
                    "((( '\\______/`  )))\n" +
                    ")))\\___________/(((\n" +
                    "       _) (_\n" +
                    "      / \\_/ \\\n" +
                    "     /(     )\\\n" +
                    "    // )___( \\\\\n" +
                    "    \\\\(     )//\n" +
                    "     (       )\n" +
                    "      |  |  |\n" +
                    "       | | |\n" +
                    "       | | |\n" +
                    "      _|_|_|_");

            input.nextLine();
            enemyHealth = 100;

            do {
                System.out.printf("Ken Doll's Stats:\t\t\t Your Stats:\n" +
                        "Health: %d\t\t\t\t\t Health: %d\n" +
                        "Attack: 20-25\t\t\t\t Attack: 15-25\n" +
                        "\t\t\t\t\t\t\t Potions Remaining: %d\n\n", enemyHealth, heroHealth, heroPotions);
                System.out.println("What would you like to do?\n" +
                        "1. Attack\n" +
                        "2. Drink potion\n" +
                        "3. Run?\n" +
                        "4. Hide?");
                int answer = Integer.parseInt(input.nextLine());
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                switch (answer) {
                    case 1:
                        heroAttack = (int) (Math.random() * 10) + 15;
                        enemyHealth -= heroAttack;
                        System.out.printf("\nYou did %d damage!\n\n", heroAttack);
                        break;
                    case 2:
                        if (heroPotions > 0) {
                            heroHealth += 40;
                            heroPotions--;
                            System.out.println("You have gained 40 HP\n\n");
                        } else {
                            System.out.println("No potions remaining, you lost a turn in your idiocy.\n");
                        }
                        break;
                    case 3:
                        System.out.println("You should know by now that you can't run you coward.\n\n");
                        break;
                    case 4:
                        System.out.println("You can't hide, you're standing right in front of her.\n\n");
                        break;
                }
                if (enemyHealth > 0) {
                    enemyAttack = (int) (Math.random() * 5) + 20;
                    heroHealth -= enemyAttack;
                    System.out.printf("Ken Doll attacks! Her fists break a bone. She has done %d damage.\n\n", enemyAttack);
                }
            } while (enemyHealth > 0 && heroHealth > 0);

            if (enemyHealth <= 0) {
                System.out.println("YOU ARE VICTORIOUS! YOU HAVE DEFEATED KEN DOLL!\n");
                System.out.println("");
            } else if (heroHealth <= 0) {
                System.out.println("Ken Doll squishes you like the bug you are.\n");
                gameOver();
            }

            System.out.println("You begin to slowly limp your way into the house");
            input.nextLine();
            System.out.println("You enter the house and drop your knees in tears. The house is empty, there's no way\n" +
                    "there's band-aids in here.");
        } else {
            System.out.println("You wimp.");
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