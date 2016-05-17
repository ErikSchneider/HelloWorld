/**
 * Created by Erik on 5/16/16.
 */
public class PC {
    String cpu;
    int core;
    double speed;
    int ram;
    int storage;

    public PC (String cpu, int core, double speed, int ram, int storage) {
        this.cpu = cpu;
        this.core = core;
        this.speed = speed;
        this.ram = ram;
        this.storage = storage;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String newCpu) {
        if (isIntel (newCpu)) {
            cpu = newCpu;
        }
    }
    public int getCore() {
        return core;
    }
    public void setCore(int newCore) {
        core = newCore;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int newRam) {
        ram = newRam;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int newStorage) {
        storage = newStorage;
    }
    public static boolean isIntel(String newCpu) {
        return newCpu.contains("Intel");
    }
}

