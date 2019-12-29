package Specifications;

public class Cpu {
    private int cores;
    private int frequency;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    public Cpu(int cores, int frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }


}
