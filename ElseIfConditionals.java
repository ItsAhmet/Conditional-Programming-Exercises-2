import java.util.Scanner;
public class ElseIfConditionals
{
    public static void DiscountPrice()
    /*#
     * During a special sale at a store, a 10% discount is taken 
     * on purchases over $10.00. 
     * Write a program that asks for the total amount of purchases, 
     * then calculates the discounted price. 
     * If the amount is not eligible for the discount, 
     * the amount does not change. 
     * 
     * CHALLENGE: Instead of a constant discount of 10%, 
     * have the user enter in the discount percentage and 
     * calculate the discounted price using the discount entered. 
     */
    {
    	Scanner scan = new Scanner( System.in );
    	double purchase;
    	System.out.println("Enter amount of money spent for the purchase:");
    	purchase = scan.nextDouble();
    	
    	if (purchase > 10)
    		System.out.println("Discounted price:\t"+(purchase-purchase/10)+"$");
    }

    public static void PieEating ()
    /*#
     * At the State Fair Pie Eating Contest all contestants
     * in the heavyweight division must weigh within 30 pounds
     * of 250 pounds. 
     * 
     * Write a program that asks for a contestant's weight
     * and then says if the contestant is allowed in the contest. 
     */
    {
    	Scanner scan = new Scanner( System.in );
        double weight;
        System.out.print("Enter your weight:");
        weight = scan.nextDouble();

        if (weight < 220)
        	System.out.println("You cannot participate in the contest. Your weight measurements do not match.");
        else
        if (weight > 280) 
        	System.out.println("You cannot participate in the contest. Your weight measurements do not match.");
        else
        	System.out.println("You may participate in the contest. Your weight measurments match.");
        	    	
    	
    }

    public static void OrderChecker()
    /*#
     * Prices for the following parts: 
     * ¢5 cents per bolt 
     * ¢3 cents per nut 
     * ¢1 cent per washer
     * Use constants for the unit cost of each item.
     * 
     * Write a program that asks the user for the number
     * of nuts, bolts, and washers in their purchase and 
     * then calculates and prints out the total. 
     * 
     * The program checks the order for the following conditions. 
     * A correct order must have at least as many nuts
     * as bolts and at least twice as many washers as bolts,
     * otherwise the order has an error. 
     * For an error the program writes out 
     *      "Check the Order: too few nuts" or 
     *      "Check the Order: too few washers" as appropriate.
     * Both error messages are written if the order has both errors.
     * 
     * In all cases the price of the items is in cents. 
     * The total should be converted to dollars and cents.
     */
    {
    	Scanner input = new Scanner(System.in);
		double cost, bolts, nuts, washers, washers2;
		
		
		System.out.println("Order Checker\n\n");
		
		
		System.out.println("Enter the number of nuts you want to buy");
		nuts = input.nextDouble();
		
		System.out.println("Enter the number of bolts you want to buy");
		bolts = input.nextDouble();

		System.out.println("Enter the number of washers you want to buy");
		washers = input.nextDouble();

    washers2 = washers * 2;
		if (bolts < nuts)
			System.out.println("Order satisfactory.\n"+"Nuts cost:\t"+nuts*0.3+"¢\nBolts cost:\t"+nuts*0.5+"¢\nWasters cost:\t"+washers*0.1+"¢");
		else if (bolts <washers*2 && bolts>nuts)
			System.out.println("Check the Order: too few nuts and washers");
		else if (bolts > nuts)
			System.out.println("Check the Order: too few nuts");
		else if (bolts < washers*2)
			System.out.println("Check the Order: too few washers");

    
    	
    	
    }

    public static void main (String [] args)
    {
    	Scanner scan= new Scanner(System.in);
        
    	//DiscountPrice();
    	OrderChecker();
        //PieEating();
        //OrderChecker();
    }
}