public class RunComputerFactory {


public static void main(String[] args) {
    RunComputerFactory runComputerFactory = new RunComputerFactory();
}

    public RunComputerFactory(){
    ComputerFactory laptop;
    laptop = new ComputerFactory('s',0,0,0, "laptop", "Cow Pattern", true);
    laptop.printInfo();

    ComputerFactory monitor;
    monitor = new ComputerFactory ('l',250,100,250,"monitor", "Tie Dye", false);
    monitor.printInfo();



}


}
