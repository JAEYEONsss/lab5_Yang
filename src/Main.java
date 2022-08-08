import java.util.Scanner;

public class Main {
    public static void init(String dealer, String supporter) {
        System.out.println("1. " + dealer);
        System.out.println("2. " + supporter);
        System.out.println("0. Quit the game");
    }

    public static void champInit() {
        System.out.println("1. Moving 2. AutoAttack 3. Skill");
    }

    public static void main(String args[]) {
        int cont, distance;
        String site;

        Dealer dealer = new Dealer("Jinx", "Dealer", "Magic", 20, 800, 600, 0, 0, 5, 40, 35, 40, 40);
        Supporter supporter = new Supporter("Soraka", "Supporter", "Recovery", 20, 600, 500, 0, 0, 3, 15, 40, 45, 30);
        Scanner input = new Scanner(System.in);

        System.out.println("Game Start!");
        System.out.println("-----------------------");
        System.out.println();

        while (true) {
            init(dealer.getName(), supporter.getName());

            cont = input.nextInt();

            if (cont == 1) {//dealer
                champInit();
                cont = input.nextInt();
                if (cont == 1) {
                    while (true) {
                        System.out.println("Enter the direction and distance of moving");
                        site = input.nextLine();
                        distance = input.nextInt();

                        cont = dealer.calcMoving(site, distance);

                        if (cont == 0) {
                            continue;
                        } else {
                            System.out.println(dealer.getName() + "moved " + distance + "to the " + site);
                            break;
                        }
                    }
                } else if (cont == 2) {
                    dealer.attacking();
                } else if (cont == 3) {
                    dealer.skilling();
                }
            } else if (cont == 2) {//supporter
                champInit();
                cont = input.nextInt();
                if (cont == 1) {
                    while (true) {
                        System.out.println("Enter the direction and distance of moving");
                        site = input.nextLine();
                        distance = input.nextInt();

                        cont = supporter.calcMoving(site, distance);

                        if (cont == 0) {
                            continue;
                        } else {
                            System.out.println(supporter.getName() + "moved " + distance + "to the " + site);
                            break;
                        }
                    }
                } else if (cont == 2) {
                    supporter.attacking();
                } else if (cont == 3) {
                    supporter.skilling();
                }
            } else if (cont == 0) {//done
                System.out.println("Have a Good Day~");
                break;
            }else{
                System.out.println("You enter the wrong number");
            }
        }
    }
}
