public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public void addWater(boolean water) {
        brewMaster.setHasWorkToDo(water);
    }

    public void pourMilk(boolean milk) {
        iceBox.setHasWorkToDo(milk);
    }

    public void loadDishwasher(boolean dishes) {
        dishWasher.setHasWorkToDo(dishes);
    }

    public void setKitchenState(boolean water, boolean milk, boolean dishes) {
        addWater(water);
        pourMilk(milk);
        loadDishwasher(dishes);
    }

    public void doKitchenWork(boolean water, boolean milk, boolean dishes) {
        setKitchenState(water, milk, dishes);
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
