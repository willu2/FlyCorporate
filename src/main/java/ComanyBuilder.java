import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComanyBuilder {

    private FlyDb flyDb = new FlyDb();
    public List<FlItemEntity> getStouncDB() {
        return houseData;
    }

    private List<FlItemEntity> houseData = new ArrayList<>();

    public ComanyBuilder(){
        createCompany();
    }

    private void createCompany(){
        FlItemEntity entity;
        for (int i = 0; i < flyDb.getRoomArray().length; i++){
            entity = new FlItemEntity(flyDb., flyDb.randPower(), FlItemEntity.ItemFlyType.AIRBUS_300, flyDb.randIsOn() );
            houseData.add(entity);
       }
    }

    public void showAllData(){
        for (Iterator<FlItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            printItemList(item);
        }
    }



    public void findByType(int type){
        for (Iterator<FlItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            FlItemEntity item = it.next();
            if(item.getItemFlyType() == FlItemEntity.ItemFlyType.values()[type-1] ){
                printItemList(item);
            }
        }
    }

    public void findByDistance(int distance){
        //for (Iterator<FlItemEntity> it = houseData.iterator(); it.hasNext(); ) {
            for (FlItemEntity item : houseData) {
                //printItemList(color);
                        //FlItemEntity item = it.next();
            if(item.getPower() == distance){
                printItemList(item);
            }
        }
    }

    public void sortItemList(){
        Collections.sort(houseData);
        IterationPrint(houseData);
    }

    private void IterationPrint(List<FlItemEntity> stouncDB){
        for (Iterator<FlItemEntity> it = stouncDB.iterator(); it.hasNext(); ) {
            FlItemEntity stoneItem = it.next();
            printItemList(stoneItem);
        }
    }
    private void printItemList(FlItemEntity flItemEntity){
        System.out.print("Name:> " + flItemEntity.getItemFlyType());

        System.out.print("  ||_Power:> " + flItemEntity.getPower() + " Watt" );
        System.out.print("  ||_Type:> " + flItemEntity.getItemFlyType());
        System.out.print("  ||_TurnOn:> " + flItemEntity.isOn());
        System.out.println();
    }
 }
