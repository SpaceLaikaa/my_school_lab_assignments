package second_year_labs.lab3;

import java.util.Arrays;

class LLNode
{
    private int element;
    private LLNode nextElement;
    private LLNode prevElement;

    public LLNode(int element)
    {
        this.element = element;
        this.nextElement = null;
        this.prevElement = null;
    }

    public LLNode(int element, LLNode nextElement, LLNode prevElement) {
        this.element = element;
        this.nextElement = nextElement;
        this.prevElement = prevElement;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public LLNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(LLNode nextElement) {
        this.nextElement = nextElement;
    }

    public LLNode getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(LLNode prevElement) {
        this.prevElement = prevElement;
    }
}

class CDLinkedList
{
    // Member variables
    private LLNode headNode;
    private LLNode tailNode;
    private int size;

    // Class constructor
    public CDLinkedList(int headValue, int tailValue) {
        this.headNode = new LLNode(headValue);
        this.tailNode = new LLNode(tailValue);
        initializeLinksAndCircularity();
        this.size = 2;
    }

    // Setters & Getters
    public LLNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(LLNode headNode) {
        this.headNode = headNode;
    }

    public LLNode getTailNode() {
        return tailNode;
    }

    public void setTailNode(LLNode tailNode) {
        this.tailNode = tailNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Given methods
    public void addElement(int data)
    {
        LLNode newNode = new LLNode(data);

        if (getSize() < 0)
        {
            System.out.println("Illegal size (<0). There must a wrong operation in size calculation.");
            return;
        }

        else if (getSize() == 0 || getSize() == 1)// (this.headNode == null && this.tailNode == null)
        {
            System.out.println("There must be something wrong, since size cannot be 0 or 1 at any time.");
            return;
        }
        else
        {
            getTailNode().setNextElement(newNode);
            newNode.setPrevElement(getTailNode());
            newNode.setNextElement(getHeadNode());
            getHeadNode().setPrevElement(newNode);
            setTailNode(newNode);
            setSize(getSize() + 1);

        }
    }

    public void printCDLL()
    {
        LLNode temp = getHeadNode();
        int increase = String.valueOf(temp.getElement()).length() - 3;
        for (int i = 0; i < getSize(); i++)
        {
            if (temp != getTailNode())
            {
                System.out.print(temp.getElement() + " --> ");
                temp = temp.getNextElement();
                increase = increase + 2 + (String.valueOf(temp.getElement()).length() - 1);
            }
            else
            {
                System.out.println(temp.getElement() + ".");
                if (getTailNode().getNextElement().equals(getHeadNode()))
                    printCircularNextConnection(increase);
                else
                    System.out.println("No circular connection.");
            }

        }
    }

    public void printCDLLBackwards()
    {
        LLNode temp = getTailNode();
        int increase = String.valueOf(temp.getElement()).length() - 3;
        for (int i = getSize(); i > 0; i--)
        {
            if (temp != getHeadNode())
            {
                System.out.print(temp.getElement() + " <-- ");
                temp = temp.getPrevElement();
                increase = increase + 2 + (String.valueOf(temp.getElement()).length() - 1);
            }
            else
            {
                System.out.println(temp.getElement());
                if (getHeadNode().getPrevElement().equals(getTailNode()))
                    printCircularPrevConnection(increase);
                else
                    System.out.println("No circular connection.");
            }

        }
    }

    private void printCircularNextConnection(int increase)
    {
        char[] data = new char[getSize() * 4 + (increase - 1)];
        char c = '-';
        Arrays.fill(data, c);
        data[0] = '^';
        data[data.length - 1] = '|';
        System.out.println(new String(data));
    }

    private void printCircularPrevConnection(int increase)
    {
        char[] data = new char[getSize() * 4 + (increase - 1)];
        char c = '-';
        Arrays.fill(data, c);
        data[0] = '|';
        data[data.length - 1] = '^';
        System.out.println(new String(data));
    }

    // TODO:
    private void initializeLinksAndCircularity()
    {
        if (getHeadNode() != null){
            tailNode.setPrevElement(getHeadNode());
            headNode.setNextElement(getTailNode());

            tailNode.setNextElement(getHeadNode());
            headNode.setPrevElement(getTailNode());
        }
    }

    // TODO:
    public boolean swapElements(int index) {
        LLNode realIndex = getHeadNode();

        for (int i = 0; i < index; i++) {
            realIndex = realIndex.getNextElement();
        }

        if (realIndex == getHeadNode() || realIndex == getTailNode() || realIndex.getPrevElement() == getTailNode()) {
            return false;
        } else {
            LLNode tempNextElement = realIndex.getNextElement();

            realIndex.setNextElement(tempNextElement);
            realIndex = tempNextElement;


            return true;
        }
    }


    public int getElement ( int position, boolean isBackwards)
    {
        LLNode tail = getTailNode();
        LLNode head = getHeadNode();

        if(position < 0 || position >= getSize()){return -1;}

        if (isBackwards){
            for (int i = 0; i < getSize()-1-position; i++) {
                tail = tail.getPrevElement();
            }

            return tail.getElement();
        } else {
            for (int i = 0; i < position; i++) {
                head = head.getNextElement();
            }

            return head.getElement();
        }
    }
}
