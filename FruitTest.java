class Fruit {
    private double price;
    private String name;
    public Fruit(double price, String name) {
        this.price = price; this.name = name;
    }
    public Fruit(Fruit f) { // copy constructor
        this.price = f.price;
        this.name = f.name;
    }
    public String showName() { return name; }
    public double showPrice() { return price; }
   }
public class FruitTest {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(3.9, "Ruby Roman");
        Fruit f2 = new Fruit(f1);
        System.out.println(f1.showName());
        System.out.println(f2.showName());
    }}


