package bymyself.MidTermExercise.ComputerSystem;

public class FactoryDemo {
    public static void main(String[] args) {
        Component ram = new RAM("DDR5",30.000,5,16);
        Component gpu = new GPU("RTX 3600",10.000,8,32);
        Component cpu = new CPU("Intel I7",15.000,15,8);


        System.out.println(ram.toString());
        System.out.println(gpu.toString());
        System.out.println(cpu.toString());

        Computer d1 = new Desktop(15, "lenovo",15);
        Computer l1 = new Laptop(12,"HP",12);
        d1.addComponent(ram);
        d1.addComponent(cpu);
        l1.addComponent(ram);
        l1.addComponent(cpu);
        System.out.println(d1.toString());


    }
}
