public class Monkey implements Living {

    private String name;
    private String favFood;
    private String sound;
    private double height;
    private double weight;
    private double speed;

    @Override
    public void setName(String newName) {
        name = newName;
    };
    @Override
    public String getName() {
        return name;
    };

    @Override
    public void setHeight(double newHeight) {
        height = newHeight;
    };
    @Override
    public double getHeight() {
        return height;
    };

    @Override
    public void setWeight(double newWeight) {
        weight = newWeight;
    };
    @Override
    public double getWeight() {
        return weight;
    };

    @Override
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    };
    @Override
    public double getSpeed() {
        return speed;
    };

    @Override
    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    };
    @Override
    public String getFavFood() {
        return favFood;
    };

    @Override
    public void setSound(String newSound) {
        sound = newSound;
    };
    @Override
    public String getSound() {
        return sound;
    };
}
