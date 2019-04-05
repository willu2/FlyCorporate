import java.util.Random;

public class FlyDb {

    public int randFuel(){
        Random random = new Random();
        int fuel = random.nextInt(300) + 100;
        return fuel;
    }

    public int randCapacity(){
        Random random = new Random();
        int capacity = random.nextInt(220) + 60;
        return capacity;
    }

    public int randRoomines(){
        Random random = new Random();
        int roomines = random.nextInt(400) + 80;
        return roomines;
    }
    public int randDistance(){
        Random random = new Random();
        int distance = random.nextInt(3400) + 200;
        return distance;
    }

}
