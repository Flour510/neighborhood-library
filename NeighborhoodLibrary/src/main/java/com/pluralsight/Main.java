package com.pluralsight;

import java.util.Scanner;

public class Main {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create an array of books here
        Book[] books =
        {

                new Book(1, 510, "Guide to Political Revolution", false, ""),
                new Book(2, 511, "Rich Dad Poor Dad", false, ""),
                new Book(3, 512, "The Subtle Art of Not Giving a F", false, ""),
                new Book(4, 513, "The Rose That Grew From Concrete", false, ""),
                new Book(5, 514, "Can't Hurt Me", false, ""),
                new Book(6, 515, "You Are Your Child's First Teacher", false, ""),
                new Book(7, 516, "Retire Inspired", false, ""),
                new Book(8, 517, "I'm Glad My Mom Died", false, ""),
                new Book(9, 518, "The Last Black Unicorn", false, ""),
                new Book(10, 519, "The Four Agreements", false, ""),
                new Book(11, 520, "The Bible", false, ""),
                new Book(12, 521, "The Whole-Brain Child", false, ""),
                new Book(13, 522, "Manifesting", false, ""),
                new Book(14, 523, "Profit First", false, ""),
                new Book(15, 524, "Atomic Habits", false, ""),
                new Book(16, 525, "365 Days of Kindness", false, ""),
                new Book(17, 526, "The Body Keeps The Score", false, ""),
                new Book(18, 527, "Html & Css Quickstart Guide", false, ""),
                new Book(19, 528, "Twilight", false, ""),
                new Book(20, 529, "Twilight New Moon", false, "")

        };

        int choice = 0;
        while(choice != 4)
        {
            // print the home screen
            System.out.println();
            System.out.println("Welcome to your Neighborhood Library! (^_^)");
            System.out.println();
            System.out.println("Home ");
            System.out.println("-----------------------------------------");
            System.out.println("What do you want to do? ");
            System.out.println();
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("3 - Check In a Book");
            System.out.println("4 - Exit");
            System.out.println();
            System.out.println("Choose an option below: ");
            choice = Integer.parseInt(userInput.nextLine());

            switch(choice)
            {
                case 1:
                    // call the list all books (pass the array)
                    listAvailableBooks(books);
                    break;
                case 2:
                    // call the search by checked out books
                    searchByCheckedOut(books);
                    break;
                case 3:
                    // call the search by check in books
                    addBook(books);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Goodbye! Come again :) ");
                    return; // is this all I had to do to fix this?

                default:
                    System.out.println();
                    System.out.println("Bruh... Invalid selection");
                    break;
            }


        }

    }

    public static void listAvailableBooks(Book[] books)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Available Books");
        System.out.println("-----------------------------------------");

        // loop through books and print all
        for (Book book : books) {
            if (!book.getIsCheckedOut()) {
                System.out.printf("%-5d %-5s %-5s\n", book.getId(), book.getIsbn(), book.getTitle());
            }
        }

        // prompt user to make a choice
        System.out.println();
        System.out.println("What would you like to do Human? (-.-) ");
        System.out.println("C) Select a Book to Check Out");
        System.out.println("X) Exit - Return to Home Screen");

        // handle user input here
        String choice = scanner.nextLine();
        switch (choice.toUpperCase()){
            case "C":
                selectBookToCheckOut(books);
                break;
            case "X":
                System.out.println("Returning to Home Screen... ");
                break;
            default:
                System.out.println("Bruh... Invalid Choice. Please try again. ");
                listAvailableBooks(books);
                break;
        }
    }

    public static void selectBookToCheckOut(Book[] books)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the book you want to check out: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        // find the selected book ID
        Book selectedBook = null;
        for (Book book : books) {
            if (book.getId() == bookId) {
                selectedBook = book;
                break;
            }
        }

        // checks if the book was found and not already checked out
        if (selectedBook != null && !selectedBook.getIsCheckedOut()) {
            System.out.println("Enter your name to check out the book: ");
            String borrowerName = scanner.nextLine();
            selectedBook.setCheckedOutTo(borrowerName);
            selectedBook.setIsCheckedOut(true);

            System.out.println("Book checked out successfully to " + borrowerName + ".");
        } else {
            System.out.println("Book is already checked out. ");
        }
    }


    public static void searchByCheckedOut(Book[] books)
    {
        Scanner scanner = new Scanner(System.in);

        // get user search criteria
        System.out.println();
        System.out.println("Currently Checked Out Books");
        System.out.println("-----------------------------------------");
        System.out.println();

        // loop through books and print out only checked out books
        for (Book book : books) {
            if (book.getIsCheckedOut())
            {
                System.out.printf("%-5d %-5s %-5s %-5s\n", book.getId(), book.getIsbn(), book.getTitle(), ", CHECKED OUT BY: " + book.getCheckedOutTo());
            }
        }


        // prompt user to make a choice
        System.out.println();
        System.out.println("What would you like to do Human? ");
        System.out.println("C) - Check In a Book");
        System.out.println("X) - Return to the Home Screen");
        System.out.println();
        String choice = scanner.nextLine();

        // process the choice
        switch (choice.toUpperCase()) {
            case "C":
                addBook(books);
                break;
            case "X":
                System.out.println("Returning to Home Screen... ");
                break;
            default:
                System.out.println("Invalid choice. Please try again. ");
                break;
        }


    }

    public static void addBook(Book[] books)
    {
        // get user input
        System.out.println();
        System.out.println("Enter Returned Book Information Here: ");
        System.out.println("-------------------------------------------");
        System.out.println("Enter the Id of the book you're checking in: ");
        int id = Integer.parseInt(userInput.nextLine());

        // update the book information and add it back to the array
        for (Book book : books) {
            if (book.getId() == id) {
                book.setIsCheckedOut(false);
                book.setCheckedOutTo(" ");
                System.out.println("Book checked in successfully!");
                return;
            }
        }

        System.out.println("Book with specified ID not found. ");

    }


}