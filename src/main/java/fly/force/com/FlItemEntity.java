package fly.force.com;

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
    private int roominess;
    private int loadCapacity;
    private int fuel;
    private Integer distance;

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

    public Integer getDistance() {
        return distance;
    }


    public Integer getRoominess() {
        return roominess;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public ItemFlyType getItemFlyType() {
        return itemFlyType;
    }

    @Override
    public String toString() {
            return "Fl [distance=" + distance + "]";
        }

    @Override
    public int compareTo(FlItemEntity o) {
            return this.getDistance().compareTo(o.getDistance());
        }
}


