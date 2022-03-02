package com.perscholas.java_basics;

public class Main {
    public static void main(String[] args) {
        problemOne();
        problemTwo();
        problemThree();
        problemFour();
        problemFive();
        problemSix();
        problemSeven();
        problemEight();
    }

    /*Write a program that declares 2 integer variables,
    assigns an integer to each, and adds them together.
    Assign the sum to a variable. Print out the result.
     */
    public static void problemOne() {
        int x = 5;
        int y = 6;
        int z = x + y;
        System.out.println(z);
    }

    /*Write a program that declares 2 double variables, assigns a number to each,
    and adds them together. Assign the sum to a variable. Print out the result.
     */
    public static void problemTwo() {
        double x = 8;
        double y = 9;
        double z = x + y;
        System.out.println(z);
    }

    /*Write a program that declares an integer variable and a double variable,
    assigns numbers to each, and adds them together.
    Assign the sum to a variable.
    Print out the result. What variable type must the sum be?
     */
    public static void problemThree() {
        int x = 5;
        double y = 9;
        double z = x + y;
        System.out.println(z);
    }

    /*Write a program that declares 2 integer variables, assigns an integer to each,
    and divides the larger number by the smaller number.
    Assign the result to a variable. Print out the result.
    Now change the larger number to a decimal. What happens?
    What corrections are needed?
     */
    public static void problemFour() {
        int x = 10;
        float y = 19.0F;    //needed to change this from int to float
        float z = y / x;
        System.out.println(z);
    }

    /*Write a program that declares 2 double variables,
    assigns a number to each, and divides the larger by the smaller.
    Assign the result to a variable. Print out the result.
    Now, cast the result to an integer.
    Print out the result again.
     */
    public static void problemFive() {
        double x = 10;
        double y = 25;
        double z = y / x;
        System.out.println(z);
        System.out.println((int)z);
    }
    /*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
    Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q.
    Print q again.
     */
    public static void problemSix() {
        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println(q);

        double qq = ((double)y)/x;
        System.out.println(qq);
    }
    /*Write a program that declares a named constant and uses it in a calculation.
    Print the result.
     */
    public static void problemSeven() {
        int FIVE = 5;
        System.out.println(FIVE * 5);
    }

    /*Write a program where you create 3 variables that represent products at a cafe.
    The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    Assign prices to each product.
    Create 2 more variables called subtotal and totalSale
    and complete an “order” for 3 items of the first product,
    4 items of the second product, and 2 items of the third product.
    Add them all together to calculate the subtotal.
    Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
    Be sure to format the results to 2 decimal places.
     */
    public static void problemEight() {
        double cappuccino = 5.50;
        double espresso = 6.50;
        double mocha = 4.50;
        double subTotal = (3*cappuccino)+(4*espresso)+(2*mocha);
        double SALES_TAX = 0.07;
        double totalSale = subTotal * SALES_TAX;
        System.out.printf("%.2f", totalSale);
    }

}
