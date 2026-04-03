package lab_projects_Semester2.s2lab6;

public class Documentary extends Content{
    boolean hasPostCreditsScene;

    public Documentary(int id, String title, int baseDuration,boolean hasPostCreditsScene) {
        super(id, title, baseDuration);
        this.hasPostCreditsScene=hasPostCreditsScene;
    }

    @Override
    public int calculateTotalDuration() {
        return 0;
    }

    @Override
    public String getRecommendationCategory() {
        return "";
    }
}
