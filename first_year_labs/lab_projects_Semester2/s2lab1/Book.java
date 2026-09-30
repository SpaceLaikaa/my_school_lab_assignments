package first_year_labs.lab_projects_Semester2.s2lab1;

public class Book {
    private String isbn; //International Standard Book Number
    private String title;
    private int pageCount;
    private double price; //Yeah, it is double.

    public Book(String isbn, String title, int pageCount, double price){
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void displayBooks(){
        System.out.printf("ISBN: %s | Title: %s | Page Count: %d | Price: $%f",isbn,title,pageCount,price);
    }

    //IDK if We are going to use setter and getter methods but lab Wants it(probably just for a reminder )
    public String  getISBN(){return isbn;}
    public String getTitle(){return title;}
    public int getPageCount(){return pageCount;}
    public double getPrice(){return price;}

    public void setISBN(String  isbn){this.isbn = isbn;}
    public void setTitle(String title){this.title = title;}
    public void setPageCount(int pageCount){this.pageCount = pageCount;}
    public void setPrice(double price){this.price = price;}
}
