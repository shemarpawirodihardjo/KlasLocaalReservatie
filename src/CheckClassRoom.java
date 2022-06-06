import java.util.ArrayList;

public class CheckClassRoom {

//    ClassRoom[] classRooms;
    ArrayList<ClassRoom> classRooms;


    public CheckClassRoom(ClassRoom[] classRooms){
        this.classRooms = new ArrayList<ClassRoom>();
        for (ClassRoom classRoom: classRooms) {
            if (classRoom.getIsAvailable() == true){
                this.classRooms.add(classRoom);
            }
        }
    }

    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }
}
