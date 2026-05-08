package lab_projects_Semester2.s2lab10.com.space.exceptions;

public class InsufficientFuelException extends RuntimeException {
    public InsufficientFuelException() {
        super("Not enough fuel for the mission task.");
    }

}
