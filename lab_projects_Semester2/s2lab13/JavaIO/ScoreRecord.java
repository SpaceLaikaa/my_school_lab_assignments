package lab_projects_Semester2.s2lab13.JavaIO;

public class ScoreRecord {
    private String name;
    private String score;

    public String getScore() {return score;}
    public String getName() {return name;}

    public void setScore(String score) {this.score = score;}
    public void setName(String name) {this.name = name;}

    public ScoreRecord(String name, String score) {
        this.name = name;
        this.score = score;
    }
}
