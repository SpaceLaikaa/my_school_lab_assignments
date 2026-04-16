package lab_projects_Semester2.s2lab6.Task1;

import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<Content> contentArrayList = new ArrayList<>();

        Content movie1 = new Movie(15,"Graveyard Encounters",2,false);
        Content series1 = new Series(25,"Game Of Thrones",1,80);

        contentArrayList.add(series1); contentArrayList.add(movie1);


        for(Content content : contentArrayList){
            content.displayInfo();
            System.out.println("Total Duration: "+ content.calculateTotalDuration());
            System.out.println("Category: "+ content.getRecommendationCategory());
            System.out.println("=========");
        }
    }
}
