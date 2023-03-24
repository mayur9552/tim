import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        TimsItems[] items = new TimsItems[10];

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int itemCount = 0;

        do {
            System.out.println("**** Select from below ****\n1.Consumable.\n2.Merchendize.\n3.Done Ordering.\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("**** Select from below ****\n1.Bagel.\n2.Coffee.\n3.Donuts.\n");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            TimsItems item = new Bagel();
                            System.out.println(item.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                        case 2:
                            TimsItems item2 = new Coffee();
                            System.out.println(item2.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item2;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                        case 3:
                            TimsItems item3 = new Donut();
                            System.out.println(item3.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item3;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("**** Select from below ****\n1.Mug.\n2.Coffee Powder.\n3.Gift Card.\n");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            TimsItems item = new Mugs();
                            System.out.println(item.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                        case 2:
                            TimsItems item2 = new CoffeePowder();
                            System.out.println(item2.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item2;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                        case 3:
                            TimsItems item3 = new HockeyCard();
                            System.out.println(item3.toString());
                            System.out.println("1. Order this.\n2. Choose again");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    itemCount++;
                                    items[itemCount] = item3;
                                    System.out.println("Added to Cart\n");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Invalid option! Try again.");
                                    break;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n**********Receipt**********");
                    double totalAmount = 0;
                    for(int i=1;i<=itemCount;i++){
                        System.out.println(i + ". Item: " + items[i].getName() + "    Price: " + items[i].getPrice());
                        totalAmount = totalAmount + items[i].getPrice();
                    }
                    System.out.println("\nTotal Amount: "+totalAmount);
                    System.out.println("\n**********Receipt**********\n");
                    break;
                default:
                    System.out.println("Invalid input! Try again.");
                    break;
            }

        } while (choice != 3);

    }

}