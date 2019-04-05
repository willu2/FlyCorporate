import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComanyBuilder {


    private FlyDb flyDb = new FlyDb();
    private List<FlItemEntity> companyData = new ArrayList<>();
    private int airCounts = 50;

    public List<FlItemEntity> getStouncDB() {
        return companyData;
    }

    public ComanyBuilder(){

        createCompany();
    }

    private void createCompany(){
        FlItemEntity entity;
        for (int i = 0; i < airCounts; i++){
            entity = new FlItemEntity(FlItemEntity.ItemFlyType.getFlType(), flyDb.randRoomines(),
                    flyDb.randCapacity(), flyDb.randFuel(), flyDb.randDistance() );
            companyData.add(entity);
       }
    }

    public void showAllData(){
        for (Iterator<FlItemEntity> it = companyData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            printItemList(item);
        }
    }

    public void findByType(int type){
        for (Iterator<FlItemEntity> it = companyData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            if(item.getItemFlyType() == FlItemEntity.ItemFlyType.values()[type-1] ){
                printItemList(item);
            }
        }
    }

    public void findByDistance(int distance){
        //for (Iterator<FlItemEntity> it = companyData.iterator(); it.hasNext(); ) {
            for (FlItemEntity item : companyData) {
                //printItemList(color);
                        //FlItemEntity item = it.next();
            if(item.getPower() == distance){
                printItemList(item);
            }
        }
    }

    public void sortItemList(){
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
        System.out.println();
    }
 }
