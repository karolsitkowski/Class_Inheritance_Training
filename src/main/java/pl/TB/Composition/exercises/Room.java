package pl.TB.Composition.exercises;

import pl.TB.Composition.training.Dimensions;

import java.time.Clock;

/**
 * Created by sit0 on 26.05.17.
 */
public class Room {

    Dimensions roomDiemension;
    RoomWindow bigWindow;
    RoomWindow smallWindow;

    Door roomDoor;
    Carpet roomCarpet;
    Sofa roomSofa;
    pl.TB.Composition.exercises.Clock roomClock;

    public Room(Dimensions roomDiemension, RoomWindow bigWindow, RoomWindow smallWindow, Door roomDoor, Carpet roomCarpet, Sofa roomSofa, pl.TB.Composition.exercises.Clock roomClock) {
        this.roomDiemension = roomDiemension;
        this.bigWindow = bigWindow;
        this.smallWindow = smallWindow;
        this.roomDoor = roomDoor;
        this.roomCarpet = roomCarpet;
        this.roomSofa = roomSofa;
        this.roomClock = roomClock;
    }
}
