package fly.force.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuilder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all flights ");
        System.out.println(" 2 :> Show by distance  >>> ");
        System.out.println(" 3 :> Find avia by fuel >>> >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void powerEnter(){
        System.out.println("Enter your fuel count:");
    }

    public int menuTotalPowerEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
