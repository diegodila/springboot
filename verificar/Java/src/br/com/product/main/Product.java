package br.com.product.main;

import br.com.product.entity.Entity;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Entity product = new Entity("tv",500,2);

        System.out.println(product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock:");
        System.out.println();
        int aux = sc.nextInt();
        product.AddProducts(aux);
        System.out.println("Updated data: "+product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        System.out.println();
        aux = sc.nextInt();
        product.RemoveProducts(aux);
        System.out.println("Updated data: "+product);
        System.out.println();

    }
}
