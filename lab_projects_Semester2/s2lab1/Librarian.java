package lab_projects_Semester2.s2lab1;

public class Librarian {
    public int bookCount=0;
    private int employeeID;
    private String name;
    private int age;
    private Book[] books;

    public Librarian(int employeeID, String name, int age,Book[] comingBooks) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.books = new Book[5];

        if (comingBooks != null) {
            for (int i = 0; i < comingBooks.length && i < 5; i++) {
                if (comingBooks[i] != null) {   
                    this.books[bookCount] = comingBooks[i];
                    bookCount++;
                }
            }
        }
    }
    public void addBook(Book addBook){
        if(bookCount >= 5){System.out.println("Archive is full!");}
        else{books[bookCount]=addBook;
            bookCount++;
            System.out.println( addBook.getTitle()+" has been added to archive.");
        }
    }
    public void removeBook(String isbn){
        for(int i =0;i<books.length;i++){
            if(books[i]!=null && books[i].getISBN().trim().equalsIgnoreCase(isbn)){
                System.out.println(books[i].getTitle() + " deleted from the archives.");

                books[i]=null;
                bookCount--;
                return;//break
            }
        }
        System.out.println("No ISBN such as " + isbn+"\n=======");}

    public Book[] showArchive() {
        return books;
      }

      public Book findBook(String isbn){
        for(int i =0;i<books.length;i++){
            if(books[i]!=null && books[i].getISBN().trim().equalsIgnoreCase(isbn)){
                books[i].displayBooks();
                return books[i];
            }
        }
          System.out.println("No ISBN such as "+isbn);
          return null;
      }
      public void updatePrice(Book book, double newPrice){
          for (int i = 0; i < books.length; i++) {
              if(books[i]!=null && book==books[i]){
                  book.setPrice(newPrice);
                  return;
              }
          }
      }

      public void findBookAndApplyDiscount(String isbn, double discountPercentage){
        Book usersBook=findBook(isbn);
        double usersBookPrice=usersBook.getPrice();
        usersBookPrice=usersBookPrice*((100-discountPercentage)/100);
        updatePrice(usersBook,usersBookPrice);
          System.out.println("\nNew price "+usersBookPrice);
          showArchive();
      }
}



