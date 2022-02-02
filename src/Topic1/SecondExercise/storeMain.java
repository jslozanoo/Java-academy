package Topic1.SecondExercise;

import java.util.Scanner;

public class storeMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Instantiate three subscribers
        SubscriberOne subscriber = new SubscriberOne();
        SubscriberOne subscriber2 = new SubscriberOne();
        SubscriberOne subscriber3 = new SubscriberOne();

        // The price of the three products
        final float initialPriceProduct1 = 800;
        final float initialPriceProduct2 = 700;
        final float initialPriceProduct3 = 500;

        // Instantiate the three products, I name them Iphone 11, 12 and 13
        Product1 product1 = new Product1(initialPriceProduct1, "Iphone 13");
        Product2 product2 = new Product2(initialPriceProduct2, "Iphone 12");
        Product3 product3 = new Product3(initialPriceProduct3, "Iphone 11");

        System.out.println("The products are: ");
        System.out.println("1. " + product1.getName() + " and its price is " + product1.getPrice());
        System.out.println("2. " + product2.getName() + " and its price is " + product2.getPrice());
        System.out.println("3. " + product3.getName() + " and its price is " + product3.getPrice());

        product1.subscribe(subscriber);
        product1.subscribe(subscriber2);
        product1.subscribe(subscriber3);

        product2.subscribe(subscriber);
        product2.subscribe(subscriber2);

        product3.subscribe(subscriber2);
        product3.subscribe(subscriber3);

        product1.unsubscribe(subscriber);

        System.out.println("Would you like to update a price of a product?. 1. Yes. 2. No");
        int update = in.nextInt();

        float newPrice = 0; // The new price of a product that the client choose
        int product = 0;  // The product of the client choose for update its price
        if(update == 1){
            System.out.println("Choose the product to update its price ");
            System.out.println("1." + product1.getName());
            System.out.println("2." + product2.getName());
            System.out.println("3." + product3.getName());
            product = in.nextInt();
            System.out.println("Type the price: ");
            newPrice = in.nextFloat();
        }
        else {
            System.out.println("See you soon!");
        }
        switch (product) {
            case 1 -> {
                if (newPrice == initialPriceProduct1){
                    System.out.println("The price isn't changed");
                    break;
                }
                product1.setPrice(newPrice);
                product1.notifySubscriber(new Message(product1.getName() + " price changed. "
                        + "New price is " + product1.getPrice()));
            }
            case 2 -> {
                if (newPrice == initialPriceProduct2){
                    System.out.println("The price isn't changed");
                    break;
                }
                product2.setPrice(newPrice);
                product2.notifySubscriber(new Message(product2.getName() + " price changed. "
                        + "New price is " + product2.getPrice()));
            }
            case 3 -> {
                if (newPrice == initialPriceProduct3){
                    System.out.println("The price isn't changed");
                    break;
                }
                product3.setPrice(newPrice);
                product3.notifySubscriber(new Message(product3.getName() + " price changed. "
                        + "New price is " + product3.getPrice()));
            }
        }

    }
}
