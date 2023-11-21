public class DishWasher {
    private boolean hasWorkToDo = false;

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes");
            hasWorkToDo = false;
        } else {
            System.out.println("Not washing any dishes");
        }
    }

    public void setHasWorkToDo(boolean busy) {
        this.hasWorkToDo = busy;
    }
}
