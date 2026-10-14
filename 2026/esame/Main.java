package esame;

public class Main {
    
    public static void main(String[] args) {
        
        Sound s = new Sound(2000, 2000);
        s.put(1200.541);
        s.put(800.214);
        s.put(200.111);
        s.put(-200.365);
        s.put(-800.475);
        s.put(-1200.369);
        System.out.println(s.get(2));
        System.out.println(s.isAPointOfinversion(2));
        System.out.println(s.isAPointOfinversion(0));
        printArray(s.between(-500, 500));

    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
