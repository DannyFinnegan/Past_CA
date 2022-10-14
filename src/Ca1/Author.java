package Ca1;

public class Author {
    private static int AuthorID;
    private int AuthorNumber;
    private String FirstName;
    private String Surname;

    public Author()
    {
        AuthorID=0;
        AuthorNumber=0;
        FirstName="Not Available";
        Surname="Not Available";
    }
    public Author(int AuthorID, int AuthorNumber, String FirstName, String Surname)
    {
        setAuthorID(AuthorID);
        setAuthorNumber(AuthorNumber);
        setFirstName(FirstName);
        setSurname(Surname);
    }

    public static int getAuthorID() {
        return AuthorID;
    }

    public int getAuthorNumber() {
        return AuthorNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public static void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public void setAuthorNumber(int authorNumber) {
        AuthorNumber = authorNumber;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String toString() {
        return
                "\nAuthorNumber= " + AuthorNumber +
                "\nFirstName= " + FirstName +
                "\nSurname= " + Surname;
    }
}
