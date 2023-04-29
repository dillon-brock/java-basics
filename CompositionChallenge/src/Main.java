public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();


        smartKitchen.pourMilk();
        smartKitchen.loadDishwasher();
        smartKitchen.doKitchenWork();

        smartKitchen.addWater();
        smartKitchen.doKitchenWork();
    }
}
