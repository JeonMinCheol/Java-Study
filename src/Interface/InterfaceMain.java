package Interface;

public class InterfaceMain {

    public static void main(String[] args) {
        RemoteController rc;
        RemoteController.changeBattery();

        rc = new Tv();
        rc.setMute(false);
        rc.print();

        rc = new Audio();
        rc.setMute(true);
        rc.print();
    }

}
