

public class FlyCorporate {
    public static void main(String[] args) {

        ComanyBuilder comanyBuilder = new ComanyBuilder();
        MenuBuilder menu = new MenuBuilder();

        boolean exit = false;

        do {
            int pos = 0;


            menu.mainManu();

           // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPowerEnter()) {
                case 1:
                    comanyBuilder.showAllData();
                    break;
                case 2:
                   // comanyBuilder.showOnlyTurnOn();
                    break;
                case 3:
                    comanyBuilder.sortItemList();
                    break;
                case 4:
                    menu.powerEnter();
                    pos = menu.menuTotalPowerEnter();
                  //  comanyBuilder.findByPower(pos);
                    break;
                case 5:
                    menu.typeShow();
                    pos = menu.menuTotalPowerEnter();
                    comanyBuilder.findByType(pos);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        }while (!exit);
    }
}
