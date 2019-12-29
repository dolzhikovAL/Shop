package Goods;

public class DrinkWater extends Item {


    public DrinkWater(int id, int value, String name, String explanation, int prise) {
        super(id, value, name, explanation, prise);

    }

    @Override
    public void show() {
        super.show();
    }

    public static DrinkWater createOne() {
        DrinkWater item = (DrinkWater) Item.addOne();
        return item;
    }
}