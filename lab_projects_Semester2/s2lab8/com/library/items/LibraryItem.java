package lab_projects_Semester2.s2lab8.com.library.items;

public abstract class LibraryItem {
    public int itemId;
    public String title;

    public LibraryItem(int itemId, String title){
        this.itemId = itemId;
        this.title = title;
    }

    public String getTitle() {return title;}
    public int getItemId() {return itemId;}

    public void setTitle(String title) {this.title = title;}
    public void setItemId(int itemId) {this.itemId = itemId;}

    @Override
    public String toString() {
        return "Library Item [ID: " + itemId + ", Title: " + title;
    }

    public abstract String getItemType();
}
