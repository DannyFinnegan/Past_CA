package Ca1;

public class Book {
    private String ISBN;
    private String Title;
    private String Publisher;
    //private String[] Author;
    private int numberCopies;

    public Book() {
        ISBN = "Not Available";
        Title = "Not Available";
        Publisher = "Not Available";
        numberCopies = 0;
    }

    public Book(String ISBN, String Title, String Publisher, int numberCopies) {
        setISBN(ISBN);
        setTitle(Title);
        setPublisher(Publisher);
        setnumberCopies(numberCopies);
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }


    public String getPublisher() {
        return Publisher;
    }

    public int getnumberCopies() {
        return numberCopies;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setnumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public String toString() {
        return "\nISBN= " + ISBN  +
                "\nTitle= " + Title +
                "\nPublisher= " + Publisher +
                "\nNumber of Copies= " + numberCopies;
    }
}
