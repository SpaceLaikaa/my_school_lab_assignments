package bymyself.MidTermExercise.UniversitySystem;

public class Learner implements Comparable<Learner>{

    @Override
    public int compareTo(Learner other){
        if(this.learnerId>other.learnerId){return 1;}
        if(this.learnerId< other.learnerId){return -1;}
        return 0;
    }

    public int learnerId;
    public String fullName;
    public String major;
    public int averageScore;

    public Learner(int learnerId, String fullName, String major,int averageScore){
        this.averageScore=averageScore;
        this.learnerId=learnerId;
        this.fullName=fullName;
        this.major=major;
    }

    public void setLearnerId(int learnerId) {this.learnerId = learnerId;}
    public void setFullName(String fullName){this.fullName =fullName;}
    public void setMajor(String major){this.major=major;}
    public void setAverageScore(int averageScore){this.averageScore=averageScore;}

    public int getLearnerId(){return learnerId;}
    public String getFullName(){return fullName;}
    public int getAverageScore() {return averageScore;}
    public String getMajor() {return major;}

    public void showProfile(){
        System.out.println("Learner ID: "+learnerId+"\nLearner Name: "+fullName+"\nLearner Major: "+major+"\nAvg Score: "+averageScore);
        System.out.println("=========");
    }
}
