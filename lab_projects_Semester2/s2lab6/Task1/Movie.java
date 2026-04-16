package lab_projects_Semester2.s2lab6.Task1;

public class Movie extends Content{
    boolean hasPostCreditScene;
    public Movie(int id, String title, int baseDuration,boolean hasPostCreditScene) {
        super(id, title, baseDuration);
        this.hasPostCreditScene = hasPostCreditScene;
    }

    @Override
    public int calculateTotalDuration(){
        if(hasPostCreditScene){return getBaseDuration();} else{return getBaseDuration();}
    }

    @Override
    public String getRecommendationCategory() {
        if(getBaseDuration()<90){return "Short Watch";}
        else{return "Feature Length";}
    }
}
