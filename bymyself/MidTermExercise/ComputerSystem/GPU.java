package bymyself.MidTermExercise.ComputerSystem;

public class GPU extends Component{
    double memorySize;
    public GPU(String modelName,double price,int powerUsage,double memorySize){
        super(modelName,price,powerUsage);
        this.memorySize=memorySize;
    }

    @Override
    public void upgradeSpecs(){memorySize=memorySize*2;}
    @Override
    public String getType(){
        return "GPU";
    }
    @Override
    public String toString(){
        return super.toString()+" | Memory Size: "+memorySize;
    }
}
