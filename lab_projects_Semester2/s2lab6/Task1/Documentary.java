package lab_projects_Semester2.s2lab6.Task1;

public class Documentary extends Content{
    int numberOfScientistInterviews;
    int researchDepthLevel;

    public Documentary(int id, String title, int baseDuration,int numberOfScientistInterviews,int researchDepthLevel) {
        super(id, title, baseDuration);
        this.numberOfScientistInterviews=numberOfScientistInterviews;
        if(researchDepthLevel>=1&&researchDepthLevel<=5){this.researchDepthLevel =researchDepthLevel;}
        else {
            System.out.println("Research Depth Level must be between 1 - 5");
        }
    }

    @Override
    public int calculateTotalDuration() {
        return getBaseDuration()+(numberOfScientistInterviews*10);
    }

    @Override
    public String getRecommendationCategory() {
        if(researchDepthLevel>=4){return "In-Depth";} else{return "Light Informative";}
    }
}
