package bymyself.MidTermExercise.UniversitySystem;

import java.util.ArrayList;

public class TutorialGroup {
    private String groupTitle;
    private String groupCode;

    ArrayList<Learner> learnerArrayList = new ArrayList<>();

    public void registerLearner(Learner I){
        learnerArrayList.add(I);
    }


}
