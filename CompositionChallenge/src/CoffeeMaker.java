public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (this.hasWorkToDo) {
            System.out.println("The coffee maker is brewing coffee!");
            this.hasWorkToDo = false;
        }
    }
}
