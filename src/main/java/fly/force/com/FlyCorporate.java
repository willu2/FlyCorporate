package fly.force.com;

public class FlyCorporate {
    public static void main(String[] args) {

        ComanyBuilder comanyBuilder = new ComanyBuilder();
        MenuBuilder menu = new MenuBuilder();

        boolean exit = false;

        do {
            menu.mainManu();

            switch (menu.menuTotalPowerEnter()) {
                case 1:
                    comanyBuilder.showAllData();
                    break;
                case 2:
                    comanyBuilder.sortByDistance();
                    break;
                case 3:
                    menu.powerEnter();
                    int pos = 0;
                    pos = menu.menuTotalPowerEnter();
                    comanyBuilder.findByPower(pos);
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
