package Specifications;

 public class VideoCard extends Cpu {
    public Ram getVideoRam() {
        return videoRam;
    }

    public void setVideoRam(Ram videoRam) {
        this.videoRam = videoRam;
    }

    private Ram videoRam;

    public VideoCard(int cores, int frequency, Ram videoRam) {
        super(cores, frequency);
        this.videoRam = videoRam;

    }


}
