import java.util.Scanner;

public class Main {
    public static void range1_10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void range_reverse1_10() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void range_even1_100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void range_odd1_100(){
        for (int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what you want to do: ");
        String what = sc.nextLine();
        switch (what) {
            case "range1_10":
                range1_10();
                break;
            case "range_reverse1_10":
                range_reverse1_10();
                break;
            case "range_even1_100":
                range_even1_100();
                break;
            case "range_odd1_100":
                range_odd1_100();
                break;
            
        }
    }
}
