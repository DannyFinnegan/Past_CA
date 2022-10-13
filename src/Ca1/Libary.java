package Ca1;

public class Libary {

    private String Name;
    private String Address;
    private String Librarian;
    private int numberEmployees;
    // private String[] Books;

    public Libary() {
        Name = "Not Available";
        Address = "Not Available";
        Librarian = "Not Available";
        numberEmployees = 0;
    }

    public Libary(String Name, String Address, String Librarian, int numberEmployees) {
        setName(Name);
        setAddress(Address);
        setLibrarian(Librarian);
        setnumberEmployees(numberEmployees);
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getLibrarian() {
        return Librarian;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setLibrarian(String librarian) {
        Librarian = librarian;
    }

    public void setnumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public String toString() {
        return "Name= " + Name + "\n" + "Address= " + Address + "\n" + "Librarian= " + Librarian + "\n" + "numberEmployees= " + numberEmployees;
    }
}
