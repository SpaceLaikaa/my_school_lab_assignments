package second_year_labs.warmup_lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Request {
    private int id;
    private String owner;
    private int priority;

    public Request(int id, String owner, int priority) {
        this.id = id;
        this.owner = owner;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + owner + ", priority " + priority + "]";
    }
}

class RequestPriorityComparator implements Comparator<Request> {
    @Override
    public int compare(Request first, Request second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}

class HelpDeskManager {
    private ArrayList<Request> requests;
    private HashSet<Integer> activeIds;

    public HelpDeskManager() {
        requests = new ArrayList<Request>();
        activeIds = new HashSet<Integer>();
    }

    public boolean addRequest(Request request) {
        if (request == null || request.getPriority()<1||activeIds.contains(request.getId()))
        {return false;}
        else{
            activeIds.add(request.getId());
            requests.add(request);
            requests.sort(new RequestPriorityComparator());

            return true;
        }
    }

    public HashMap<Integer, Integer> countRequestsByPriority() {
        // TODO Task 3: Count the requests at each priority level.
        return new HashMap<Integer, Integer>();
    }

    public boolean containsUsingList(int requestId) {
        // TODO Task 4: Search requests one by one without using activeIds.
        return false;
    }

    public boolean containsUsingSet(int requestId) {
        // TODO Task 4: Search for requestId using activeIds.
        return false;
    }

    // This helper method is provided for Task 5.
    public void printRequests() {
        for (Request request : requests) {
            System.out.println(request);
        }
    }
}

public class LabWarmUpI {
    public static void main(String[] args) {
        // TODO Task 5:
        // 1. Create a HelpDeskManager.
        // 2. Add at least four requests. At least two must have the same priority.
        // 3. Try to add a request with a duplicate ID.
        // 4. Print the requests using printRequests().
        // 5. Print the result of countRequestsByPriority().
        // 6. Test both search methods with an existing ID.
        // 7. Test both search methods with an ID that does not exist.
    }
}
