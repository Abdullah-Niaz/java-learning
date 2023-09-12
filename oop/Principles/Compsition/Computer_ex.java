package oop.Principles.Compsition;

class GPU{
    public void Process(){
        System.out.println("GPU is Processing!");
    }
}
class CPU{
    public void Loading_Data(){
        System.out.println("Data is Loading!");
    }
}
class Hard_Drive{
    public void Data_Storing(){
        System.out.println("Data is being stored in Hard Drive");
    }
}



class Computer{
    GPU gpu;
    CPU cpu;
    Hard_Drive hard_Drive;

    Computer(){
        gpu = new GPU();
        cpu = new CPU();
        hard_Drive = new Hard_Drive();
    }

    public void Computer_Testing(){
        gpu.Process();
        cpu.Loading_Data();
        hard_Drive.Data_Storing();
    }
}
public class Computer_ex {
    public static void main(String[] args){
        Computer com = new Computer();
        com.Computer_Testing();
    }
    
}
