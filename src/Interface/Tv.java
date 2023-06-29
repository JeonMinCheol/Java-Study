package Interface;

public class Tv implements RemoteController{
    private int volume=0;
    @Override
    public void print() {
        System.out.println("Tv Volume: " + this.volume);
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
    }

    @Override
    public void setMute(boolean mute) {
        RemoteController.super.setMute(mute);
    }
}
