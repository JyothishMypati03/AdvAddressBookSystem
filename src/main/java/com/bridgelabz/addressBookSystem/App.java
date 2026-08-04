package com.bridgelabz.addressBookSystem;

import com.bridgelabz.addressBookSystem.model.Person;

import java.util.Scanner;

public class App {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Person jyothish = new Person();

        System.out.print("Enter First Name: ");
        jyothish.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        jyothish.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        jyothish.setAddress(scanner.nextLine());

        System.out.print("Enter City: ");
        jyothish.setCity(scanner.nextLine());

        System.out.print("Enter State: ");
        jyothish.setState(scanner.nextLine());

        System.out.print("Enter Zip: ");
        jyothish.setZip(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        jyothish.setPhoneNumber(scanner.nextLine());

        System.out.println(jyothish);

        System.out.print("Do you want to update? (y/n): ");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("y")){

            System.out.print("Enter Address: ");
            jyothish.setAddress(scanner.nextLine());

            System.out.print("Enter City: ");
            jyothish.setCity(scanner.nextLine());

            System.out.print("Enter State: ");
            jyothish.setState(scanner.nextLine());

            System.out.print("Enter Zip: ");
            jyothish.setZip(scanner.nextLine());

            System.out.print("Enter Phone Number: ");
            jyothish.setPhoneNumber(scanner.nextLine());

            System.out.println("\nUpdated Person:");
            System.out.println(jyothish);

        }

        System.out.print("Do you want to Delete person ? (y/n): ");
        String delete = scanner.nextLine();

        if(delete.equalsIgnoreCase("y")){

            jyothish = null;
            System.out.println("Person deleted successfully.");

        }

    }

}
