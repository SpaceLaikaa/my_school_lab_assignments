package lab_projects_Semester2.s2lab8.com.library.core;

import lab_projects_Semester2.s2lab8.com.library.items.LibraryItem;
import java.util.HashMap;

public class Library {
    private String libraryName;
    HashMap<Integer, Shelf> shelves;

    public Library(String libraryName){
        this.libraryName=libraryName;
        this.shelves = new HashMap<>();
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
