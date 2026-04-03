package bymyself.Old;

public class Price {
    private int lira;
    private int kurus;

    public Price(int l, int k){
        lira = l;
        kurus=k;
    }

    @Override
    public String toString(){
        return ("Price: "+lira+"."+kurus);
    }

    public void add(Price other){
        kurus += other.kurus;
    }

    class Main{
        public static void main(String[] args) {
            Price p = new Price(10,50);
            Price q = new Price(10,20);

            p.add(q);
        }
    }
}
