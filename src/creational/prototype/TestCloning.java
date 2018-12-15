package creational.prototype;

public class TestCloning {

    public static void main(String[] args) {
        CloneFactory animal = new CloneFactory();

        Sheep bobby = new Sheep();


        //Cloned sheep is created
        Sheep clonedBobby = (Sheep) animal.getClone(bobby);
    }
}
