package Specifications;

public class TechSpecificationPC {


    private Ram ram;
    private Cpu cpu;
    private VideoCard videoCard;

    public TechSpecificationPC(Ram ram, Cpu cpu, VideoCard videoCard) {
        this.ram = ram;
        this.cpu = cpu;
        this.videoCard = videoCard;
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

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }


}
