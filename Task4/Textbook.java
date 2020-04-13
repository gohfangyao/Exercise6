import java.util.Scanner;

public class Textbook {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        String title, myBook="";
        double price,highestprice=0;

        System.out.print("Total number of books: ");
        num = sc.nextInt();
        Book [] myLibrary = new Book[num];

        for (int i=0;i<myLibrary.length;i++){
            sc.nextLine();
            System.out.println();
            System.out.print("Book's Title: ");
            title = sc.nextLine();
            System.out.print("Book's Price: ");
            price = sc.nextDouble();

            myLibrary[i] = new Book(title,price);

            if (myLibrary[i].getPrice()>highestprice){
            	highestprice = myLibrary[i].getPrice();
                myBook = myLibrary[i].getTitle();
            }
        }
        System.out.printf("%nThe highest price of book : \n"+ "\""+ myBook +"\""+" which is RM "+"%.2f%n",highestprice);
        System.out.println("Books with “Java” in title :");
        
        for(int j=0;j<myLibrary.length;j++){
            if(myLibrary[j].getTitle().indexOf("Java")!=-1)
                System.out.println(myLibrary[j].getTitle());
        }
    }
}
class Book {
    private String title;      
    private double price;      

    public Book(String title, double price) {
        title = title;
        price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
}
