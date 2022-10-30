package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        int numberOfApplesBooratino = 10;
        System.out.println( "Количество яблок у Буратины (переменная numberOfApplesBooratino) :" + numberOfApplesBooratino);

        int numberOfApplesKarabasBarabasSteal = 5;
        System.out.println( "Количество яблок которые отобрал у него Карабас Барабас (переменная numberOfApplesKarabasBarabasSteal) :" + numberOfApplesKarabasBarabasSteal );

        int numberOfApplesBooratinoStillHave = numberOfApplesBooratino - numberOfApplesKarabasBarabasSteal;
        System.out.println( "Количество яблок оставшихся у Буратины (переменная numberOfApplesBooratinoStillHave) "+ numberOfApplesBooratinoStillHave );

    }
}
