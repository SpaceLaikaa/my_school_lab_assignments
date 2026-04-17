package lab_projects_Semester2.s2lab6.Task1;

public class Series extends Content {
    private int numberOfEpisodes;

    public Series (int id, String title, int baseDuration,int numberOfEpisodes){
        super(id, title, baseDuration);
        this.numberOfEpisodes=numberOfEpisodes;
    }

    @Override
    public int calculateTotalDuration(){
        return getBaseDuration()*numberOfEpisodes;
    }

    @Override
    public String getRecommendationCategory() {
        if(numberOfEpisodes>=10){return "Binge Worthy";} else{return "Mini Series";}
    }
}
