import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Choose a coffee type:");
            System.out.println("1. Chillapuccino ($2.99)");
            System.out.println("2. Matcha Latte ($3.59)");
            System.out.println("3. Frappuccino ($3.99)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for visiting. Goodbye!");
                break;
            }

            Coffee coffee = null;
            boolean isM = false;

            switch (choice) {
                case 1 -> coffee = new Chillapuccino();
                case 2 -> {
                    coffee = new MatchaLatte();
                    isM = true;
                }
                case 3 -> coffee = new Frappuccino();
                default -> {
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
                }
            }

            while (true) {
                System.out.println("Customize your coffee:");
                System.out.println("1. Ice (+$0.3)");
                System.out.println("2. Caramel Syrup (+$0.5)");
                System.out.println("3. Whipped Cream (+$0.4)");
                System.out.println("4. Steamed Milk (Matcha Latte only) (+$0.6)");
                System.out.println("5. Finish Customization");

                int condiment = scanner.nextInt();

                if (condiment == 5) {
                    break;
                }

                switch (condiment) {
                    case 1 -> coffee = new Ice(coffee);
                    case 2 -> coffee = new CaramelSyrup(coffee);
                    case 3 -> coffee = new WhippedCream(coffee);
                    case 4 -> {
                        if (isM) {
                            coffee = new SteamedMilk(coffee);
                        } else {
                            System.out.println("Steamed Milk is only available for Matcha Latte.");
                        }
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }

            System.out.println("Your customized coffee order:");
            System.out.println("Order: " + coffee.getDescription());
            System.out.println("Total Cost: $" + coffee.cost());

            System.out.println("Do you want to buy this coffee?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int buyChoice = scanner.nextInt();

            if (buyChoice == 1) {
                System.out.println("Thank you for your purchase!");
            } else {
                System.out.println("Order cancelled.");
            }

            System.out.println("Do you want to continue shopping?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int continueShoppingChoice = scanner.nextInt();
            continueShopping = (continueShoppingChoice == 1);
        }

        scanner.close();
    }
}
