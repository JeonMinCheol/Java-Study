package Interface;

// 인터페이스에서는 타입 변수, 메서드 명만 기입. 나머지는 알아서 정해짐.
public interface RemoteController {
    // 추상 필드
    int MAX_VOULUME = 10; // public static final이 앞에 붙어있음.
    int MIN_VOULUME = 0;

    // 추상 메서드
    void print(); // public abstract가 앞에 붙어있음.
    void setVolume(int volume);

    // 디폴트 메서드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
            setVolume(MIN_VOULUME);
        }
        else{
            System.out.println("무음 해제");
            setVolume(MAX_VOULUME);
        }
    }

    static void changeBattery(){
        System.out.println("배터리 교체");
    }
}
