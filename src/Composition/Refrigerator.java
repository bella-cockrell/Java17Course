package Composition;

public class Refrigerator {
    private boolean hasWorkToDo = false;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food (milk)");
            hasWorkToDo = false;
        } else {
            System.out.println("Not ordering any food");
        }
    }

    public void setHasWorkToDo(boolean busy) {
        this.hasWorkToDo = busy;
    }

}
