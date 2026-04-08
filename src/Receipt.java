public class Receipt {
    public static void main(String[] args)  {

        System.out.println();

        //1. Create variables for an item name (String) and item price (double)
        //2. Create a quantity variable (int)
        //3. Build and print: EX. "You bought 3 apples for $7.10"

        String fruit = "mangos";
        double pricePerFruit = 1.79;
        int numberOfFruit = 47;

        System.out.println("You bought " + numberOfFruit + " " + fruit + " for $" + pricePerFruit * numberOfFruit);



    }
}




