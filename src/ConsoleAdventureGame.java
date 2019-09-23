import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int enemyAttack;
        int enemyHealth = 100;
        int heroHealth = 100;
        int heroAttack;
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
        System.out.print("Hero, are you ready to start?");
        if (input.nextLine().equals("yes")) {
            System.out.println("What is your name?");
            name = input.nextLine();
            System.out.printf("Okay %s, let's begin your adventure.\n\n", name);
            System.out.println("You encounter a wild Ken Doll and her vicious pack of prairie dogs.\n");

            do {
                System.out.printf("Ken Doll's Stats:\n" +
                        "Health: %d\n" +
                        "Attack: 1-25\n\n", enemyHealth);
                System.out.printf("Your stats are displayed below:\n" +
                        "Health: %d\n" +
                        "Attack: 1-25\n" +
                        "Potions Remaining: %d\n\n", heroHealth, heroPotions);
                System.out.println("What would you like to do?\n" +
                        "1. Attack\n" +
                        "2. Drink potion\n" +
                        "3. Run?\n" +
                        "4. Hide?");
                int answer = Integer.parseInt(input.nextLine());

                switch (answer) {
                    case 1:
                        double heroGen = (Math.random() * (25 - 1)) + 1;
                        heroAttack = (int) heroGen;
                        enemyHealth -= heroAttack;
                        System.out.printf("You did %d damage!\n\n", heroAttack);
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
                        System.out.println("You can't run coward, shouldn't have ran into Ken Doll in the first place.\n\n");
                        break;
                    case 4:
                        System.out.println("You can't hide, you're in a field! Why would you think that's even an option?\n\n");
                        break;
                }
                if (enemyHealth > 0) {
                    double enemyGen = (Math.random() * (25 - 1)) + 1;
                    enemyAttack = (int) enemyGen;
                    heroHealth -= enemyAttack;
                    System.out.printf("Poppy has attacked you that little bastard, he has done %d damage.\n\n", enemyAttack);
                }
            } while (enemyHealth > 0 && heroHealth > 0);
            if (enemyHealth <= 0) {
                System.out.println("YOU ARE VICTORIOUS, YOU HAVE DEFEATED KEN DOLL & HER PACK OF PRAIRIE DOGS.");
            } else if (heroHealth <= 0) {
                System.out.println("wow. You were defeated by a pack of prairie dogs, some hero you are.");
            }
        } else {
            System.out.println("You wimp");
        }
    }
}
