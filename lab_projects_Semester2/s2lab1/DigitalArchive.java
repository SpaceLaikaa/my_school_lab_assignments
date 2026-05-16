package lab_projects_Semester2.s2lab1;
import java.util.Scanner;
import java.util.Random;

//MAIN CLASS
public class DigitalArchive {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        

        Book book1 = new Book("978-35-3003", "Animal Farm", 280, 10);
        Book book2 = new Book("957-94-5044", "Dorian Gray's Portrait", 350, 22);
        Book book3 = new Book("856-95-3456", "No Longer Human", 145, 7);
        Book book4 = new Book("456-89-5043", "JoJo's Bizarre Adventure", 760, 50);//For addBook method

        Book[] initialBooks = new Book[5];
        initialBooks[0] = book1;
        initialBooks[1] = book2;
        initialBooks[2] = book3;

        Librarian librarian = new Librarian(22, "Zehra", 18, initialBooks);

        for (Book b : librarian.showArchive()) {
            if (b != null) { // null error handler
                b.displayBooks();
                System.out.println();
            }
        }
        System.out.println("====================");
        System.out.println("Adding New Books");
        librarian.addBook(book4);
        System.out.println("====================");
        System.out.println("New book list");

        for (Book b : librarian.showArchive()) {
            if (b != null) {
                b.displayBooks();
                System.out.println();
            }
        }
        System.out.println("====================");

        System.out.println("Would you like to remove a book? Please write which book you want to remove.(ISBN Number)");
        String userRemoveChoice = sc.nextLine();
        librarian.removeBook(userRemoveChoice);
        for (Book b : librarian.showArchive()) {
            if (b != null) {
                b.displayBooks();
                System.out.println();
            }
        }

        System.out.println("Write which book you want to make discount on.(ISBN and %, one by one)");
        String userIsbnChoice = sc.nextLine();
        double userDiscountChoice = sc.nextDouble();

        for(Book findDiscountBooks : librarian.showArchive()){
            if (findDiscountBooks != null &&  findDiscountBooks.getISBN().equals(userIsbnChoice)&&userDiscountChoice>0){
                librarian.findBookAndApplyDiscount(userIsbnChoice,userDiscountChoice);
                return;
            }
        }

     }
    }









        // ASSIGNMENT WANTS ME TO USE REMOVE AND  UPDATE PRICE METHODS TOGETHER IN A SINGLE METHOD.
//        System.out.println("====================");
//        System.out.println("Which book do you want to find?(ISBN Number)");
//        String userFindBookChoice= sc.nextLine();
//        librarian.findBook(userFindBookChoice);
//        System.out.println("=======\n");
//
//
//
//        System.out.println("Would you like to update a price? Please write which book you want to remove.(ISBN Number)");
//        double userUpdatePriceChoice = sc.nextDouble();
//        for (Book initialBook : initialBooks) {
//            if (initialBook != null && userUpdatePriceChoice == initialBook.getPrice()) {
//                librarian.updatePrice(initialBook, userUpdatePriceChoice);
//                return;
//            }
//            System.out.println("No such book as " + userUpdatePriceChoice);
//        }


