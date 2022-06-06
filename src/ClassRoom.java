import java.text.DateFormat;
import java.util.ArrayList;

public class ClassRoom {
    private int classRoomNumber;
    private boolean isAvailable;
    private DateFormat[] availableWindow;

    public ClassRoom(int classRoomNumber){
        this.classRoomNumber = classRoomNumber;
        this.isAvailable = true;
        this.availableWindow = new DateFormat[2];
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }
}
