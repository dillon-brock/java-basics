public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (this.hasWorkToDo) {
            System.out.println("The dishwasher is washing the dishes!");
            this.hasWorkToDo = false;
        }
    }
}
