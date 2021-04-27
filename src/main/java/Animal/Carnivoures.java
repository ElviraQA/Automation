package Animal;

import Food.Food;
import Food.Meat;

public abstract class Carnivoures extends Animal{
    protected Carnivoures(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            int feedRate = food.getFeedRate();
            satiety += feedRate;
            System.out.printf("%s покормили %s и оно востановило %d голода\n", name, food.getName(), feedRate);
        } else {
            System.out.printf("%s не может есть %s\n", name, food.getName());
        }
    }
}
