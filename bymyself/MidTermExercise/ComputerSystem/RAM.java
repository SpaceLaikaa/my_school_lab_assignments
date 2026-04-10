package bymyself.MidTermExercise.ComputerSystem;

public class RAM extends Component{
    int capacityGB;
    public RAM(String modelName,double price,int powerUsage,int capacityGB){
        super(modelName,price,powerUsage);
        this.capacityGB=capacityGB;
    }

    @Override
    public void upgradeSpecs(){capacityGB=capacityGB*2;}
    @Override
    public String getType(){
        return "RAM";
    }
    @Override
    public String toString(){
        return super.toString()+" | Capacity GB: "+capacityGB;
    }
}

