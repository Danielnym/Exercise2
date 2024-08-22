public interface Operate {
    void start();
}

interface Maintain {
    void service();
    boolean needsService();
    //void replaceBattery();
}

class Airplane implements Operate, Maintain {
    String name, model;
    int flightHours;
    boolean isOperational;

    Airplane (String name, String model, int flightHours, boolean isOperational) {
        this.name = name;
        this.model = model;
        this.flightHours = flightHours;
        this.isOperational = isOperational;
    }
    public void start() {
        if (!isOperational) {
            isOperational = true;
            System.out.println("Airplane " + name + " is operational");
        }
        else {
            isOperational = false;
            System.out.println("Airplane " + name + " is not operational");
        }
    }
    public void service() {
        if (!Service) {
            Service=tr
            System.out.println("Airplane " + name + " needs service");
        }
        else {
            System.out.println("Airplane " + name + " no service needed");
        }
    }

    public boolean needsService() {
        if (isOperational) {
            return false;
        }
        System.out.println("Airplane " + name + " doesnt need service");
    }

    public int flightHours(int flightHours, int time) {
        return flightHours * time;
    }
}
class Drone implements Operate, Maintain {
    String name, model;

    int batteryLevel;
    int totalFlightTime;

    public void start() {
        System.out.println();
    }

    public void service() {
        System.out.println();
    }

    public boolean needsService() {
        return true;
    }

    public void replaceBattery() {

    }

}
