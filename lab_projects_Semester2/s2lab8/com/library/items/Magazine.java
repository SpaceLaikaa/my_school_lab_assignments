package lab_projects_Semester2.s2lab8.com.library.items;

public class Magazine extends LibraryItem{
    public int issueNumber;

    public Magazine(int itemId, String title,int issueNumber){
        super(itemId, title);
        this.issueNumber=issueNumber;
    }

    @Override
    public String getItemType(){
        return "";
    }

    @Override
    public String toString(){
        return super.toString()+", Issue Number: "+issueNumber+"]";
    }
}
