package Interface;

// 인터페이스의 추상 메서드는 public으로 기본적으로 접근 제한을 갖기 때문에
// public보다 더 낮은 접근 제한으로 재정의 할 수 없다.
// 그래서 재정의되는 메서드에는 public이 추가되어 있다.
public class Audio implements RemoteController {
    private int volume=0;

    @Override
    public void print() {
        System.out.println("Audio Volume: " + this.volume);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void setMute(boolean mute) {
        RemoteController.super.setMute(mute);
    }
}
