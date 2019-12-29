package Specifications;

public class TechSpecificationPhone {
    private String baseOS;
    private Ram ram;
    private Cpu cpu;
    private double screenDiagonal;
    private int batteryWorkTime;


    public TechSpecificationPhone(String baseOS, Ram ram, Cpu cpu, double screenDiagonal, int batteryWorkTime) {
        this.baseOS = baseOS;
        this.ram = ram;
        this.cpu = cpu;
        this.screenDiagonal = screenDiagonal;
        this.batteryWorkTime = batteryWorkTime;
    }

    public String getBaseOS() {
        return baseOS;
    }

    public void setBaseOS(String baseOS) {
        this.baseOS = baseOS;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getBatteryWorkTime() {
        return batteryWorkTime;
    }

    public void setBatteryWorkTime(int batteryWorkTime) {
        this.batteryWorkTime = batteryWorkTime;
    }


}
