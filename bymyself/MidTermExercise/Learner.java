package bymyself.MidTermExercise;

public class Learner {
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


}
