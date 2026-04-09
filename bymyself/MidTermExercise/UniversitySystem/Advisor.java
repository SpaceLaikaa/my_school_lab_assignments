package bymyself.MidTermExercise.UniversitySystem;

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

    public void deleteItem(String item){
        for(int i =0;i<officeItems.length;i++){
            if(officeItems[i]!=null && officeItems[i].equalsIgnoreCase(item)){
                for (int j = i;j<officeItems.length-1;j++){
                    officeItems[j] = officeItems[j+1];
                }
                officeItems[officeItems.length - 1] = null;
                System.out.println("Successfully deleted item. ("+item+")");
                return;
            }

        }
    }

    public void hasItem(String item){
        for (int i =0;i<officeItems.length;i++){
            if(officeItems[i]!=null&&officeItems[i].equalsIgnoreCase(item)){
                System.out.println(item + " is in stock.");
                return;
            }
        }
        System.out.println("No item such as " +item);
    }

    public void listItems(){
        for (String items : officeItems){
            if(items != null){
                System.out.println(items);
            }
            else{return;}
        }
    }
}
