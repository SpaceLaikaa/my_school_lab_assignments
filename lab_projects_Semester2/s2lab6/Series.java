package lab_projects_Semester2.s2lab6;

public class Series extends Content {
    int numberOfEpisodes;

    public Series (int id, String title, int baseDuration,int numberOfEpisodes){
        super(id, title, baseDuration);
        this.numberOfEpisodes=numberOfEpisodes;
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
