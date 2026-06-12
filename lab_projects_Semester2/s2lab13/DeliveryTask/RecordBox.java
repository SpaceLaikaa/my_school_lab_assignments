package lab_projects_Semester2.s2lab13.DeliveryTask;

public class RecordBox<T> {
    private T[] records;

    public RecordBox(T[] records) {
        this.records = records;
    }

    public void printAll(){
        System.out.println("Record box: ");
        for(T array : records){
            System.out.println(array);
        }
    }
}
