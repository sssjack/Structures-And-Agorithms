package controller.Factory;

public class Test {

    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Ford");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车。。。");
        }
    }
}
