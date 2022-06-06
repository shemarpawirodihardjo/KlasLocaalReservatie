import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckClassRoomTest {

    @BeforeEach
    void setUp() {
        ClassRoom classRoom1 = new ClassRoom(1);
        ClassRoom classRoom2 = new ClassRoom(2);
        ClassRoom classRoom3 = new ClassRoom(3);
        ClassRoom classRoom4 = new ClassRoom(4);
        ClassRoom classRoom5 = new ClassRoom(5);

        ClassRoom[] classRooms = {classRoom1, classRoom2, classRoom3, classRoom3, classRoom4, classRoom5};

        CheckClassRoom checkClassRoom = new CheckClassRoom(classRooms);
    }

    @Test
    void getClassRooms() {

    }
}