public class CoffeeMaker {
    private boolean hasWorkToDo = false; //this could be manually set when
    //// class is instantiated by including a constructor

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        } else {
            System.out.println("Not brewing coffee");
        }
    }

    public void setHasWorkToDo(boolean busy) {
        this.hasWorkToDo = busy;
    }
}
