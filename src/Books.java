public class Books {
    private String bookPath = "src/books.csv";
    private int bookID;
    private String bookName;
    private String author;
    private String publicationHouse;

    public Books(int bookID, String bookName, String author, String publicationHouse) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publicationHouse = publicationHouse;
    }


    public Books() {

    }

    public void loadBookByID(int id) {
        ReadFile reader = new ReadFile(bookPath, id);
        String result = reader.findAndReturnTarget();

        if (result != null) {
            String[] data = result.split(",");
            // Assign the CSV data to the class variables
            this.bookID = Integer.parseInt(data[0]);
            this.bookName = data[1].replace("\"", "");
            this.author = data[2].replace("\"", "");
            this.publicationHouse = data[3].replace("\"", "");
        }
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationHouse() {
        return publicationHouse;
    }

    @Override
    public String toString() {
        if (bookName==null)
            return "Book Not Found in Database!";
        return String.format(
                "Book Found!\nName: %s\nAuthor: %s\nPublisher: %s",
                bookName, author, publicationHouse
        );
    }
}
