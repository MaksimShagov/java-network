import Watches.Watch1;
import Watches.Watch2;

public class Program {
    public static void main(String[] args) {
        System.out.println("Create 2 watches and print name + price");
        Watch1 watches1 = new Watch1("Watch1", 100.90);
        Watch2 watches2 = new Watch2("Watch2", 121.90);
        System.out.println(watches1.getName() + " price: " + watches1.getPrice());
        System.out.println(watches2.getName() + " price: " + watches2.getPrice());
        System.out.println();

        System.out.println("Try to set time on watches1");
        try {
            System.out.println("Desired time 10:23");
            watches1.setTime(10, 23);
            int[] time1 = watches1.getTime();
            System.out.println("Watches 1 time: " + time1[0] + ":" + time1[1]);
            System.out.println("Successfully\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Try to set time on watches2");
        try {
            System.out.println("Desired time 8:23:10");
            watches2.setTime(8, 23, 10);
            int[] time2 = watches2.getTime();
            System.out.println("Watches 2 time: " + time2[0] + ":" + time2[1] + ":" + time2[2]);
            System.out.println("Successfully\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Try to get exeption on watches1");
        try {
            System.out.println("Desired time 13:23");
            watches1.setTime(13, 23);
            System.out.println("Successfully\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }
        System.out.println("Try to get exeption on watches2");
        try {
            System.out.println("Desired time 11:100:10");
            watches2.setTime(11, 100, 10);
            System.out.println("Successfully\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

    }
}
