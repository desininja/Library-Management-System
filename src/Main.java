import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System (LMS)");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bookID you want to find.");
        int bookID = sc.nextInt();

        Books myBook = new Books();
        myBook.loadBookByID(bookID);
        System.out.println(myBook);


    }
}