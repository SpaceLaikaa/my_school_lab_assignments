    package bymyself.MidTermExercise.UniversitySystem;

    import java.util.ArrayList;
    import java.util.Collections;

    public class TutorialGroup {
        private String groupTitle;
        private String groupCode;

        ArrayList<Learner> members = new ArrayList<>();

        public void registerLearner(Learner I){
            members.add(I);
            Collections.sort(members);
            Collections.sort(members,new AverageScoreSorter()); // when We add AverageScoreSorter it takes that classes Comparable method
        }

        public void dropLearner(String id){
            for(int i=0;i<members.size();i++){
                if(String.valueOf(members.get(i).getLearnerId()).equalsIgnoreCase(id)){
                    members.remove(i);
                    System.out.println("Student ("+id+") removed successfully.");
                    return;
                }
            }
            System.out.println("Couldn't find "+id);
        }
    }
