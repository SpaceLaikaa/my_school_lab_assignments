package lab_projects_Semester2.s2lab8.com.library.interfaces;

import lab_projects_Semester2.s2lab8.com.library.core.Library;

public interface LendingService {
    public Library.LoanRecord Lend(int shelfNumber, String borrowerName);
    public void returnItem(Library.LoanRecord lr);
}
