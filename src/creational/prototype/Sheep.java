package creational.prototype;

public class Sheep implements Animal{


    @Override
    public Animal makeCopy() {
        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }
}
