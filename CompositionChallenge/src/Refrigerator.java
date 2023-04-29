public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (this.hasWorkToDo) {
            System.out.println("The fridge is ordering food!");
            this.hasWorkToDo = false;
        }
    }
}
