import java.util.Random;

public class FlItemEntity implements Comparable<FlItemEntity>{

        enum ItemFlyType {
            BOING_737,
            BOING_757,
            AIRBUS_300,
            AN_225,
            AN_22,
            AN_74,
            IL_76;

            public static ItemFlyType getFlType() {
                Random random = new Random();
                return values()[random.nextInt(values().length)];
            }
        }

    private ItemFlyType itemFlyType;
    private Integer power;
    private int roominess;
    private int loadCapacity;
    private int fuel;
    private int distance;

    private boolean isOn;

    public FlItemEntity() {
    }

    public FlItemEntity(ItemFlyType type, int roominess, int loadCapacity, int fuel, int distance ) {

        this.itemFlyType = type;
        this.roominess = roominess;
        this.loadCapacity = loadCapacity;
        this.fuel = fuel;
        this.distance = distance;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Integer getRoominess() {
        return roominess;
    }

    public void setRoominess(int roominess) {
        this.roominess = roominess;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

   public boolean isOn() {
        return isOn;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public ItemFlyType getItemFlyType() {
        return itemFlyType;
    }

    @Override
    public String toString() {
            return "Item [power=" + power + "]";
        }

    @Override
    public int compareTo(FlItemEntity o) {
            return this.getPower().compareTo(o.getPower());
        }
}


