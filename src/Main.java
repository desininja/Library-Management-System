public class Main {
    public static void main(String[] args) {

        Books myBook = new Books();
        myBook.loadBookByID(100);
        System.out.println(myBook);

    }
}