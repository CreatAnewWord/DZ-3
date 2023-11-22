package ZXCBULL;
// startElectricity()
//    //
//    //	- startCommand()
//    //
//    //	- startFuelSystem()
public class Car {


    public static void main(String[] args){
        Start();
    }
    public static void Start(){
        startCommand();
    }
    private static void tartElectricity(){
        System.out.println("Електрика запущена...");
    }
    private static void startCommand(){
        tartElectricity();
        startFuelSystem();
    }
    private static void startFuelSystem(){
        System.out.println("Авто запущено.");
    }




}
