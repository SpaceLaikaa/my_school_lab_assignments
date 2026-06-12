package lab_projects_Semester2.s2lab13.DeliveryTask;

public class RecordBox<T> {
    private T[] records;

    public RecordBox(T[] records) {
        this.records = records;
    }

    public void printAll(){
        System.out.println("==Record box==");
        for(T array : records){
            System.out.println(array);
        }
    }

    public T getRecord(int index){
        if(index<0|| index >= records.length){
            throw new ArrayIndexOutOfBoundsException("Requested index " + index + " is out of bounds for array length " + records.length);
        }

        return records[index];
    }

    public int getSize(){
        return records.length;
    }
}
