package bymyself.FinalExercise;

public class InvalidEmissionDataException extends RuntimeException{
    public InvalidEmissionDataException(String message){
        System.out.println(message);
    }
}
