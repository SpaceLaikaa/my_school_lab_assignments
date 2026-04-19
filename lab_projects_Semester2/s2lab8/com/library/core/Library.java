package lab_projects_Semester2.s2lab8.com.library.core;

import lab_projects_Semester2.s2lab8.com.library.interfaces.LendingService;
import lab_projects_Semester2.s2lab8.com.library.items.LibraryItem;
import java.util.HashMap;

public class Library implements LendingService {
    private String libraryName;
    HashMap<Integer, Shelf> shelves;

    public Library(String libraryName){
        this.libraryName=libraryName;
        this.shelves = new HashMap<>();
    }

    public void addShelf(Shelf shelf){
        shelves.put(shelf.shelfNumber, shelf);
    }
    public void calculateLateFee(LoanRecord lr){
        lr.borrowFee=(lr.borrowedDayCount)*2;
    }
    public void printLibraryStatus(){System.out.println(shelves);}

    @Override
    public LoanRecord Lend(int shelfNumber, String borrowerName){
        Shelf shelf1 = shelves.get(shelfNumber);
        LibraryItem item = shelf1.getStoredItem();
        LoanRecord newRecord = new LoanRecord(borrowerName, shelf1, item);
        return newRecord;
    }

    @Override
    public void returnItem(LoanRecord lr){
        LibraryItem item = lr.getBorrowedItem();
        Shelf originalShelf = lr.getShelf();
        originalShelf.setStoredItem(item);

        calculateLateFee(lr);

        System.out.println("Item " + item.getTitle() +
                " has been returned to the library. The fee of " +
                lr.getBorrowFee() + " has been paid");
    }

    public static class LoanRecord{
        private String borrowerName;
        private Shelf shelf;
        private LibraryItem borrowedItem;
        private int borrowedDayCount;
        private double borrowFee;

        public LoanRecord(String borrowerName, Shelf shelf, LibraryItem borrowedItem){
            this.borrowerName=borrowerName;
            this.shelf = shelf;
            this.borrowedItem=borrowedItem;
        }

        public double getBorrowFee() {return borrowFee;}
        public int getBorrowedDayCount() {return borrowedDayCount;}
        public LibraryItem getBorrowedItem() {return borrowedItem;}
        public Shelf getShelf() {return shelf;}
        public String getBorrowerName() {return borrowerName;}

        public void setBorrowedItem(LibraryItem borrowedItem) {this.borrowedItem = borrowedItem;}
        public void setBorrowerName(String borrowerName) {this.borrowerName = borrowerName;}
        public void setBorrowFee(double borrowFee) {this.borrowFee = borrowFee;}
        public void setBorrowedDayCount(int borrowedDayCount) {this.borrowedDayCount = borrowedDayCount;}
        public void setShelf(Shelf shelf) {this.shelf = shelf;}
    }

    public class Shelf{
        private int shelfNumber;
        private LibraryItem storedItem;
        private boolean isReferenceOnly;


        public Shelf(int shelfNumber, LibraryItem storedItem,boolean isReferenceOnly){
            this.shelfNumber=shelfNumber;
            this.storedItem=storedItem;
            this.isReferenceOnly=isReferenceOnly;
        }

        public int getShelfNumber() {return shelfNumber;}
        public LibraryItem getStoredItem() {return storedItem;}
        public boolean getIsReferenceOnly(){return isReferenceOnly;}

        public void setReferenceOnly(boolean referenceOnly) {isReferenceOnly = referenceOnly;}
        public void setShelfNumber(int shelfNumber) {this.shelfNumber = shelfNumber;}
        public void setStoredItem(LibraryItem storedItem) {this.storedItem = storedItem;}

        @Override
        public String toString(){
            return "Shelf [Shelf NO: "+shelfNumber+", Stored Item: "+storedItem+"]";
        }
    }
}
