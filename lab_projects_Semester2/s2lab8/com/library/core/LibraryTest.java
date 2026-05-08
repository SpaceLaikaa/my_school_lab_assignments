package lab_projects_Semester2.s2lab8.com.library.core;

import lab_projects_Semester2.s2lab8.com.library.items.Book;
import lab_projects_Semester2.s2lab8.com.library.items.LibraryItem;
import lab_projects_Semester2.s2lab8.com.library.items.Magazine;

public class LibraryTest {
    public static void main(String[] args) {
        Library myLibrary = new Library("IEU");

        LibraryItem book1 = new Book(15,"Animal Farm","Osman");
        LibraryItem book2 = new Book(16,"1984","Mahmut");
        LibraryItem magazine1 = new Magazine(15,"Animal Farm",3);
        Library.Shelf shelfBook1 = myLibrary.new Shelf(1, book1, false);
        Library.Shelf shelfBook2 = myLibrary.new Shelf(2,book2,false);
        Library.Shelf shelfMagazine1 = myLibrary.new Shelf(3,magazine1,true);



    }
}
