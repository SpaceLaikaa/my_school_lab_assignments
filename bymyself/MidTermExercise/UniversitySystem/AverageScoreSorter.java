package bymyself.MidTermExercise.UniversitySystem;

import java.util.Comparator;

public class AverageScoreSorter implements Comparator<Learner> {

    @Override
    public int compare(Learner l1, Learner l2){//descending
        if(l1.averageScore<l2.averageScore){return 1;} //if returns 1 left one is bigger
        if(l1.averageScore>l2.averageScore){return -1;}
        return 0;
    }
}
