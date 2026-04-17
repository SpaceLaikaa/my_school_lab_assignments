package lab_projects_Semester2.s2lab8.com.library.items;

public class Book extends LibraryItem{
    private String author;

    public Book(int itemId, String title,String author){
        super(itemId, title);
        this.author=author;
    }

    @Override
    public String getItemType(){
        return "Book";
    }

    @Override
    public String toString(){
        return super.toString()+", Author: "+author+"]";
    }
}
