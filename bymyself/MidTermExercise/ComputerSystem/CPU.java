package bymyself.MidTermExercise.ComputerSystem;

public class CPU extends Component{
    private int cores;

    public CPU(String modelName, double price, int powerUsage, int cores){
        super(modelName,price,powerUsage);
        this.cores=cores;
    }

    @Override
    public void upgradeSpecs(){
        cores=cores*2;
    }

    @Override
    public String getType(){
        return "CPU";
    }
    @Override
    public String toString(){
        return super.toString()+" | Cores: "+cores;
    }
}
