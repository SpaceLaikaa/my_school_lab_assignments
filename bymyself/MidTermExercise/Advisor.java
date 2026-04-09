package bymyself.MidTermExercise;

public class Advisor {
    private int advisorId;
    private String advisorName;

    String[] officeItems = new String[5];

    public void placeItem(String item){
        for (int i =0;i<officeItems.length;i++){
            if (officeItems[i] == null){
                officeItems[i]=item;
                return;
            }
        }
            System.out.println("Couldn't place any item.(Probably Full)");
    }

}
