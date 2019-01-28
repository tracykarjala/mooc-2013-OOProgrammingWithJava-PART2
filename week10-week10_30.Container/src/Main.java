import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3
// but now we have our history record
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
    }

}
