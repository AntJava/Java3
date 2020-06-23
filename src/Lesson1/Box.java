package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();
    private float weight = 0.0f;

    public Box(T... fruits){
        ArrayList<T> box = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight(){
        this.weight = 0.0f;
        for(T f : box) this.weight += f.getWeight();
        return this.weight;
    }

    public void addFruit(T fruit, int quantity){
        for(int i=0; i < quantity; i++){
            box.add(fruit);
        }
    }

    public boolean compare(Box otherBox) {
        if(this.getWeight() == otherBox.getWeight()) return true;
        return false;
    }

    public void toOtherBox(Box <T>otherBox){
        otherBox.box.addAll(box);
        box.clear();
    }
}
