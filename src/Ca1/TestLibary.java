package Ca1;

import javax.swing.*;

public class TestLibary {


    public static void main(String[] args) {
        String output = "";
        Libary L1 = new Libary();
        Libary L2 = new Libary("Kerry Library","Killarney ","Nathans Mom",12);
        Book B1 = new Book();
        Book B2 = new Book("IS2264520","Harry Potter","Random",18);
        Author A1=new Author();
        Author A2=new Author(1, 1,"Joe","Bloogs");

        output +="Quick Test Run\n"+L1+B1+A1;
        output += "\n\nTest Run 2 \n"+L2+B2+A2;
        JOptionPane.showMessageDialog(null,output,"Testing 1...2...3...",JOptionPane.INFORMATION_MESSAGE);

        //Uncomment the code below when you have the Author class written

        /*Author a1 = new Author("Harvey","Deitel");
        Author a2 = new Author("Brian","Kernighan");
        Author a3 = new Author("Robert","Martin");
        Author a4 = new Author("Quentin","Charatan");
        Author a5 = new Author("Paul","Deitel");
        Author a6 = new Author("Aaron","Kans");
        Author a7 = new Author("C. Thomas","Wu");
        Author a8 = new Author("Jeffrey","Listfield");
        Author a9 = new Author("Dennis","Ritchie");
        Author a10 = new Author("Bjarne","Stroustrup");*/


        //You'll be adding more code to the driver here


    }
}
