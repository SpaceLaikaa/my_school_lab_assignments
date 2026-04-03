package lab_projects_Semester2.s2lab6;

public class Movie extends Content{

    public Movie(int id, String title, int baseDuration) {
        super(id, title, baseDuration);
    }

    @Override
    public int calculateTotalDuration(){
        return 0;
    }

    @Override
    public String getRecommendationCategory() {
        return "";
    }
}
