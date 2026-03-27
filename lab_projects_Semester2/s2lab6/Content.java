package lab_projects_Semester2.s2lab6;

public abstract class Content {
    private int id;
    private String title;
    private int baseDuration; //Minutes

    public Content(int id, String title, int baseDuration){
        this.id = id;
        this.title=title;
        this.baseDuration =baseDuration;
    }

    public int getBaseDuration() {return baseDuration;}
    public int getId() {return id;}
    public String getTitle() {return title;}

    public void setBaseDuration(int baseDuration) {this.baseDuration = baseDuration;}
    public void setId(int id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}

    public void displayInfo(){
        System.out.println("Content ID: "+id+" Title: "+title+" Base Duration: "+baseDuration);
    }

    public abstract int calculateTotalDuration();//total watch time minutes
    public abstract String getRecommendationCategory(); //rec label for content
}

