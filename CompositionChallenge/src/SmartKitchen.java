public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator fridge;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.fridge = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void addWater() {
        System.out.println("Adding water to the coffee maker...");
        this.coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        System.out.println("Pouring milk...");
        this.fridge.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        System.out.println("Loading dishwasher...");
        this.dishWasher.setHasWorkToDo(true);
    }

    public void doKitchenWork() {
        this.coffeeMaker.brewCoffee();
        this.dishWasher.doDishes();
        this.fridge.orderFood();
    }
}
