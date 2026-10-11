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
        if (request == null || request.getPriority() < 1 || activeIds.contains(request.getId())) {
            return false;
        } else {
            activeIds.add(request.getId());
            requests.add(request);
            requests.sort(new RequestPriorityComparator());

            return true;
        }
    }

    public HashMap<Integer, Integer> countRequestsByPriority() {
        // TODO Task 3: Count the requests at each priority level.
        HashMap<Integer, Integer> priorityCounts = new HashMap<>();

        for (Request r : requests) {
            int priority = r.getPriority();
            priorityCounts.put(priority, priorityCounts.getOrDefault(priority, 0) + 1);

        }
        return priorityCounts;
    }

    public boolean containsUsingList(int requestId) {
        for (Request r : requests) {
            if (r.getId() == requestId) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUsingSet(int requestId) {
        // TODO Task 4: Search for requestId using activeIds.
        return activeIds.contains(requestId);
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

        HelpDeskManager manager1 = new HelpDeskManager();
        Request request1 = new Request(1, "Arda", 1);
        Request request2 = new Request(2, "Adda", 3);
        Request request3 = new Request(3, "Anda", 2);
        Request request4 = new Request(4, "Amda", 1);
        Request duplicateIdRequest = new Request(1, "Arda", 1);

        manager1.addRequest(request1);
        manager1.addRequest(request2);
        manager1.addRequest(request3);
        manager1.addRequest(request4);
        manager1.addRequest(duplicateIdRequest);

        manager1.printRequests();
        manager1.countRequestsByPriority();
        if(manager1.containsUsingList(3)){
            System.out.println("Contains");
        } else {
            System.out.println("null");
        }

        if(manager1.containsUsingSet(5)){
            System.out.println("Yes");
        } else{
            System.out.println("?");
        }


        // 1. Create a HelpDeskManager.
        // 2. Add at least four requests. At least two must have the same priority.
        // 3. Try to add a request with a duplicate ID.
        // 4. Print the requests using printRequests().
        // 5. Print the result of countRequestsByPriority().
        // 6. Test both search methods with an existing ID.
        // 7. Test both search methods with an ID that does not exist.
    }
}
