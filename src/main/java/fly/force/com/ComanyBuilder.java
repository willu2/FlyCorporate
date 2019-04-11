package fly.force.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComanyBuilder {

    private FlyDb flyDb = new FlyDb();
    private List<FlItemEntity> companyData = new ArrayList<>();
    private int airCounts = 50;

    public ComanyBuilder(){
        createCompany();
    }

    //create random company data
    private void createCompany(){
        FlItemEntity entity;
        for (int i = 0; i < airCounts; i++){
            entity = new FlItemEntity(FlItemEntity.ItemFlyType.getFlType(), flyDb.randRoomines(),
                    flyDb.randCapacity(), flyDb.randFuel(), flyDb.randDistance() );
            companyData.add(entity);
       }
    }

    public void showAllData(){
        int roomi = 0;
        int capas = 0;
        for (Iterator<FlItemEntity> it = companyData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            roomi += item.getRoominess();
            capas += item.getLoadCapacity();
            printItemList(item);
        }
        System.out.println("All roominess = " + roomi + " items");
        System.out.println("All capacity = " + capas + " tones");
    }

    public void findByType(int type){
        for (Iterator<FlItemEntity> it = companyData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            if(item.getItemFlyType() == FlItemEntity.ItemFlyType.values()[type-1] ){
                printItemList(item);
            }
        }
    }

    public void findByPower(int fuel){
            for (FlItemEntity item : companyData) {
            if(item.getFuel() <= fuel){
                printItemList(item);
            }
        }
    }

    public void sortByDistance(){
        Collections.sort(companyData);
        IterationPrint(companyData);
    }

    private void IterationPrint(List<FlItemEntity> flyDB){
        for (Iterator<FlItemEntity> it = flyDB.iterator(); it.hasNext(); ) {
            FlItemEntity stoneItem = it.next();
            printItemList(stoneItem);
        }
    }
    private void printItemList(FlItemEntity flItemEntity){
        System.out.print("Type:> " + flItemEntity.getItemFlyType());
        System.out.print("  ||_Roomines:> " + flItemEntity.getRoominess() + " items" );
        System.out.print("  ||_Capacity:> " + flItemEntity.getLoadCapacity());
        System.out.print("  ||_Fuel:> " + flItemEntity.getFuel());
        System.out.print("  ||_Distance:> " + flItemEntity.getDistance());
        System.out.println();
    }
 }
