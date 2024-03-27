package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product product = new Product();
        product.setName("Молоко");
        product.setPrice(75);

        System.out.println(product.getName() + " - " + product.getPrice());
    }
}
